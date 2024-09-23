package com.atguigu.ioc_04;

import java.sql.SQLOutput;

public class BeanTwo {

  public void cleanup() {
    // 释放资源逻辑
    System.out.println("BeanTwo 释放");
  }
}