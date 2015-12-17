package cn.ebatech.imixpark.query.rest;

import java.util.List;
import java.util.Map;

import cn.ebatech.imixpark.query.model.Commodity;


public interface CommodityRestService {

	Commodity getCommodity(Long id);

	List<Commodity> search(Map<String, Object> parameters);
}
