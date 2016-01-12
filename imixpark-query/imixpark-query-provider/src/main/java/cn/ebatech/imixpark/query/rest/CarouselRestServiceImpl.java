package cn.ebatech.imixpark.query.rest;

import java.util.Map;

import cn.ebatech.imixpark.common.model.market.Carousel;
import cn.ebatech.imixpark.common.util.CommonUtil;
import cn.ebatech.imixpark.common.util.Constant;
import cn.ebatech.imixpark.query.service.CarouselService;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("carousel")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class CarouselRestServiceImpl implements CarouselRestService {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(CarouselRestServiceImpl.class);

    @Autowired
    private CarouselService carouselService;

    @GET
    @Path("{id : \\d+}")
	@Override
	public Map<String, Object> getCarousel(@PathParam("id") Long id) {
    	return CommonUtil.returnObjectMap(Constant.CODE_SUCCESS, Constant.MESSAGE_SUCCCESS,
    			Carousel.class.getSimpleName(), carouselService.getCarousel(id));
	}
    
    @POST
    @Path("search")
	@Override
	public  Map<String, Object> search(Map<String, Object> parameters) {
		return CommonUtil.returnObjectMap(Constant.CODE_SUCCESS, Constant.MESSAGE_SUCCCESS,
				Carousel.class.getSimpleName(), carouselService.search(parameters));
	}

}
