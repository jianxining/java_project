package com.atguigu.ioc_02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    @Qualifier(value = "userServiceImpl")
    private UserService userService;
    public void showInfo(){
        System.out.println("Controller层" + userService.showInfo());
    }
}
