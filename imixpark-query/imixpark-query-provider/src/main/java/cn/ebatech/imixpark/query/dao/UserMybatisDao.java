package cn.ebatech.imixpark.query.dao;

import cn.ebatech.imixpark.common.dao.MyBatisRepository;
import cn.ebatech.imixpark.common.model.user.User;

@MyBatisRepository
public interface UserMybatisDao {

	User getUser(Long id);
}
