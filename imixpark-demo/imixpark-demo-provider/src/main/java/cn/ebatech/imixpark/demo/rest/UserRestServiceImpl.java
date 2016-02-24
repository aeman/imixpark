package cn.ebatech.imixpark.demo.rest;

import cn.ebatech.imixpark.common.util.CommonUtil;
import cn.ebatech.imixpark.demo.model.User;
import cn.ebatech.imixpark.demo.service.UserService;
import com.alibaba.dubbo.rpc.RpcException;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureException;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springside.modules.nosql.redis.JedisTemplate;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.DatatypeConverter;
import java.util.Collections;
import java.util.List;
import java.util.Map;


@Path("demo")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class UserRestServiceImpl implements UserRestService {

    private static final Logger logger = LoggerFactory.getLogger(UserRestServiceImpl.class);

    private static final String APPKEY_ID = "144JVZINOF5EBNCMG9EXAMPLE";
    private static final String APPKEY_SECRET = "lWxOiKqKPNwJmSldbiSkEbkNjgh2uRSNAb+AEXAMPLE";

    @Autowired
    private UserService userService;

    @Autowired
    private JedisTemplate jedisTemplate;

    // 第二种方式
//    private JedisPool pool;
//
//    @PostConstruct
//    public void initJedisTemplate() {
//        pool = new JedisPoolBuilder().setDirectHostAndPort("direct:127.0.0.1", "6379").setPoolSize(50).buildPool();
//        jedisTemplate = new JedisTemplate(pool);
//    }

    @GET
    @Path("{id : \\d+}")
    public User getUser(@PathParam("id") Long id) {
        jedisTemplate.set("user_id", String.valueOf(id));
        return userService.getUser(id);
    }

    @GET
    public List<User> getAllUser(@HeaderParam("Authorization") String token) {
        if (token == null) {
            throw new RpcException(1001, "No token found");
        }
        parseJWT(token);
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

    @POST
    @Path("upload")
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public String uploadFile(MultipartFormDataInput input) {
        return userService.uploadFile(input);
    }

    @GET
    @Path("login/{name}/{password}")
    public Map<String, String> login(@PathParam("name") String name, @PathParam("password") String password) {
        System.out.println("name:" + name + "|password:" + password);
        if (StringUtils.isEmpty(name) || StringUtils.isEmpty(password)) {
//            throw buildException(Response.Status.BAD_REQUEST, "401", "User or password empty");
            throw new RpcException(1002, "User or password empty");
        }

        String token = userService.login(name, password);
        //saveCache(id, token);

        return Collections.singletonMap("token", token);
    }

    @POST
    @Path("logout")
    public void logout(String token) {
        //cacheInvalid(token);
        userService.logout();
    }

    public void parseJWT(String jwt) {
        try {
            Claims claims = Jwts.parser()
                    .setSigningKey(DatatypeConverter.parseBase64Binary(APPKEY_SECRET))   //apiKey.getSecret()
                    .parseClaimsJws(jwt).getBody();
            System.out.println("ID: " + claims.getId());
            System.out.println("Subject: " + claims.getSubject());
            System.out.println("Issuer: " + claims.getIssuer());
            System.out.println("Expiration: " + claims.getExpiration());
        } catch (SignatureException e) {
//            throw new ServiceException("Token has been tampered", ErrorCode.TOKEN_TAMPERED);
            throw buildException(Response.Status.BAD_REQUEST, "403", "Token has been tampered");
        } catch (ExpiredJwtException e) {
//            throw new ServiceException("Token expired", ErrorCode.TOKEN_EXPIRED);
            throw buildException(Response.Status.REQUEST_TIMEOUT, "500", "Token expired");
        }
    }

    private WebApplicationException buildException(Response.Status status, String code, String message) {
        Object o = CommonUtil.returnObjectMap(code, message, "", null);

        return new WebApplicationException(Response.status(status).entity(o).type(ContentType.APPLICATION_JSON_UTF_8)
                .build());
    }
}
