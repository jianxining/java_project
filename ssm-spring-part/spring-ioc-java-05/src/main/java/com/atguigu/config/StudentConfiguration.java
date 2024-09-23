package com.atguigu.config;


import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan("com.atguigu.ioc_01")
@PropertySource("classpath:jdbc.properties")
public class StudentConfiguration {


    @Bean
    public DruidDataSource druidDataSource(
            @Value("${com.atguigu.username}") String username,
            @Value("${com.atguigu.url}") String url,
            @Value("${com.atguigu.driver}") String driver,
            @Value("${com.atguigu.password}") String password
            )
    {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUsername(username);
        druidDataSource.setUrl(url);
        druidDataSource.setDriverClassName(driver);
        druidDataSource.setPassword(password);
        return druidDataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DruidDataSource druidDataSource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(druidDataSource);
        return jdbcTemplate;

    }


}
