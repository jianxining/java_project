package com.atguigu.requsetmapping;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class USerController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public String login(){
        return "User login";
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    @ResponseBody
    public String register() {
        return "User register";
    }
}
