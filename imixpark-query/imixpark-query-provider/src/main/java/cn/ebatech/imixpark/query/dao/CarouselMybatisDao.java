package cn.ebatech.imixpark.query.dao;

import java.util.List;
import java.util.Map;

import cn.ebatech.imixpark.common.dao.MyBatisRepository;
import cn.ebatech.imixpark.common.model.market.Carousel;

@MyBatisRepository
public interface CarouselMybatisDao {

	Carousel getCarousel(Long id);
	
	List<Carousel> search(Map<String, Object> parameters);

}
