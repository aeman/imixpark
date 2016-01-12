package cn.ebatech.imixpark.user.service;

import java.util.Map;

import cn.ebatech.imixpark.common.model.user.User;


public interface UserInfoService {
 
	User userLogin(Map<String, Object> param);
	
	User validateTel(String user_tel);
}


