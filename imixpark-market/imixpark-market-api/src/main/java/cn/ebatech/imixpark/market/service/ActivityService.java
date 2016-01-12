package cn.ebatech.imixpark.market.service;

import java.util.Map;

/**
 * 活动报名接口类
 * @author liyangkun
 */
public interface ActivityService {

    /**
     * 点击报名时插入报名信息接口
     * @param parameters
     * @return
     * 参数说明：activity_detail对象
     */
	void saveOrUpdate(Map<String, Object> params);
    
    /**
     * 点击报名按钮更新报名状态接口
     * @param params
     * @return
     * 参数说明：activity_status报名活取消状态，useri_id会员ID，activity_id活动ID
     */
    int updateYetActivity(Map<String, Object> params);
}
