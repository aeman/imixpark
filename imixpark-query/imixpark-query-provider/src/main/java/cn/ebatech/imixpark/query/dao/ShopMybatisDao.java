package cn.ebatech.imixpark.query.dao;

import cn.ebatech.imixpark.common.dao.MyBatisRepository;
import cn.ebatech.imixpark.query.model.Shop;

import java.util.List;
import java.util.Map;

@MyBatisRepository
public interface ShopMybatisDao {

	Shop getShop(Long id);
	
	 List<Shop> search(Map<String, Object> parameters);
}
