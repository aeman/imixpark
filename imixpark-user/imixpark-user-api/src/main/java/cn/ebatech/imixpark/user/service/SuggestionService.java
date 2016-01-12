package cn.ebatech.imixpark.user.service;

import java.util.Map;

import cn.ebatech.imixpark.common.model.user.Suggestion;

public interface SuggestionService  {
	
	int save (Map<String, Object> parameters);
	
	String getPwd(int userId);
	int editUerPwd (Map<String, Object> parameters);
}
