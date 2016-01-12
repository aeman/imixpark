package cn.ebatech.imixpark.query.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import cn.ebatech.imixpark.common.model.market.Carousel;
import cn.ebatech.imixpark.query.dao.CarouselMybatisDao;

@Component
@Transactional
public class CarouselServiceImpl implements CarouselService {

    private static final Logger logger = LoggerFactory.getLogger(CarouselServiceImpl.class);

    @Autowired
    private CarouselMybatisDao carouselDao;

	@Override
	public Carousel getCarousel(Long id) {
		return carouselDao.getCarousel(id);
	}
	
	@Override
	public List<Carousel> search(Map<String, Object> parameters) {
		return carouselDao.search(parameters);
	}
}
