package cn.ebatech.imixpark.demo.rest;

import cn.ebatech.imixpark.demo.model.User;
import cn.ebatech.imixpark.demo.service.UserService;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Map;


@Path("users")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class UserRestServiceImpl implements UserRestService {

    private static final Logger logger = LoggerFactory.getLogger(UserRestServiceImpl.class);

    @Autowired
    private UserService userService;

    @GET
    @Path("{id : \\d+}")
    public User getUser(@PathParam("id") Long id) {
        return userService.getUser(id);
    }

    @GET
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @POST
    @Path("register")
    public Long registerUser(User user) {
        return userService.registerUser(user);
    }

    @POST
    @Path("search")
    public List<User> searchUser(Map<String, Object> params) {
        String loginName = String.valueOf(params.get("login_name"));
        String name = String.valueOf(params.get("user_name"));
        return userService.searchUser(loginName, name);
    }
}
