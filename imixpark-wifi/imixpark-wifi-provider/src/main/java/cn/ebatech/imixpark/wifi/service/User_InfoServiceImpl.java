package cn.ebatech.imixpark.wifi.service;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import cn.ebatech.imixpark.wifi.dao.User_InfoDao;

@Component
@Transactional
public class User_InfoServiceImpl implements User_InfoService{
	
	  private static final Logger logger = LoggerFactory.getLogger(User_InfoServiceImpl.class);

		 @Autowired
		 private User_InfoDao user_InfoDao;

		public void setUser_InfoDao(User_InfoDao user_InfoDao) {
			this.user_InfoDao = user_InfoDao;
		}

		@Override
		public int editUserPwd(Map<String, Object> parameters) {
			
			return user_InfoDao.editUserPwd(parameters);
		}
		 

}
