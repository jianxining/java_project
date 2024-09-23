package com.atguigu.advice;


// 代理类


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.lang.reflect.Modifier;

@Aspect
@Component
@EnableAspectJAutoProxy
public class CalculatorAdvice {

    //代理方法
    @Before("execution(int com.atguigu.Service.Impl.*.*(..))")
    public void before(JoinPoint joinPoint){ //获取目标类的类名、方法名、参数名
        String simpleName = joinPoint.getTarget().getClass().getSimpleName();
        System.out.println("simpleName = " + simpleName);
        int modifiers = joinPoint.getSignature().getModifiers();
        String string = Modifier.toString(modifiers);
        System.out.println("modifiers = " + string);
        Object[] args = joinPoint.getArgs();
        System.out.println("args = " + args);
        System.out.println("方法开始");
    }

    @AfterReturning(value = "execution(int com.atguigu.Service.Impl.CalculatorPureImpl.*(..))",returning="returning")
    public void afterReturning(Object returning){
        System.out.println("方法结束");
    }

    @AfterThrowing(value = "execution(int com.atguigu.Service.Impl.CalculatorPureImpl.*(..))",throwing = "throwable")
    public void afterThrowing(Throwable throwable){
        System.out.println("方法有异常");
    }
}
