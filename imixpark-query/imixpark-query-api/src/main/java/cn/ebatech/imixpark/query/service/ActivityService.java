package cn.ebatech.imixpark.query.service;

import java.util.List;
import java.util.Map;

import cn.ebatech.imixpark.common.model.market.Activity;
import cn.ebatech.imixpark.common.model.market.ActivityDetail;
import cn.ebatech.imixpark.common.model.market.Activity_Detail;

public interface ActivityService {
	
	Activity getActivity(Long id);     //查询一个活动对象
	
	List<Activity> search(Map<String, Object> parameters);   //查询活动对象集合
	
	int signUp(Map<String, Object> parameters);     //更新报名 活取消报名状态
		
	int count(Long activity_id);			//查询报名人数
	
	List<ActivityDetail> getYetActivity(Long user_id);       //查询已报名的活动及报名对象集合
	
	ActivityDetail getActivityIndent(Long activity_detail_id);				//查询活动及活动明细对象
}
