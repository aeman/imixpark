/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package cn.ebatech.imixpark.demo.dao;

import cn.ebatech.imixpark.demo.model.User;
import cn.ebatech.imixpark.common.dao.MyBatisRepository;

import java.util.List;
import java.util.Map;


/**
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * 
 * @author calvin
 */
@MyBatisRepository
public interface UserMybatisDao {

	User get(Long id);

	List<User> getAll();

    User getUserByLoginName(String loginName);

	List<User> search(Map<String, Object> parameters);

	void save(User user);

	void update(User user);

	void delete(Long id);
}
