package cn.ebatech.imixpark.user.service;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import cn.ebatech.imixpark.common.model.user.User;
import cn.ebatech.imixpark.user.dao.UserInfoDao;

@Component
@Transactional
public class UserInfoServiceImpl implements UserInfoService {

	private static final Logger logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);
	
	@Autowired
	private UserInfoDao userInfoDao;
	
	@Override
	public User userLogin(Map<String, Object> params) {
		return userInfoDao.userLogin(params);
	}

	@Override
	public User validateTel(String user_tel) {
		return userInfoDao.validateTel(user_tel);
	}

	@Override
	public void registerUser(Map<String, Object> params) {
		userInfoDao.registerUser(params);
		
	}

	@Override
	public int updateUserInfo(Map<String, Object> param) {
		return userInfoDao.updateUserInfo(param);
				
	}

	@Override
	public int insertValidateNum(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return userInfoDao.insertValidateNum(param);
	}

}
