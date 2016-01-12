package cn.ebatech.imixpark.wifi.dao;

import java.util.Map;

import cn.ebatech.imixpark.common.dao.MyBatisRepository;

@MyBatisRepository
public interface User_InfoDao {
	
	int editUserPwd (Map<String, Object> parameters);

}
