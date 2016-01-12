package cn.ebatech.imixpark.market.service;

import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import cn.ebatech.imixpark.market.dao.ActivityMyBatisDao;

@Component
@Transactional
public class ActivityServiceImpl implements ActivityService {
	
	private static final Logger logger = LoggerFactory.getLogger(ActivityServiceImpl.class);
	
	@Autowired
	private ActivityMyBatisDao activityDao;
	
	@Override
	public void saveOrUpdate(Map<String, Object> params) {
		
		  activityDao.saveOrUpdate(params);
	}

	@Override
	public int updateYetActivity(Map<String, Object> params) {
		return activityDao.updateYetActivity(params);
	}

}
