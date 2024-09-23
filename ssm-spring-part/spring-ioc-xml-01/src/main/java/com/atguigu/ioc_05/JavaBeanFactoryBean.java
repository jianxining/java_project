package com.atguigu.ioc_05;

import org.springframework.beans.factory.FactoryBean;

public class JavaBeanFactoryBean implements FactoryBean {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object getObject() throws Exception {
        JavaBean javaBean = new JavaBean();
        javaBean.setName(name);
        return javaBean;
    }

    @Override
    public Class<?> getObjectType() {
        return JavaBean.class;
    }
//    制造JavaBean的工厂Bean对象

}
