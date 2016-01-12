package cn.ebatech.imixpark.query.rest;

import java.util.Map;

import cn.ebatech.imixpark.common.model.user.User;
import cn.ebatech.imixpark.common.util.CommonUtil;
import cn.ebatech.imixpark.common.util.Constant;
import cn.ebatech.imixpark.query.service.UserService;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("user")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class UserRestServiceImpl implements UserRestService {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(UserRestServiceImpl.class);

    @Autowired
    private UserService userService;

    @GET
    @Path("{id : \\d+}")
	@Override
	public Map<String, Object> getUser(@PathParam("id") Long id) {
		return CommonUtil.returnObjectMap(Constant.CODE_SUCCESS, Constant.MESSAGE_SUCCCESS, 
				User.class.getSimpleName(), userService.getUser(id));
	}

}
