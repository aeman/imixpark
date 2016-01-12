package cn.ebatech.imixpark.query.rest;

import java.util.Map;

import cn.ebatech.imixpark.common.model.market.Shop;
import cn.ebatech.imixpark.common.util.CommonUtil;
import cn.ebatech.imixpark.common.util.Constant;
import cn.ebatech.imixpark.query.service.ShopService;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("shop")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class ShopRestServiceImpl implements ShopRestService {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ShopRestServiceImpl.class);

    @Autowired
    private ShopService shopService;

    @GET
    @Path("{id : \\d+}")
	@Override
	public Map<String, Object> getShop(@PathParam("id") Long id) {
		return CommonUtil.returnObjectMap(Constant.CODE_SUCCESS, Constant.MESSAGE_SUCCCESS, 
				Shop.class.getSimpleName(), shopService.getShop(id));
	}

    @POST
    @Path("search")
	@Override
	public Map<String, Object> search(Map<String, Object> parameters) {
    	return CommonUtil.returnObjectMap(Constant.CODE_SUCCESS, Constant.MESSAGE_SUCCCESS,
    			Shop.class.getSimpleName(), shopService.search(parameters));
	}

    @GET
    @Path("/searchByPara/{shop_name}/{id}")
	@Override
	public Map<String, Object> searchByPara(@PathParam("shop_name") String shop_name, @PathParam("id") Long id) {
		return CommonUtil.returnObjectMap(Constant.CODE_SUCCESS, Constant.MESSAGE_SUCCCESS, 
				Shop.class.getSimpleName(), searchByPara(shop_name, id));
	}
    
}
