package cn.ebatech.imixpark.user.rest;

import javax.servlet.http.HttpServletRequest;

import cn.ebatech.imixpark.common.model.user.User;
import cn.ebatech.imixpark.user.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


public class UserRestService2Impl implements UserRestService2 {

    private static final Logger logger = LoggerFactory.getLogger(UserRestService2Impl.class);

    @Autowired
    private UserService userService;

    public User getUser(int id) {
        return null;
    }

    public int registerUser(User user) {
        return 0;
    }


	@Override
	public void updateUserIoc(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(int id, String sex, String birthday, String nickname) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateIcon2(int userID) {
		// TODO Auto-generated method stub
		System.out.println(111);
		
	}



}
