package com.atguigu.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {

    @RequestMapping("springmvc/hello") //对外访问的地址，到handlerMapping注册
    @ResponseBody // 返回字符串给前端
    public String Hello(){
        System.out.println("hello ");
        return "Hello springmvc";
    }
}
