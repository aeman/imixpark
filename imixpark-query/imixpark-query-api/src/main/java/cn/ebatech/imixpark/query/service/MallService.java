package cn.ebatech.imixpark.query.service;

import java.util.List;
import java.util.Map;

import cn.ebatech.imixpark.common.model.market.Mall;

public interface MallService {
	
    Mall getMall(Long id);
    
    List<Mall> getMallByCoordinate(Double x_c, Double y_c);

    List<Mall> search(Map<String, Object> parameters);
}
