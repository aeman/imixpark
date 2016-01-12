package cn.ebatech.imixpark.query.rest;

import java.util.Map;

/**
 * 成长值记录接口
 * @author XLJIANG
 */
public interface GrowthRestService {
	
	/**
     * 根据条件查询会员成长值记录信息
     * 参数说明：user_id会员ID，sort排序字段名，dir排序方式，page分页开始位置，size需要查询条数
	 * @param parameters (int user_id, String sort, String dir, int page, int size)
     * @return
     */
	Map<String, Object> search(Map<String, Object> parameters);
}
