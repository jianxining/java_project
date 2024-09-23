package com.atguigu.test;

import com.atguigu.Controller.StudentController;
import com.atguigu.config.StudentConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;


@SpringJUnitConfig(StudentConfig.class)
public class SpringIocTest {

    @Autowired
    private StudentController studentController;

    @Test
    public void testIoc1() {
        studentController.findAll();
    }
}
