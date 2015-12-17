package cn.ebatech.imixpark.query.rest;

import java.util.List;
import java.util.Map;

import cn.ebatech.imixpark.query.model.Merchant;

public interface MerchantRestService {

	Merchant getMerchant(Long id);
	
	List<Merchant> search(Map<String, Object> parameters);
}
