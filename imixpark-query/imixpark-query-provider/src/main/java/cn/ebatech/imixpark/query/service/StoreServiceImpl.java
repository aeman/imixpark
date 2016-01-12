package cn.ebatech.imixpark.query.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import cn.ebatech.imixpark.common.model.market.Store;
import cn.ebatech.imixpark.query.dao.StoreMybatisDao;

@Component
@Transactional
public class StoreServiceImpl implements StoreService {

    private static final Logger logger = LoggerFactory.getLogger(StoreServiceImpl.class);

    @Autowired
    private StoreMybatisDao storeDao;

	@Override
	public Store getStore(Long id) {
		return storeDao.getStore(id);
	}
	
	@Override
	public List<Store> search(Map<String, Object> parameters) {
		return storeDao.search(parameters);
	}
}
