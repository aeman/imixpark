package cn.ebatech.imixpark.query.rest;

import cn.ebatech.imixpark.query.model.Mall;
import cn.ebatech.imixpark.query.service.MallService;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Map;

@Path("mall")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class MallRestServiceImpl implements MallRestService {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(MallRestServiceImpl.class);

    @Autowired
    private MallService mallService;

    @GET
    @Path("{id : \\d+}")
	public Mall getMall(@PathParam("id") Long id) {
		return mallService.getMall(id);
	}

    @GET
    @Path("search")
	@Override
	public List<Mall> search(Map<String, Object> parameters) {
		return mallService.search(parameters);
	}

}
