package cn.ebatech.imixpark.user.rest;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.Min;
import javax.ws.rs.PathParam;

import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import cn.ebatech.imixpark.common.model.user.LogIntegral;
import cn.ebatech.imixpark.common.model.user.User;
import cn.ebatech.imixpark.common.model.user.VIPCard;
import cn.ebatech.imixpark.common.model.user.uMessage;

import java.util.List;
import java.util.Map;

/**
 * This interface acts as some kind of service broker for the original UserService
 *
 * http://localhost:8888/user/1.json
 * http://localhost:8888/user/1.xml
 *
 */
public interface UserRestService {

    /**
     * the request object is just used to test jax-rs injection.
     */
	
	/**
	 * 
	 * @param Cardno 会员卡号
	 * @return 会员信息
	 */
	public uMessage findVipInfo(int Cardno);
	/**
	 * 
	 * @param 用户ID
	 * @return 用户信息
	 */
	public uMessage findUserInfo(int userID);
	
	/**
	 * 
	 * @param  昵称、性别、生日、会员ID
	 * @return 
	 */
	public uMessage updateUserInfo(int userID, String Alias, String sex, String Birthday);

	/**
	 * 
	 * @param userID
	 * @return 
	 */
	public uMessage findUserCps(int userID,int begin,int end);
	
	public uMessage findUserInts(int userID,int begin,int end);

	public uMessage updateIcon(MultipartFormDataInput st);
	
	
	

	/**
	 * 已知原密码并对密码进行修改
	 * @param parameters
	 * @return 参数说明：userId 用户id，pwd 原密码，newpwd 新密码	
	 * 
	 */
	Map<String, Object> editUserPwd(Map<String, Object> parameters);
	
	 

}
