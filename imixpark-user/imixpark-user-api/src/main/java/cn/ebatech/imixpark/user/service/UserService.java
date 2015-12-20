package cn.ebatech.imixpark.user.service;

import cn.ebatech.imixpark.user.model.User;

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
