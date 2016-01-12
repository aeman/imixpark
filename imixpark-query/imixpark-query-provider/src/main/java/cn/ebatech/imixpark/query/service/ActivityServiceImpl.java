package cn.ebatech.imixpark.query.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import cn.ebatech.imixpark.common.model.market.Activity;
import cn.ebatech.imixpark.common.model.market.ActivityDetail;
import cn.ebatech.imixpark.query.dao.ActivityMybatisDao;

@Component
@Transactional
public class ActivityServiceImpl implements ActivityService {

    private static final Logger logger = LoggerFactory.getLogger(ActivityServiceImpl.class);

    @Autowired
    private ActivityMybatisDao activityDao;

	@Override
	public Activity getActivity(Long id) {
		return activityDao.getActivity(id);
	}
	
	@Override
	public List<Activity> search(Map<String, Object> parameters) {
		return activityDao.search(parameters);
	}

	@Override
	public int signUp(Map<String, Object> parameters) {
		return activityDao.signUp(parameters);
	}

	@Override
	public int count(Long activity_id) {
		return activityDao.count(activity_id);
	}

	@Override
	public List<ActivityDetail> getYetActivity(Long user_id) {
		return activityDao.getYetActivity(user_id);
	}

	
	@Override
	public ActivityDetail getActivityIndent(Long activity_detail_id) {
		return activityDao.getActivityIndent(activity_detail_id);
	}
}
