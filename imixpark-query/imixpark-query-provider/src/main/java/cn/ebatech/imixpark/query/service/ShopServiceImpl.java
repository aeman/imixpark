package cn.ebatech.imixpark.query.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import cn.ebatech.imixpark.common.model.market.Shop;
import cn.ebatech.imixpark.query.dao.ShopMybatisDao;

@Component
@Transactional
public class ShopServiceImpl implements ShopService {

    private static final Logger logger = LoggerFactory.getLogger(ShopServiceImpl.class);

    @Autowired
    private ShopMybatisDao shopDao;

	@Override
	public Shop getShop(Long id) {
		return shopDao.getShop(id);
	}

	@Override
	public List<Shop> search(Map<String, Object> parameters) {
		return shopDao.search(parameters);
	}

	@Override
	public List<Shop> searchByPara(String shop_name, Long id) {
		return shopDao.searchByPara(shop_name, id);
	}
}
