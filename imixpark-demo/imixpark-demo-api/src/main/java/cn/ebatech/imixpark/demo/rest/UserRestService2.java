package cn.ebatech.imixpark.demo.rest;

import cn.ebatech.imixpark.demo.model.User;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;

import javax.validation.constraints.Min;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * @author lishen
 */
@Path("users2")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public interface UserRestService2 {

    @GET
    @Path("{id : \\d+}")
    User getUser(@PathParam("id") @Min(1L) Long id);

    @POST
    @Path("register")
    Long registerUser(User user);
}
