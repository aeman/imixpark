package cn.ebatech.imixpark.demo.consumer;

import cn.ebatech.imixpark.demo.model.User;
import cn.ebatech.imixpark.demo.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Component
public class DemoJavaConfigAction {

    @Reference
    private UserService userService;

    @PostConstruct
    public void start() throws Exception {
        User user = new User(1L, "larrypage");

        System.out.println("SUCESS: registered user with id " + userService.registerUser(user));
        System.out.println("SUCESS: got user " + userService.getUser(1L));
    }
}
