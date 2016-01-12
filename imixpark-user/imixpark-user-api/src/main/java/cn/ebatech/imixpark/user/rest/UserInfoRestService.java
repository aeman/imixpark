package cn.ebatech.imixpark.user.rest;

import java.util.Map;


public interface UserInfoRestService {

	Map<String, Object> userLogin(Map<String, Object> param);
	
	Map<String, Object> validateTel(String user_tel);
}
