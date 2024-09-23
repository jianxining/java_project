package com.atguigu.cookie;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
public class CookieConfig {
    @GetMapping("/cookie")
    public String handle(@CookieValue("cookieName") String cookie) {
        return cookie;
    }
}
