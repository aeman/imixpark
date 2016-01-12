package cn.ebatech.imixpark.query.rest;

import java.util.Map;

/**
 * 商位接口
 * @author dell
 */
public interface ShopRestService {

	/**
	 * 根据ID查询商位实体
	 * @param id
	 * @return
	 */
	Map<String, Object> getShop(Long id);
	
	 /**
     * 查询商位列表信息
     * 参数说明：sort排序字段名，dir排序方式，page分页开始位置，size需要查询条数
	 * @param parameters (String sort, String dir, int page, int size)
     * @return
     */
	Map<String, Object> search(Map<String, Object> parameters);
	
	Map<String, Object> searchByPara(String shop_name, Long id);
}
