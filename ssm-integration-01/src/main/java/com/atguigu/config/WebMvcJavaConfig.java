package com.atguigu.config;


/*
* 在springMvc中配置哪些东西？
* 放入IOC容器中
* 全局异常处理
* handlerMapping HandlerAdopt
* json转换器
* 静态资源管理
* 拦截器
* */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@EnableWebMvc
@Configuration
@ComponentScan("com.atguigu.controller")
public class WebMvcJavaConfig implements WebMvcConfigurer {
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }


    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/views/",".jsp");
    }

    //添加拦截器

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor()
//    }
}
