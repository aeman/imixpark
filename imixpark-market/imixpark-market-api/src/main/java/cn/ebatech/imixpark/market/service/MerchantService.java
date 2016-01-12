package cn.ebatech.imixpark.market.service;

import java.util.List;
import java.util.Map;

import cn.ebatech.imixpark.market.model.Commodity;
import cn.ebatech.imixpark.market.model.Mall;
import cn.ebatech.imixpark.market.model.Merchant;

/**
 * 商户接口
 * @author dell
 */
public interface MerchantService {
	
	/**
	 * 根据ID查询商户实体
	 * @param id
	 * @return
	 */
	Merchant getMerchant(Long id);

    /**
     * 根据商场查询商户
     * @param parameters
     * @return
     */
    List<Merchant> search(Map<String, Object> parameters);
}
