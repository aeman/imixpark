package cn.ebatech.imixpark.query.dao;

import cn.ebatech.imixpark.common.dao.MyBatisRepository;
import cn.ebatech.imixpark.query.model.Mall;

import java.util.List;
import java.util.Map;

@MyBatisRepository
public interface MallMybatisDao {

	Mall getMall(Long id);

	List<Mall> search(Map<String, Object> parameters);
}
