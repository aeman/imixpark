package cn.ebatech.imixpark.user.dao;

import java.util.Map;

import cn.ebatech.imixpark.common.dao.MyBatisRepository;
import cn.ebatech.imixpark.common.model.user.Suggestion;
@MyBatisRepository
public interface SuggestionDao {
	
	int save (Map<String, Object> parameters);
	
	String getPwd(int userId);
	int editUserPwd (Map<String, Object> parameters);
    

}
