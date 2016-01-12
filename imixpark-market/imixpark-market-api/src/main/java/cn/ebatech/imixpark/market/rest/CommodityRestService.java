package cn.ebatech.imixpark.market.rest;

import java.util.List;
import java.util.Map;

import cn.ebatech.imixpark.market.model.Commodity;

public interface CommodityRestService {

	Commodity getCommodity(Long id);

	List<Commodity> search(Map<String, Object> parameters);
}
