package cn.ebatech.imixpark.user.rest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.common.json.JSONObject;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.ruijie.cloud.Exception.CloudException;
import com.ruijie.cloud.config.CloudConfig;
import com.ruijie.cloud.service.SmsService;

import cn.ebatech.imixpark.common.model.user.User;
import cn.ebatech.imixpark.common.util.CommonUtil;
import cn.ebatech.imixpark.user.service.UserInfoService;

@Path("userinfo")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class UserInfoRestServiceImpl implements UserInfoRestService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserInfoRestServiceImpl.class);
	private static final String URL="http://baas.ruijieyun.com/";   //短信平台url
	private static final String USER_NAME="darongcheng";
	private static final String PASSWORD="ruijie123";
	private static final String MSG_CONTENT="大融城手机登录验证码为:";
	
	@Autowired
	private UserInfoService userInfoService ;
	
	@POST
	@Path("login")
	@Override             //普通登录方法,只输入用户名和密码
	public Map<String, Object> userLogin(Map<String, Object> param) {
		User u =new User();
		try {
			System.out.println(param);
			u = userInfoService.userLogin(param);
			System.out.println(u);
		} catch (Exception e) {
			e.printStackTrace();
			return CommonUtil.returnObjectMap("-1", "用户名或密码错误", "userinfo", null);
		}
		return CommonUtil.returnObjectMap("00", "登录成功", "userinfo", u);
	}

	@GET
	@Path("validate/{phoneNumber}")
	@Override                   //快速登录，手机号和验证码登录
	public Map<String, Object> validateTel(@PathParam("phoneNumber")String user_tel) {
		User u=new User();
		String phoneNumber=user_tel;
		int random=0;
		Date d=new Date();
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		try {
			u=userInfoService.validateTel(user_tel);    //验证用户时候已经注册
			if(u!=null){          //如果已注册返回已注册提示
				return CommonUtil.returnObjectMap("-1", "手机号已注册", "user", u);
			}else{           //如果没注册
				try {
					random=sendValidate(phoneNumber);           //发送验证码
					try {
						Map<String, Object> map=new HashMap<String, Object>();
						map.put("user_validate_number", random);
						map.put("user_vn_createtime", df.format(d));
						map.put("user_tel", user_tel);
						System.out.println("random"+random+"-------date"+df.format(d)+"------user_tel"+user_tel);
						userInfoService.insertValidateNum(map);     //验证码插入数据库
					} catch (Exception e) {
						e.printStackTrace();
						return CommonUtil.returnObjectMap("-1", "验证码保存失败", "user", null);
					}
				} catch (Exception e) {
					return CommonUtil.returnObjectMap("-1", "发送失败", "msgContent", null);
				}
				//返回带验证码信息的对象
				return CommonUtil.returnObjectMap("00", "发送成功", "msgContent", userInfoService.validateTel(user_tel));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return CommonUtil.returnObjectMap("-1", "异常", "user", null);
		}	
		
	}

	@POST
	@Path("register")
	@Override                       //注册,同时往验证码表中插入数据
	public Map<String, Object> registerUser(Map<String, Object> params) {
		try {
			System.out.println(params);
			userInfoService.registerUser(params);
			userInfoService.insertValidateNum(params);
		} catch (Exception e) {
			e.printStackTrace();
			return CommonUtil.returnObjectMap("-1", "注册失败", "user", null);
		}
		return CommonUtil.returnObjectMap("00", "注册成功", "user", "");
	}
    
	@POST
	@Path("update")
	@Override                //昵称默认update成手机号
	public Map<String, Object> updateUserInfo(Map<String, Object> params) {
		int state=0;
		try {
			state=userInfoService.updateUserInfo(params);
		} catch (Exception e) {
			e.printStackTrace();
			return CommonUtil.returnObjectMap("-1", "更新失败", "user", state);
		}
		return CommonUtil.returnObjectMap("00", "更新成功", "user", state);
	}
	
	
	private int sendValidate(String phonenum){
		int random=CommonUtil.getRandom();
		String msgContent=MSG_CONTENT+random;
		System.out.println(msgContent);
		CloudConfig config=new CloudConfig();
		config.setUserName(USER_NAME);
		config.setPassword(PASSWORD);
		config.setUrl(URL);
		com.alibaba.fastjson.JSONObject params=new com.alibaba.fastjson.JSONObject();
		params.put("phoneNumber", phonenum);
		params.put("msgContent", msgContent);
		params.put("outlet", "短信充值提醒");
		params.put("outletType", "");
		params.put("outletAddress", "");
		
		try {
			SmsService.sendSms(config, params);
		} catch (CloudException e) {
			System.out.println(e.getErrorCode() + "================:"
					+ e.getErrorDiscription());
			e.printStackTrace();
		}
		return random;
	}

	@POST
	@Path("sendvalidate")
	@Override
	public Map<String, Object> insertValidateNum(Map<String, Object> params) {
		
		try {
			userInfoService.insertValidateNum(params);
		} catch (Exception e) {
			e.printStackTrace();
			return CommonUtil.returnObjectMap("-1", "验证码错误", "error", null);
		}
		return CommonUtil.returnObjectMap("00", "验证码获取成功", "send_validate", "");
	}
	

}
