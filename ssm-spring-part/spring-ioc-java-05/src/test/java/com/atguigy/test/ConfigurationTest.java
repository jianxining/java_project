package com.atguigy.test;

import com.atguigu.config.StudentConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigurationTest {

    @Test
    public void TestConfig01(){
        AnnotationConfigApplicationContext applicationContext
                 = new AnnotationConfigApplicationContext();
        applicationContext.register(StudentConfiguration.class);
        applicationContext.refresh();
    }
}
