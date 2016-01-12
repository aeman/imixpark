package cn.ebatech.imixpark.query.rest;

import java.util.List;
import java.util.Map;

import cn.ebatech.imixpark.common.model.market.Activity;
import cn.ebatech.imixpark.common.model.market.Carousel;
import cn.ebatech.imixpark.common.util.CommonUtil;
import cn.ebatech.imixpark.common.util.Constant;
import cn.ebatech.imixpark.query.service.ActivityService;
import cn.ebatech.imixpark.query.service.CarouselService;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("index")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class IndexRestServiceImpl implements IndexRestService {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(IndexRestServiceImpl.class);

    @Autowired
    private ActivityService activityService;
    @Autowired
    private CarouselService carouselService;

    @POST
    @Path("search")
	@Override
	public Map<String, Object> search(Map<String, Object> parameters) {
    	List<Activity> actList = activityService.search(parameters);
    	List<Carousel> carList = carouselService.search(parameters);
    	return CommonUtil.returnObjectMap(Constant.CODE_SUCCESS, 
    									  Constant.MESSAGE_SUCCCESS,
    									  CommonUtil.putKey(Activity.class.getSimpleName(),Carousel.class.getSimpleName()),
    									  CommonUtil.putVal(actList,carList));
	}

}
