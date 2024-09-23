package com.atguigu.pojo;

import lombok.Data;

import java.util.Date;


@Data
public class User {
    private String name;
    private String password;
    private int age;
    private String email;
    private Date birthday;
}
