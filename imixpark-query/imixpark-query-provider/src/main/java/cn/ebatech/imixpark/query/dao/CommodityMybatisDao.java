package cn.ebatech.imixpark.query.dao;

import cn.ebatech.imixpark.common.dao.MyBatisRepository;
import cn.ebatech.imixpark.query.model.Commodity;

import java.util.List;
import java.util.Map;

@MyBatisRepository
public interface CommodityMybatisDao {

	Commodity getCommodity(Long id);

	List<Commodity> search(Map<String, Object> parameters);
}
