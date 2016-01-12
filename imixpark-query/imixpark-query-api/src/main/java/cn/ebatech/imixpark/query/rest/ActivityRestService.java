package cn.ebatech.imixpark.query.rest;

import java.util.Map;


/**
 * 活动接口
 * @author XLJIANG
 */
public interface ActivityRestService {

	/**
	 * 根据活动ID查询活动对象
	 * @param id
	 * @return
	 */
	Map<String, Object> getActivity(Long id);
	
	/**
	 * 根据条件查询活动列表信息
	 * 参数说明：mall_id商场ID，sort排序字段名，dir排序方式，start分页开始位置，count需要查询条数
	 * @param parameters (int mall_id, String sort, String dir, int page, int size)
	 * @return
	 */
	Map<String, Object> search(Map<String, Object> parameters);
	
	/**
	 * 活动的报名或取消报名
	 * @param parameters
	 * @return 成功或失败
	 * 参数说明：activity_status报名状态，user_id会员ID，activity_id活动ID
	 */
	Map<String, Object> signUp(Map<String, Object> parameters);
	
	/**
	 * 查询报名人数
	 * @param activity_id
	 * @return
	 * 参数说明：activity_id活动ID
	 */
	Map<String, Object> count(Long activity_id);
	
	/**
	 * 点击活动按钮获取当前用户参加所有活动
	 * @param user_id
	 * @return
	 * 参数说明：user_id会员ID
	 */
	Map<String, Object> getYetActivity(Long user_id);
	
	/**
	 * 通过活动明细id查询活动及订单信息
	 * @param activity_id
	 * @return
	 * 参数说明：activity_id活动ID
	 */
	Map<String, Object> getActivityIndent(Long activity_detail_id);
}
