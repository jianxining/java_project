package com.atguigu.Service.Impl;


import com.atguigu.Service.Calculator;
import org.springframework.stereotype.Component;

/**
 * 实现计算接口,单纯添加 + - * / 实现! 掺杂其他功能!
 *
 * aop功能是针对Ioc容器的--->创建代理对象--->代理对象存储到Ioc容器
 */
@Component
public class CalculatorPureImpl implements Calculator {
    
    @Override
    public int add(int i, int j) {
    
        int result = i + j;
    
        return result;
    }
    
    @Override
    public int sub(int i, int j) {
    
        int result = i - j;
    
        return result;
    }
    
    @Override
    public int mul(int i, int j) {
    
        int result = i * j;
    
        return result;
    }
    
    @Override
    public int div(int i, int j) {
    
        int result = i / j;
    
        return result;
    }
}