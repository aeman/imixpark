package cn.ebatech.imixpark.user.rest;

import cn.ebatech.imixpark.common.model.user.BaShop;
import cn.ebatech.imixpark.common.model.user.Consumption;
import cn.ebatech.imixpark.common.model.user.Integral;
import cn.ebatech.imixpark.common.model.user.LogIntegral;
import cn.ebatech.imixpark.common.model.user.Message;
import cn.ebatech.imixpark.common.model.user.User;
import cn.ebatech.imixpark.common.model.user.VIPCard;
import cn.ebatech.imixpark.common.model.user.uMessage;
import cn.ebatech.imixpark.common.util.CommonUtil;
import cn.ebatech.imixpark.user.service.UserService;
import cn.ebatech.imixpark.user.webService_fj.sendws;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;

import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.xml.ws.Holder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

@Path("users")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
@Produces({ ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8 })
public class UserRestServiceImpl implements UserRestService {

	private static final Logger logger = LoggerFactory
			.getLogger(UserRestServiceImpl.class);


	private static final int SUCCESS = 0;
	private static final int ERROR = 0;


	@Autowired
	private UserService userService;

	public void bs2localDB() {
		System.out.println("Quartz的任务调度！！！同步");
		List<BaShop> bs = userService.findAll();
		userService.BaShops2localDB(bs);
		System.out.println(bs.size());
	}

	@POST
	@Path("editPwd")
	@Override
	public Map<String, Object> editUserPwd(Map<String, Object> parameters) {

		String code = ""; // 状态码
		String message = ""; // 返回消息
		String pwd = userService.getPwd(Integer.parseInt(parameters.get(
				"userId").toString()));

		if (parameters.get("pwd").toString().equals(pwd)) {

			try {
				int state = userService.editUerPwd(parameters);
				if (state == 1) {
					code = "00";
					message = "保存密码成功";
				} else {
					code = "11";
					message = "修改密码失败";
				}

			} catch (Exception e) {

				message = "修改密码失败";

			}

		} else {
			code = "11";
			message = "输入密码与原密码不符";
		}

		return CommonUtil.returnObjectMap(code, message, "user", null);
	}



	@GET
	@Path("findVipInfo/{userID}")
	@Override
	public uMessage findVipInfo(@PathParam("userID") int userID) {
		uMessage ums=new uMessage();
		try {
			User user = userService.getUser(userID);
			System.out.println(user);
			if (user == null) return null;
			Message ms = sendws.send6003(Arrays.asList(sendws.FINDBYVIPNO, user.getCardno()));
			String[] msArray = ms.outputpara2Array();
			user.setVipCard(new VIPCard(msArray));
			ums.setUser(user);
			ums.setCode(SUCCESS);
		} catch (ParseException e) {
			ums.setMessage("系统繁忙，请稍后再试");
			ums.setCode(ERROR);
		}
		return ums;
	}
	@GET
	@Path("findUserInfo/{userID}")
	@Override
	public uMessage findUserInfo(@PathParam("userID") int userID) {
		uMessage ums=new uMessage();
		User user= userService.getUser(userID);
		if(user==null){
			ums.setCode(ERROR);
			ums.setMessage("没有这个用户！");
		}
		ums.setUser(user);
		return ums;
	}
	@GET
	@Path("updateUserInfo")
	@Override
	public uMessage updateUserInfo(int userID, String Alias, String sex,
			String Birthday) {
		User user = userService.getUser(userID);
		uMessage ums=uMessage.findMsg();
		if(user==null){
			ums.setCode(ERROR);
			ums.setMessage("系统繁忙 ！请稍后重试");
			return ums;
		}
		user.setAlias(Alias);
		user.setSex(sex);
		user.setBirthday(Birthday);
		userService.saveUser(user);
		return ums;
	}
	@GET
	@Path("findUserCps/{userID}/{begin}/{end}")
	@Override
	public uMessage findUserCps(@PathParam("userID") int userID,
			@PathParam("userID") int begin, @PathParam("userID") int end) {
		uMessage ums=uMessage.findMsg();
		User user = userService.getUser(userID);
		if (user == null) {
			ums.setCode(ERROR); ums.setMessage("系统错误");
			return ums;
		}
		Message ms = sendws.send6006(Arrays.asList(user.getCardno(),
				user.getCard_no(), user.getTel()));

		String[] ps = ms.outputpara2List();
		if (ps == null || ps.length == 0)
			return null;
		for (String string : ps) {
			Consumption cn;
			try {
				cn = new Consumption(string.split("\t"));
				user.getCps().add(cn);
			} catch (ParseException e) {
				e.printStackTrace();
				ums.setCode(ERROR); ums.setMessage("系统错误");
				return ums;
			}
		}
		
		return ums;
	}


	@GET
	@Path("updateIcon")
	@Override
	public uMessage updateIcon(MultipartFormDataInput input) {
		uMessage ums=uMessage.findMsg();
		try {
			SimpleDateFormat formt = new SimpleDateFormat("yyyy/MM");
			String str = formt.format(new Date());
			File directory = new File("iconFile" + str);
			String name = directory.getCanonicalPath();
			System.out.println(directory.exists());
			if (!directory.exists()) {
				directory.mkdirs();
			}
			userService.updateIcon(input, name);
		} catch (IOException e) {
			ums.setCode(ERROR); ums.setMessage("系统错误");
			return ums;
		}
		return ums;
	}
	@GET
	@Path("findUserInts/{userID}/{beginNo}/{pageNo}")
	@Override
	public uMessage findUserInts(int userID, int begin, int end) {
		uMessage ums=uMessage.findMsg();
		User user = userService.getUser(userID);
		String vipNo = user.getCardno();
		List<Integral> ls = userService.selLogIntegrals(vipNo);
		user.setIntegrals(ls);
		ums.setUser(user);
		return ums;
	}

}
