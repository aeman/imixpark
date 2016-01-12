package cn.ebatech.imixpark.wifi.service;

import java.util.Map;



public interface RbisService {
	
	public String offlineWithDecrypt(Map<String, Object> params);
	
	public String userOnlineWithDecrypt(Map<String, Object> parameters);
	

}
