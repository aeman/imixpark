package cn.ebatech.imixpark.query.service;

import java.util.List;
import java.util.Map;

import cn.ebatech.imixpark.common.model.user.PushSetting;

public interface PushSettingService {
	
	PushSetting getPushSetting(Long id);
	
	List<PushSetting> search(Map<String, Object> parameters);

	void savePushSetting(Map<String, Object> parameters);

	/**
	 * 更新消息推送设置信息
	 * @param parameters
	 * @return
	 * 参数说明：user_id用户ID，activity_open_flag活动开关，system_open_flag系统开关
	 */
	int updatePushSetting(Map<String, Object> parameters);
}
