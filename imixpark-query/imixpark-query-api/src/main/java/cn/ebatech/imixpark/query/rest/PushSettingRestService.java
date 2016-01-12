package cn.ebatech.imixpark.query.rest;

import java.util.Map;

/**
 * 消息推送设置接口
 * @author XLJIANG
 */
public interface PushSettingRestService {

	/**
	 * 根据活动ID查询消息推送设置对象
	 * @param id
	 * @return
	 */
	Map<String, Object> getPushSetting(Long id);
	
	/**
	 * 根据条件查询消息推送设置列表信息
	 * 参数说明：user_id用户ID，sort排序字段名，dir排序方式，page分页开始位置，size需要查询条数
	 * @param parameters (int user_id, String sort, String dir, int page, int size)
	 * @return
	 */
	Map<String, Object> search(Map<String, Object> parameters);
	
	/**
	 * 保存或更新消息推送设置信息
	 * * 参数说明：user_id用户ID，activity_open_flag活动开关，system_open_flag系统开关
	 * @param parameters (int user_id, String activity_open_flag, String system_open_flag)
	 * @return
	 */
	Map<String, Object> saveOrUpdate(Map<String, Object> parameters);
}
