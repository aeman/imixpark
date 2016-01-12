package cn.ebatech.imixpark.user.dao;

import cn.ebatech.imixpark.common.dao.MyBatisRepository;
import cn.ebatech.imixpark.common.model.user.BaShop;
import cn.ebatech.imixpark.common.model.user.User;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.annotation.sql.DataSourceDefinition;


/**
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 */
@MyBatisRepository
public interface UserDao {

	List<User> getAll();

    User getUserByLoginName(String loginName);

	List<User> search(Map<String, Object> parameters);

	void save(User user);
	User getUser(int id);

	void update(User user);

	void delete(Long id);

	void test();

	int updateUser(User user);

	void addBaShops(List<BaShop> bs);
	
	String getPwd(int userId);
	
	int editUserPwd (Map<String, Object> parameters);
	
}
