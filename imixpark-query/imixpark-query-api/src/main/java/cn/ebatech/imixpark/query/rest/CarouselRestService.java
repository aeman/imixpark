package cn.ebatech.imixpark.query.rest;

import java.util.Map;

/**
 * 轮播图接口
 * @author XLJIANG
 */
public interface CarouselRestService {

	/**
	 * 根据轮播图ID查询轮播图对象
	 * @param id	轮播图ID
	 * @return
	 */
	Map<String, Object> getCarousel(Long id);
	
	/**
	 * 根据条件查询轮播图列表信息
	 * 参数说明：mall_id商场ID，sort排序字段名，dir排序方式，page分页开始位置，size需要查询条数
	 * @param parameters (int mall_id, String sort, String dir, int page, int size)
	 * @return
	 */
	Map<String, Object> search(Map<String, Object> parameters);
}
