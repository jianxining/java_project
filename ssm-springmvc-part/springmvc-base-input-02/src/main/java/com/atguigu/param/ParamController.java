package com.atguigu.param;


import com.atguigu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLOutput;
import java.util.List;

@Controller
@RequestMapping("/param")
public class ParamController {

    @RequestMapping("/data")
    @ResponseBody
    public String data(String name,int age){// 参数名与前端的name属性值一致,不传递也不报错
        System.out.println("name = " + name + ",age = " + age);
        return "name = " + name + ",age = " + age;
    }

    @RequestMapping("/data1")
    @ResponseBody
    public String data1(@RequestParam(value = "account") String username,
                        @RequestParam(required = false,defaultValue = "1") int page){
        System.out.println("username = " + username + ", page = " + page);
        return "username = " + username + ", page = " + page;
    }

    @GetMapping(value="/data2")
    @ResponseBody
    public String mulForm(@RequestParam List<String> hbs){
        System.out.println("hbs = " + hbs);
        return "hbs = " + hbs;
    }

    @GetMapping(value="/data3")
    @ResponseBody
    public String data3(User user) {
        System.out.println("user = " + user);
        return "user = " + user;
    }
}
