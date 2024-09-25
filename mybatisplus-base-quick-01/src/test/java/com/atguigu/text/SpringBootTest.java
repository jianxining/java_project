package com.atguigu.text;


import com.atguigu.mapper.UserMapper;
import com.atguigu.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.boot.test.context.SpringBootTest
public class SpringBootTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test(){
        List<User> users = userMapper.selectList(null);
        System.out.println("users = " + users);

    }
}
