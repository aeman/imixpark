package cn.ebatech.imixpark.wifi.service;

import java.util.Map;



public interface RbisService {
	
	String offlineWithDecrypt(Map<String, Object> params);
	
	String userOnlineWithDecrypt(Map<String, Object> parameters);
	

}
