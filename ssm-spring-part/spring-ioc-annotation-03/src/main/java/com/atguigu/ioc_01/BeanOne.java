package com.atguigu.ioc_01;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope
public class BeanOne {

  //周期方法要求： 方法命名随意，但是要求方法必须是 public void 无形参列表
  @PostConstruct  //注解制指定初始化方法
  public void init() {
    // 初始化逻辑
    System.out.println("BeanOne初始化");
  }

  @PreDestroy
  public void destory(){
    System.out.println("Bean销毁");
  }
}

