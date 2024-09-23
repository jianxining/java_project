package com.atguigu.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@EnableWebMvc  //给requestMappingHandlerAdapter配置json转换器
@Controller
@ComponentScan("com.atguigu")
public class MvcConfig {
//    @Bean
//    public RequestMappingHandlerAdapter requestMappingHandlerAdapter(){
//        return new RequestMappingHandlerAdapter();
//    }
//
//    @Bean
//    public RequestMappingHandlerMapping requestMappingHandlerMapping(){
//        return new RequestMappingHandlerMapping();
//    }
}
