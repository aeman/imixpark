package cn.ebatech.imixpark.query.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import cn.ebatech.imixpark.common.model.market.Category;
import cn.ebatech.imixpark.query.dao.CategoryMybatisDao;

@Component
@Transactional
public class CategoryServiceImpl implements CategoryService {

    private static final Logger logger = LoggerFactory.getLogger(CategoryServiceImpl.class);

    @Autowired
    private CategoryMybatisDao categoryDao;

	@Override
	public Category getCategory(Long id) {
		return categoryDao.getCategory(id);
	}
	
	@Override
	public List<Category> search(Map<String, Object> parameters) {
		return categoryDao.search(parameters);
	}
}
