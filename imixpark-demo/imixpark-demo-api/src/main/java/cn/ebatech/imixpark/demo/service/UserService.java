package cn.ebatech.imixpark.demo.service;

import cn.ebatech.imixpark.demo.model.User;

import java.util.List;


public interface UserService {
    User getUser(Long id);

    List<User> getAllUser();

    User findUserByLoginName(String loginName);

    void updateUser(User user);

    void deleteUser(Long id);

    Long registerUser(User user);

    List<User> searchUser(String loginName, String name);
}
