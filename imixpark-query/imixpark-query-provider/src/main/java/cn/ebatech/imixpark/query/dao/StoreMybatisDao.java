package cn.ebatech.imixpark.query.dao;

import java.util.List;
import java.util.Map;

import cn.ebatech.imixpark.common.dao.MyBatisRepository;
import cn.ebatech.imixpark.common.model.market.Store;

@MyBatisRepository
public interface StoreMybatisDao {

	Store getStore(Long id);
	
	List<Store> search(Map<String, Object> parameters);

}
