package com.atguigu.test;

import com.atguigu.StudentService;
import com.atguigu.config.JavaConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(JavaConfig.class)

public class TxTest {
    @Autowired
    private StudentService studentService;

    @Test
    public void testTx01(){
        studentService.changeInfo();

    }
}
