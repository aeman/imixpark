package cn.ebatech.imixpark.query.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import cn.ebatech.imixpark.query.dao.MerchantMybatisDao;
import cn.ebatech.imixpark.query.model.Merchant;

@Component
@Transactional
public class MerchantServiceImpl implements MerchantService {

    private static final Logger logger = LoggerFactory.getLogger(MerchantServiceImpl.class);

    @Autowired
    private MerchantMybatisDao merchantDao;

	@Override
	public Merchant getMerchant(Long id) {
		return merchantDao.getMerchant(id);
	}

	@Override
	public List<Merchant> search(Map<String, Object> parameters) {
		return merchantDao.search(parameters);
	}
}
