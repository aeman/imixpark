package cn.ebatech.imixpark.user.fj_dao;

import cn.ebatech.imixpark.common.dao.MyBatisRepository;
import cn.ebatech.imixpark.common.model.user.Integral;
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
public interface fj_UserDao {
	int test();
	List<Integral> findIntegrals(String vipNo);
}
