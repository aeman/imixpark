package cn.ebatech.imixpark.wifi.service;

import cn.ebatech.imixpark.wifi.dao.UserDao;
import cn.ebatech.imixpark.wifi.model.User;
import com.google.common.collect.Maps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


@Component
@Transactional
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Override
    public User getUser(Long id) {
        return userDao.get(id);
    }

    @Override
    public List<User> getAllUser() {
        return userDao.getAll();
    }

    @Override
    public User findUserByLoginName(String loginName) {
        return userDao.getUserByLoginName(loginName);
    }

    @Override
    public void updateUser(User user) {
        userDao.update(user);
    }

    @Override
    public void deleteUser(Long id) {
        userDao.delete(id);
    }

    @Override
    public Long registerUser(User user) {
        userDao.save(user);
        System.out.println("[返回新增ID]：" + user.getId());
        return user.getId();
    }

    @Override
    public List<User> searchUser(String loginName, String name) {
        Map<String, Object> parameters = Maps.newHashMap();
        parameters.put("login_name", loginName);
        if (!name.equals("1")) {
            parameters.put("user_name", name);
        }
        return userDao.search(parameters);
    }
}
