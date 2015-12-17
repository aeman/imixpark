package cn.ebatech.imixpark.query.rest;

import java.util.List;
import java.util.Map;

import cn.ebatech.imixpark.query.model.Merchant;
import cn.ebatech.imixpark.query.service.MerchantService;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("merchant")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class MerchantRestServiceImpl implements MerchantRestService {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(MerchantRestServiceImpl.class);

    @Autowired
    private MerchantService merchantService;

    @GET
    @Path("{id : \\d+}")
	@Override
	public Merchant getMerchant(Long id) {
		return merchantService.getMerchant(id);
	}

    @GET
    @Path("search")
	@Override
	public List<Merchant> search(Map<String, Object> parameters) {
		return merchantService.search(parameters);
	}
}
