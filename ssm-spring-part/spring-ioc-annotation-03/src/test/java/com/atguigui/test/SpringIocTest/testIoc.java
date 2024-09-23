package com.atguigui.test.SpringIocTest;

import com.atguigu.ioc_01.XxxDao;
import com.atguigu.ioc_02.UserController;
import com.atguigu.ioc_03.JavaBean;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testIoc {
    @Test
    public void IOCtest01(){
        ClassPathXmlApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("spring-01.xml");
        XxxDao bean = applicationContext.getBean(XxxDao.class);
        Object xxxService = applicationContext.getBean("xxxService");
        System.out.println(bean);
        System.out.println(xxxService);
    }

    @Test
    public void IOCtest02(){
        ClassPathXmlApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("spring-02.xml");
        UserController userController = applicationContext.getBean(UserController.class);
        userController.showInfo();
    }

    @Test
    public void IOCtest03(){
        ClassPathXmlApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("spring-03.xml");
        JavaBean javaBean = applicationContext.getBean(JavaBean.class);
        System.out.println(javaBean);
    }
}
