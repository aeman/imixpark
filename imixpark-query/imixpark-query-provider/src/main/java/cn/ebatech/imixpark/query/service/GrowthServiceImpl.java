package cn.ebatech.imixpark.query.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import cn.ebatech.imixpark.common.model.user.Growth_Value;
import cn.ebatech.imixpark.query.dao.GrowthMybatisDao;

@Component
@Transactional
public class GrowthServiceImpl implements GrowthService {

    private static final Logger logger = LoggerFactory.getLogger(GrowthServiceImpl.class);

    @Autowired
    private GrowthMybatisDao growthDao;

	@Override
	public List<Growth_Value> search(Map<String, Object> parameters) {
		return growthDao.search(parameters);
	}

}
