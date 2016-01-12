package cn.ebatech.imixpark.query.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import cn.ebatech.imixpark.common.model.user.User;
import cn.ebatech.imixpark.query.dao.UserMybatisDao;

@Component
@Transactional
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMybatisDao userDao;

	@Override
	public User getUser(Long id) {
		return userDao.getUser(id);
	}
}
