package cn.ebatech.imixpark.user.quartz_dao;

import cn.ebatech.imixpark.common.dao.MyBatisRepository;
import cn.ebatech.imixpark.common.model.user.BaShop;
import cn.ebatech.imixpark.common.model.user.User;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.annotation.sql.DataSourceDefinition;


/**
 * 定时任务的数据库操作
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 */
@MyBatisRepository
public interface Quartz_UserDao {

	void test();
	
	List<BaShop> findAll();
}
