package cn.ebatech.imixpark.query.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import cn.ebatech.imixpark.query.dao.MallMybatisDao;
import cn.ebatech.imixpark.query.model.Mall;

@Component
@Transactional
public class MallServiceImpl implements MallService {

    private static final Logger logger = LoggerFactory.getLogger(MallServiceImpl.class);

    @Autowired
    private MallMybatisDao mallDao;

	@Override
	public Mall getMall(Long id) {
		return mallDao.getMall(id);
	}

	@Override
	public List<Mall> search(Map<String, Object> parameters) {
		return mallDao.search(parameters);
	}
}
