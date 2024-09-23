package com.atguigu.ioc_03;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JavaBean {

    @Value("${jdbc.username:admin}")
    private String username;
    @Value("${jdbc.password:123456}")
    private String password;

    @Override
    public String toString() {
        return "JavaBean{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
