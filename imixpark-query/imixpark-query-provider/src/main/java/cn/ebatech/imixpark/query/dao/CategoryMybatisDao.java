package cn.ebatech.imixpark.query.dao;

import java.util.List;
import java.util.Map;

import cn.ebatech.imixpark.common.dao.MyBatisRepository;
import cn.ebatech.imixpark.common.model.market.Category;

@MyBatisRepository
public interface CategoryMybatisDao {

	Category getCategory(Long id);
	
	List<Category> search(Map<String, Object> parameters);

}
