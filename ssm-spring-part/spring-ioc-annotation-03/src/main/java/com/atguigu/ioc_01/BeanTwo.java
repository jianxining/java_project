package com.atguigu.ioc_01;

import javax.annotation.PreDestroy;

public class BeanTwo {
  
  @PreDestroy //注解指定销毁方法
  public void cleanup() {
    // 释放资源逻辑
  }
}