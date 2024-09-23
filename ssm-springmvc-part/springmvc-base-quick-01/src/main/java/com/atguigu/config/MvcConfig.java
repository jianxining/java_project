package com.atguigu.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/*controller配置到IOC
handlerMapping\handlerAdapter加入IOC

*/
@Configuration//配置类必须要有
@ComponentScan("com.atguigu.controller")//包扫描
public class MvcConfig {
    @Bean
    public RequestMappingHandlerAdapter requestMappingHandlerAdapter(){
        return new RequestMappingHandlerAdapter();
    }

    @Bean
    public RequestMappingHandlerMapping requestMappingHandlerMapping(){
        return new RequestMappingHandlerMapping();
    }
}
