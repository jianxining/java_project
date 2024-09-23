package com.atguigu.test;

import com.atguigu.ioc_03.HappyComponent;
import com.atguigu.ioc_04.Single_pro;
import com.atguigu.ioc_05.JavaBean;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springtest {
    /*
    * 创建容器并且读取配置文件
    * */
    @Test
    public void creatIoc(){
        ApplicationContext applicationcontext = new ClassPathXmlApplicationContext("spring-03.xml");
    }

    @Test
    public void getBeanFromIoc(){
        ApplicationContext applicationcontext = new ClassPathXmlApplicationContext("spring-03.xml");

        // 1 根据BeanID获取
        HappyComponent happyComponent = (HappyComponent)applicationcontext.getBean("happyComponent");
        // 2 BeanId + class
        // 3  类型
        HappyComponent bean = applicationcontext.getBean(HappyComponent.class);
        bean.DoWork();
//
    }

    /*
    * 测试实例化对象的创建和销毁
    * */
    @Test
    public void test_04(){
        // 创建Ioc容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-04.xml");
        Single_pro bean1 = applicationContext.getBean(Single_pro.class);
        Single_pro bean2 = applicationContext.getBean(Single_pro.class);
        System.out.println(bean2 == bean1);

        applicationContext.close();//释放Ioc容器
    }
    @Test
    public void test_05(){
        // 创建Ioc容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-05.xml");
        JavaBean javaBean = applicationContext.getBean("javaBean",JavaBean.class);
        System.out.println("javaBean = " + javaBean);
        applicationContext.close();//释放Ioc容器
    }
}
