package cn.ebatech.imixpark.wifi.rest;

import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cn.ebatech.imixpark.common.util.CommonUtil;
import cn.ebatech.imixpark.wifi.service.User_InfoService;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;

@Path("wifi")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class User_InfoRestServiceImpl implements User_InfoRestService{
	 private static final org.slf4j.Logger logger = LoggerFactory.getLogger(User_InfoRestServiceImpl.class);

	    @Autowired
	    private User_InfoService user_InfoService;

		public void setUser_InfoService(User_InfoService user_InfoService) {
			this.user_InfoService = user_InfoService;
		}
	  String code="";     //状态码
	  String message="";   //返回消息
	  
	@POST
    @Path("editPwd")
	@Override
	public Map<String, Object> editUserPwd(Map<String, Object> parameters) {
		try {
			int state= user_InfoService.editUserPwd(parameters);
			if(state==1){
				code="00";
				message="保存密码成功";
			}else{
				code="11";
				message="修改密码失败";
			}
			
		} catch (Exception e) {
			
			message="修改密码失败";
			
		}
		return CommonUtil.returnObjectMap(code, message, "user", null);
	}
    

}
