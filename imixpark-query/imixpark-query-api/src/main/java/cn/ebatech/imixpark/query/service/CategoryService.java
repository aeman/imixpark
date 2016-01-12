package cn.ebatech.imixpark.query.service;

import java.util.List;
import java.util.Map;

import cn.ebatech.imixpark.common.model.market.Category;

public interface CategoryService {
	
	Category getCategory(Long id);
	
	List<Category> search(Map<String, Object> parameters);
}
