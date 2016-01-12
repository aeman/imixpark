package cn.ebatech.imixpark.market.service;

import java.util.List;
import java.util.Map;

import cn.ebatech.imixpark.market.model.Commodity;

/**
 * 商品接口
 * @author dell
 */
public interface CommodityService {
	
	/**
	 * 根据ID查询商品实体
	 * @param id
	 * @return
	 */
    Commodity getCommodity(Long id);

    /**
     * 根据商铺查询商品
     * @param parameters
     * @return
     */
    List<Commodity> search(Map<String, Object> parameters);
}
