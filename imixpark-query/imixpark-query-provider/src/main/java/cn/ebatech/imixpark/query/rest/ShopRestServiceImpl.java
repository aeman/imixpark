package cn.ebatech.imixpark.query.rest;

import java.util.List;
import java.util.Map;

import cn.ebatech.imixpark.query.model.Shop;
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
	public Shop getShop(Long id) {
		return shopService.getShop(id);
	}

    @GET
    @Path("search")
	@Override
	public List<Shop> search(Map<String, Object> parameters) {
		return shopService.search(parameters);
	}
}
