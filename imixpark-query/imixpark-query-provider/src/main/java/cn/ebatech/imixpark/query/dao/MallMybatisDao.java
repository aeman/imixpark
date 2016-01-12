package cn.ebatech.imixpark.query.dao;

import java.util.List;
import java.util.Map;

import cn.ebatech.imixpark.common.dao.MyBatisRepository;
import cn.ebatech.imixpark.common.model.market.Mall;

@MyBatisRepository
public interface MallMybatisDao {

	Mall getMall(Long id);
	
	List<Mall> getMallByCoordinate(Double x_c, Double y_c);

	List<Mall> search(Map<String, Object> parameters);
}
