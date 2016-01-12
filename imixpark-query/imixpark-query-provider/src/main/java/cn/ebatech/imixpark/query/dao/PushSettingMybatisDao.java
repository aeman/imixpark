package cn.ebatech.imixpark.query.dao;

import java.util.List;
import java.util.Map;

import cn.ebatech.imixpark.common.dao.MyBatisRepository;
import cn.ebatech.imixpark.common.model.user.PushSetting;

@MyBatisRepository
public interface PushSettingMybatisDao {

	PushSetting getPushSetting(Long id);
	
	List<PushSetting> search(Map<String, Object> parameters);

	void savePushSetting(Map<String, Object> parameters);
	
	int updatePushSetting(Map<String, Object> parameters);
}
