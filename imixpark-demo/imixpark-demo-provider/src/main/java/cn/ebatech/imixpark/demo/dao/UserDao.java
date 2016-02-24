package cn.ebatech.imixpark.demo.dao;

import cn.ebatech.imixpark.common.dao.MyBatisRepository;
import cn.ebatech.imixpark.demo.model.User;

import java.util.List;
import java.util.Map;


/**
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 */
@MyBatisRepository
//@CacheNamespace(implementation=MybatisRedisCache.class)
public interface UserDao {

	User get(Long id);

	List<User> getAll();

	User getUserByLoginName(String loginName);

	List<User> search(Map<String, Object> parameters);

	void save(User user);

	void update(User user);

	void delete(Long id);
}
