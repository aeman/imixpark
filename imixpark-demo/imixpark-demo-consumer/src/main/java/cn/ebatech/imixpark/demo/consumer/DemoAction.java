/*
 * Copyright 1999-2011 Alibaba Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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