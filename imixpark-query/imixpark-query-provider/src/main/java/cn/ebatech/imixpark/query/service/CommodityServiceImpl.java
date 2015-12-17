package cn.ebatech.imixpark.query.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import cn.ebatech.imixpark.query.dao.CommodityMybatisDao;
import cn.ebatech.imixpark.query.model.Commodity;

@Component
@Transactional
public class CommodityServiceImpl implements CommodityService {

    private static final Logger logger = LoggerFactory.getLogger(CommodityServiceImpl.class);

    @Autowired
    private CommodityMybatisDao commodityDao;

	@Override
	public Commodity getCommodity(Long id) {
		return commodityDao.getCommodity(id);
	}

	@Override
	public List<Commodity> search(Map<String, Object> parameters) {
		return commodityDao.search(parameters);
	}
}
