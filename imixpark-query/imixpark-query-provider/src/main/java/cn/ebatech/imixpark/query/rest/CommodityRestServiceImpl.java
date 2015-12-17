package cn.ebatech.imixpark.query.rest;

import java.util.List;
import java.util.Map;

import cn.ebatech.imixpark.query.model.Commodity;
import cn.ebatech.imixpark.query.service.CommodityService;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("commodity")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class CommodityRestServiceImpl implements CommodityRestService {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(CommodityRestServiceImpl.class);

    @Autowired
    private CommodityService commodityService;

    @GET
    @Path("{id : \\d+}")
	@Override
	public Commodity getCommodity(Long id) {
		return commodityService.getCommodity(id);
	}

    @GET
    @Path("search")
	@Override
	public List<Commodity> search(Map<String, Object> parameters) {
		return commodityService.search(parameters);
	}
}
