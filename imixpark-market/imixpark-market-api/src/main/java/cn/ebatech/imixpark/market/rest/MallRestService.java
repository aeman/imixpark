package cn.ebatech.imixpark.market.rest;

import java.util.List;
import java.util.Map;

import cn.ebatech.imixpark.market.model.Mall;

public interface MallRestService {

	Mall getMall(Long id);
	
	List<Mall> search(Map<String, Object> parameters);
}
