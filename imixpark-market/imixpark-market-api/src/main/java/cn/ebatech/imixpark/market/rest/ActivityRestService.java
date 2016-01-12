package cn.ebatech.imixpark.market.rest;

import java.util.Map;

/**
 * 活动及报名接口类
 * @author liyangkun
 *
 */
public interface ActivityRestService {

	Map<String, Object> saveOrUpdate(Map<String, Object> params);
    
    int updateYetActivity(Map<String, Object> params);
}
