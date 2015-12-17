package cn.ebatech.imixpark.query.service;

import java.util.List;
import java.util.Map;

import cn.ebatech.imixpark.query.model.Shop;

/**
 * 商铺接口
 * @author dell
 */
public interface ShopService {
	
	/**
	 * 根据ID查询商铺实体
	 * @param id
	 * @return
	 */
	Shop getShop(Long id);

    /**
     * 查询商铺列表信息
     * @param parameters
     * @return
     */
    List<Shop> search(Map<String, Object> parameters);
}
