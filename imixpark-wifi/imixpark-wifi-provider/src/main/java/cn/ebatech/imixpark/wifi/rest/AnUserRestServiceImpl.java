package cn.ebatech.imixpark.wifi.rest;

import cn.ebatech.imixpark.wifi.model.User;
import cn.ebatech.imixpark.wifi.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.List;
import java.util.Map;


//@Service(protocol = {"rest", "dubbo"}, group = "annotationConfig", validation = "true")
//@Path("anusers")
//@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
//@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class AnUserRestServiceImpl implements UserRestService {

    private static final Logger logger = LoggerFactory.getLogger(AnUserRestServiceImpl.class);

    @Autowired
    private UserService userService;

    @GET
    @Path("{id : \\d+}")
    public User getUser(@PathParam("id") Long id) {
        return userService.getUser(id);
    }

    @POST
    @Path("register")
    public Long registerUser(User user) {
        return userService.registerUser(user);
    }

    @GET
    @Path("all")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @POST
    @Path("search")
    public List<User> searchUser(Map<String, Object> params) {
        String loginName = String.valueOf(params.get("login_name"));
        String name = String.valueOf(params.get("user_name"));
        return userService.searchUser(loginName, name);
    }
}
