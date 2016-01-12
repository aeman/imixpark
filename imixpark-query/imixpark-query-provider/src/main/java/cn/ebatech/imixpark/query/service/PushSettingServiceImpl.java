package cn.ebatech.imixpark.query.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import cn.ebatech.imixpark.common.model.user.PushSetting;
import cn.ebatech.imixpark.query.dao.PushSettingMybatisDao;

@Component
@Transactional
public class PushSettingServiceImpl implements PushSettingService {

    private static final Logger logger = LoggerFactory.getLogger(PushSettingServiceImpl.class);

    @Autowired
    private PushSettingMybatisDao pushSettingDao;

	@Override
	public PushSetting getPushSetting(Long id) {
		return pushSettingDao.getPushSetting(id);
	}
	
	@Override
	public List<PushSetting> search(Map<String, Object> parameters) {
		return pushSettingDao.search(parameters);
	}

	@Override
	public void savePushSetting(Map<String, Object> parameters) {
		pushSettingDao.savePushSetting(parameters);
	}

	@Override
	public int updatePushSetting(Map<String, Object> parameters) {
		return pushSettingDao.updatePushSetting(parameters);
	}
}
