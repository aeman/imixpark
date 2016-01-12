package cn.ebatech.imixpark.query.rest;

import java.util.Map;

import cn.ebatech.imixpark.common.model.market.Store;
import cn.ebatech.imixpark.common.util.CommonUtil;
import cn.ebatech.imixpark.common.util.Constant;
import cn.ebatech.imixpark.query.service.StoreService;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("store")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class StoreRestServiceImpl implements StoreRestService {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(StoreRestServiceImpl.class);

    @Autowired
    private StoreService storeService;

    @GET
    @Path("{id : \\d+}")
	@Override
	public Map<String, Object> getStore(@PathParam("id") Long id) {
		return CommonUtil.returnObjectMap(Constant.CODE_SUCCESS, Constant.MESSAGE_SUCCCESS, 
				Store.class.getSimpleName(), storeService.getStore(id));
	}
    
    @POST
    @Path("search")
	@Override
	public Map<String, Object> search(Map<String, Object> parameters) {
		return CommonUtil.returnObjectMap(Constant.CODE_SUCCESS, Constant.MESSAGE_SUCCCESS,
				Store.class.getSimpleName(), storeService.search(parameters));
	}

}
