package cn.ebatech.imixpark.query.rest;

import java.util.Map;

/**
 * 首页接口
 * @author XLJIANG
 */
public interface IndexRestService {
	
	/**
     * 查询首页各板块数据
     * 参数说明：mall_id商场ID，sort排序字段名，dir排序方式，page分页开始位置，size需要查询条数
	 * @param parameters (int mall_id, String sort, String dir, int page, int size)
     * @return
     */
	Map<String, Object> search(Map<String, Object> parameters);
}
