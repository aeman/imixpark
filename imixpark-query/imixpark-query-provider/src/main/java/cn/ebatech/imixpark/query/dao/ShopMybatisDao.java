package cn.ebatech.imixpark.query.dao;

import java.util.List;
import java.util.Map;

import cn.ebatech.imixpark.common.dao.MyBatisRepository;
import cn.ebatech.imixpark.common.model.market.Shop;

@MyBatisRepository
public interface ShopMybatisDao {

	Shop getShop(Long id);
	
	List<Shop> search(Map<String, Object> parameters);
	
	List<Shop> searchByPara(String shop_name, Long id);

}
