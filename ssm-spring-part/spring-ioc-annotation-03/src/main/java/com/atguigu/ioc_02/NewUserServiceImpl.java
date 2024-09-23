package com.atguigu.ioc_02;

import org.springframework.stereotype.Service;

@Service
public class NewUserServiceImpl implements UserService{

    @Override
    public String showInfo() {
        return "Service层方法";
    }
}
