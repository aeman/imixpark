package cn.ebatech.imixpark.query.service;

import java.util.List;
import java.util.Map;

import cn.ebatech.imixpark.common.model.market.Carousel;

public interface CarouselService {
	
	Carousel getCarousel(Long id);
	
	List<Carousel> search(Map<String, Object> parameters);
}
