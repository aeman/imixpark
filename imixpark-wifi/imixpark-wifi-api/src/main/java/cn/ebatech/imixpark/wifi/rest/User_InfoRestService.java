package cn.ebatech.imixpark.wifi.rest;

import java.util.Map;

public interface User_InfoRestService {
	/**
	 * 对密码进行修改
	 * @param parameters
	 * @return 参数说明：userId 用户id，pwd 修改的密码
	 * 
	 */
	Map<String, Object> editUserPwd (Map<String, Object> parameters);
}
