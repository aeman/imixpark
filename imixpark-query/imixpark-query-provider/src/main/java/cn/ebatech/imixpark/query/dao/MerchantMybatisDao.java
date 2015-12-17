package cn.ebatech.imixpark.query.dao;

import cn.ebatech.imixpark.common.dao.MyBatisRepository;
import cn.ebatech.imixpark.query.model.Merchant;

import java.util.List;
import java.util.Map;

@MyBatisRepository
public interface MerchantMybatisDao {

	Merchant getMerchant(Long id);
	
	List<Merchant> search(Map<String, Object> parameters);
}
