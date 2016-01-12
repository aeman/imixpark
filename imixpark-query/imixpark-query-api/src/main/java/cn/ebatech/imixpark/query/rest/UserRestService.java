package cn.ebatech.imixpark.query.rest;

import java.util.Map;

/**
 * 用户接口
 * @author XLJIANG
 */
public interface UserRestService {

	/**
	 * 根据用户ID查询用户对象
	 * @param id
	 * @return
	 */
	Map<String, Object> getUser(Long id);
	
}
