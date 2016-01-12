package cn.ebatech.imixpark.query.dao;

import java.util.List;
import java.util.Map;

import cn.ebatech.imixpark.common.dao.MyBatisRepository;
import cn.ebatech.imixpark.common.model.user.Growth_Value;

@MyBatisRepository
public interface GrowthMybatisDao {

	List<Growth_Value> search(Map<String, Object> parameters);
}
