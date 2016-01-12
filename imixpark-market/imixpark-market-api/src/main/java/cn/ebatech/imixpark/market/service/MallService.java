package cn.ebatech.imixpark.market.service;

import java.util.List;
import java.util.Map;

import cn.ebatech.imixpark.market.model.Commodity;
import cn.ebatech.imixpark.market.model.Mall;
import cn.ebatech.imixpark.market.model.Merchant;

/**
 * 商场接口
 * @author dell
 */
public interface MallService {
	
	/**
	 * 根据商场ID查询商场实体
	 * @param id
	 * @return
	 */
    Mall getMall(Long id);

    /**
     * 查询所有商场信息
     * @param parameters
     * @return
     */
    List<Mall> search(Map<String, Object> parameters);
}
