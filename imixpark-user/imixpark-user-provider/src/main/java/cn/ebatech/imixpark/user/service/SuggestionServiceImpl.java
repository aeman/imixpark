package cn.ebatech.imixpark.user.service;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import cn.ebatech.imixpark.user.dao.SuggestionDao;
@Component
@Transactional
public class SuggestionServiceImpl  implements SuggestionService {
	  private static final Logger logger = LoggerFactory.getLogger(SuggestionServiceImpl.class);

	 @Autowired
	 private SuggestionDao suggestionDao;
	 
	public void setSuggestionDao(SuggestionDao suggestionDao) {
		this.suggestionDao = suggestionDao;
	}

	@Override
	public int  save(Map<String, Object> parameters) {
		
		return suggestionDao.save(parameters);
	}

	@Override
	public int editUerPwd(Map<String, Object> parameters) {
		
		return suggestionDao.editUserPwd(parameters);
	}

	@Override
	public String getPwd(int userId) {
		
		return suggestionDao.getPwd(userId);
	}

}
