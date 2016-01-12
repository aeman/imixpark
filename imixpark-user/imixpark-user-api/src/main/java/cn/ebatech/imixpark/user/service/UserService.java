package cn.ebatech.imixpark.user.service;

import cn.ebatech.imixpark.common.model.user.BaShop;
import cn.ebatech.imixpark.common.model.user.Integral;
import cn.ebatech.imixpark.common.model.user.LogIntegral;
import cn.ebatech.imixpark.common.model.user.User;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;


public interface UserService {
    User getUser(int id);

    List<User> getAllUser();

    User findUserByLoginName(String loginName);

    void updateUser(User user);

    void deleteUser(Long id);

    int registerUser(User user);

    List<User> searchUser(String loginName, String name);

	void test();

	void test2();

	int saveUser(User user);

	void updateIcon(MultipartFormDataInput input, String name);

	List<Integral> selLogIntegrals(String vipNo);

	/**
	 * 查询用农密码
	 * @param userId
	 * @return
	 */
	String getPwd(int userId);
	/**
	 * 根据原密码并修改密码
	 * @param parameters
	 * @return
	 */
	int editUerPwd (Map<String, Object> parameters);


	List<BaShop> findAll();

	void BaShops2localDB(List<BaShop> bs);

}
