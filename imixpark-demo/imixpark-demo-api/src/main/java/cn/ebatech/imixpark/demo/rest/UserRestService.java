package cn.ebatech.imixpark.demo.rest;

import cn.ebatech.imixpark.demo.model.User;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import javax.validation.constraints.Min;
import java.util.List;
import java.util.Map;

/**
 * This interface acts as some kind of service broker for the original UserService
 *
 * http://localhost:8888/user/1.json
 * http://localhost:8888/user/1.xml
 *
 */
public interface UserRestService {

    /**
     * the request object is just used to test jax-rs injection.
     */
    User getUser(@Min(value=1L, message="User ID must be greater than 1") Long id);

    Long registerUser(User user);

    List<User> getAllUser();

    List<User> searchUser(Map<String, Object> params);

    void uploadFile(MultipartFormDataInput input);
}
