package cn.ebatech.imixpark.query.rest;

import java.util.Map;

import cn.ebatech.imixpark.common.util.CommonUtil;
import cn.ebatech.imixpark.common.util.Constant;
import cn.ebatech.imixpark.query.service.GrowthService;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("growth")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class GrowthRestServiceImpl implements GrowthRestService {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(GrowthRestServiceImpl.class);

    @Autowired
    private GrowthService growthService;

    @POST
    @Path("search")
	@Override
	public Map<String, Object> search(Map<String, Object> parameters) {
		return CommonUtil.returnObjectMap(Constant.CODE_SUCCESS, Constant.MESSAGE_SUCCCESS, 
				"Growth", growthService.search(parameters));
	}

}
