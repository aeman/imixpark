package cn.ebatech.imixpark.wifi.rest;

import java.util.Map;

import cn.ebatech.imixpark.common.model.user.Suggestion;
/**
 * 用户建议接口
 * @author issuser
 *
 */
public interface SuggestionRestService {
	/**
	 * 用户添加APP使用建议
	 * @param parameters
	 * @return 成功或失败
	 * 参数说明：Context 建议，Tel 电话，CreatDate 时间	
	 */
	Map<String, Object> saveSuggestion(Map<String, Object> parameters);
	/**
	 * 已知原密码并对密码进行修改
	 * @param parameters
	 * @return 参数说明：userId 用户id，pwd 原密码，newpwd 新密码	
	 * 
	 */
	Map<String, Object> editUserPwd(Map<String, Object> parameters);
	

}
