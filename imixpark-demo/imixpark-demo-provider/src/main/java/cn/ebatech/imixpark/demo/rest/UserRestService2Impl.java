package cn.ebatech.imixpark.demo.rest;

import cn.ebatech.imixpark.demo.model.User;
import cn.ebatech.imixpark.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


public class UserRestService2Impl implements UserRestService2 {

    private static final Logger logger = LoggerFactory.getLogger(UserRestService2Impl.class);

    @Autowired
    private UserService userService;

    public User getUser(Long id) {
        return userService.getUser(id);
    }

    public Long registerUser(User user) {
        return userService.registerUser(user);
    }
}
