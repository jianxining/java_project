package com.atguigu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.atguigu")
@EnableWebMvc //自动在IOC中注册handlerMapping handlerAdopt json转换器
public class MvcConfig implements WebMvcConfigurer {

    // 配置视图解析器，指定前后缀


    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        // registry可以快速添加前后缀
        registry.jsp("/WEB-INF/views",".jsp");
    }

    //开启静态资源处理 <mvc:default-servlet-handler/>
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
