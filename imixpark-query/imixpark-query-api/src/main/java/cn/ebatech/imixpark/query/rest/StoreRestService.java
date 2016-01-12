package cn.ebatech.imixpark.query.rest;

import java.util.Map;

/**
 * 商户接口
 * @author XLJIANG
 */
public interface StoreRestService {

	/**
	 * 根据品类ID查询商户对象
	 * @param id
	 * @return
	 */
	Map<String, Object> getStore(Long id);
	
	/**
	 * 根据条件查询商户列表信息
	 * 参数说明：mall_id商场ID，floor_number楼层, store_name商户名称，category_code品类代码，
	 * 			sort排序字段名，dir排序方式，start分页开始位置，count需要查询条数
	 * @param parameters (int mall_id, int floor_number, String store_name, String category_code, 
	 * 					  String sort, String dir, int page, int size)
	 * @return
	 */
	Map<String, Object> search(Map<String, Object> parameters);
}
