package cn.ebatech.imixpark.query.rest;

import java.util.List;
import java.util.Map;

import cn.ebatech.imixpark.query.model.Shop;

public interface ShopRestService {

	Shop getShop(Long id);
	
	 List<Shop> search(Map<String, Object> parameters);
}
