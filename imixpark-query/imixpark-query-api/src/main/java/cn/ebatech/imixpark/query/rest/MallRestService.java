package cn.ebatech.imixpark.query.rest;

import java.util.Map;

/**
 * 商场接口
 * @author XLJIANG
 */
public interface MallRestService {
	
	/**
	 * 根据商场ID查询商场实体
	 * @param id
	 * @return
	 */
	Map<String, Object> getMall(Long id);
	
	 /**
     * 根据坐标查询商场信息
     * @param x_c	经度
     * @param y_c	纬度
     * @return
     */
	Map<String, Object> getMallByCoordinate(Double x_c, Double y_c);
	
	/**
     * 根据条件查询商场信息
     * 参数说明：sort排序字段名，dir排序方式，page分页开始位置，size需要查询条数
	 * @param parameters (String sort, String dir, int page, int size)
     * @return
     */
	Map<String, Object> search(Map<String, Object> parameters);
}
