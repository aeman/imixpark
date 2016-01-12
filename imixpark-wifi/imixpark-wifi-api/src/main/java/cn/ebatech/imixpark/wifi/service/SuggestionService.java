package cn.ebatech.imixpark.wifi.service;

import java.util.Map;


public interface SuggestionService  {
	
	int save (Map<String, Object> parameters);
	
	String getPwd(int userId);
	int editUerPwd (Map<String, Object> parameters);
}
