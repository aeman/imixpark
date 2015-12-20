package cn.ebatech.imixpark.demo.consumer;

import cn.ebatech.imixpark.demo.model.User;
import cn.ebatech.imixpark.demo.service.UserService;
import com.alibaba.dubbo.rpc.RpcContext;
import org.springframework.beans.factory.annotation.Autowired;


public class DemoAction {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void start() throws Exception {
        User user = new User(1L, "chenxuan");
        System.out.println("SUCCESS: registered user with id " + userService.registerUser(user));

        RpcContext.getContext().setAttachment("clientName", "demo");
        RpcContext.getContext().setAttachment("clientImpl", "dubbox");
        System.out.println("SUCCESS: got user " + userService.getUser(1L));
    }

}