package cn.ebatech.imixpark.market.dao;

import java.util.Map;

@MyBatisRepository
public interface ActivityMyBatisDao {

	void saveOrUpdate(Map<String, Object> params);
    
    int updateYetActivity(Map<String, Object> params); 
}
