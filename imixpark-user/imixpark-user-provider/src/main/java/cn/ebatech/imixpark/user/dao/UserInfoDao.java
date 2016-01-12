package cn.ebatech.imixpark.user.dao;

import java.util.Map;

import cn.ebatech.imixpark.common.dao.MyBatisRepository;
import cn.ebatech.imixpark.common.model.user.User;

@MyBatisRepository
public interface UserInfoDao {

	User userLogin(Map<String, Object> params);
	
	User validateTel(String user_tel);
	
	void registerUser(Map<String, Object> param);
	
	int updateUserInfo(Map<String, Object> param);
	
	int insertValidateNum(Map<String, Object> param);
}
