package cn.ebatech.imixpark.wifi.rest;

import java.util.Map;

/**
 * 调用锐捷WiFi接口
 * @author issuser
 *
 */
public interface RbisRestService {
	
	/**
	 * 用户下线
	 * @param parameters
	 * @return
	 * 参数说明：userId：用户ID，serialno：设备序列号
	 */
	public Map<String, Object> offlineWithDecrypt(Map<String, Object> parameters);
	
	/**
	 * 用户上线
	 * @param parameters
	 * @return
	 *  参数说明：userId：用户ID，serialno：设备序列号，mac：用户终端mac，ip：用户IP，username：用户名
	 */
	public Map<String, Object> userOnlineWithDecrypt(Map<String, Object> parameters);

}
