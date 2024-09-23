package com.atguigu.config;


import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

@ComponentScan(basePackages = "com.atguigu")
@PropertySource("classpath:jdbc.properties")
@Configuration
public class StudentConfig {
    @Value("${com.atguigu.url}")
    private String url;
    @Value("${com.atguigu.driver}")
    private String driver;
    @Value("${com.atguigu.username}")
    private String username;
    @Value("${com.atguigu.password}")
    private String password;
    @Bean
    public DruidDataSource druidDataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl(url);
        druidDataSource.setDriverClassName(driver);
        druidDataSource.setUsername(username);
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
