package com.atguigu.test;


import com.atguigu.Service.Calculator;
import com.atguigu.config.CalculatorConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(value = CalculatorConfig.class)
public class AopTest {
    @Autowired
    private Calculator calculator;

    @Test
    public void testAop(){
        int add = calculator.add(1, 1);
        System.out.println("add = " + add);
    }

}
