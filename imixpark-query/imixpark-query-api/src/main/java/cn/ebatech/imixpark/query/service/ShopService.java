package cn.ebatech.imixpark.query.service;

import java.util.List;
import java.util.Map;

import cn.ebatech.imixpark.common.model.market.Shop;

public interface ShopService {
	
	Shop getShop(Long id);
	
    List<Shop> search(Map<String, Object> parameters);
    
    List<Shop> searchByPara(String shop_name, Long id);
}
