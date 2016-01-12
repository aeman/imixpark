package cn.ebatech.imixpark.query.service;

import java.util.List;
import java.util.Map;

import cn.ebatech.imixpark.common.model.market.Store;

public interface StoreService {
	
	Store getStore(Long id);
	
	List<Store> search(Map<String, Object> parameters);
}
