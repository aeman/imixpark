/*
 * Copyright 2006-2014 handu.com.
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
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Jinkai.Ma
 */
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
