package cn.ebatech.imixpark.query.dao;

import java.util.List;
import java.util.Map;

import cn.ebatech.imixpark.common.dao.MyBatisRepository;
import cn.ebatech.imixpark.common.model.market.Activity;
import cn.ebatech.imixpark.common.model.market.ActivityDetail;

@MyBatisRepository
public interface ActivityMybatisDao {

	Activity getActivity(Long id);
	
	List<Activity> search(Map<String, Object> parameters);
	
	int signUp(Map<String, Object> parameters);
	
	int count(Long activity_id);
	
	List<ActivityDetail> getYetActivity(Long user_id);

	ActivityDetail getActivityIndent(Long activity_detail_id);

}
