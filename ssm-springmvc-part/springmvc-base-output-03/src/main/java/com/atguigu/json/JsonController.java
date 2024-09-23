package com.atguigu.json;

import com.atguigu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
//@RequestMapping("/json")
public class JsonController {


    //Json不能用Get
    @RequestMapping(value = "/user/detail",method = RequestMethod.POST)
    @ResponseBody
    public User GetUser(@RequestBody User userParam){
        System.out.println("userParam = " + userParam);
        User user = new User();
        user.setName("John");
        user.setAge("18");
        return user;
    }

}
