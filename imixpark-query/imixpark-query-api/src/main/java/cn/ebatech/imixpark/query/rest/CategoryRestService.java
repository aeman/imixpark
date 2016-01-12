package cn.ebatech.imixpark.query.rest;

import java.util.Map;

/**
 * 品类接口
 * @author XLJIANG
 */
public interface CategoryRestService {

	/**
	 * 根据品类ID查询品类对象
	 * @param id
	 * @return
	 */
	Map<String, Object> getCategory(Long id);
	
	/**
	 * 根据条件查询品类列表信息
	 * 参数说明：higher_code父级品类，当查询一级品类时不设置此参数;
	 * 			mall_id当前商场ID，sort排序字段名，dir排序方式，page分页开始位置，size需要查询条数
	 * @param parameters (String higher_code, Long mall_id, String sort, String dir, int page, int size)
	 * @return
	 */
	Map<String, Object> search(Map<String, Object> parameters);
}
