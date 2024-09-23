package com.atguigu.test;

import com.atguigu.mapper.CustomerMapper;
import com.atguigu.mapper.OrderMapper;
import com.atguigu.pojo.Customer;
import com.atguigu.pojo.Order;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class MybatisTest {
    private SqlSession session;

    @BeforeEach
    public void before() throws IOException {
        session = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml")).openSession();
    }

    @AfterEach
    public void clean(){
        session.commit();
        session.close();
    }

    @Test
    public void test01(){
        OrderMapper mapper = session.getMapper(OrderMapper.class);
        Order order = mapper.queryOrderByOrderId(1);
        System.out.println("order = " + order);
    }
    @Test
    public void test02(){
        CustomerMapper mapper = session.getMapper(CustomerMapper.class);
        List<Customer> customers = mapper.queryList();
        for(Customer customer:customers){
            List<Order> orderList = customer.getOrderList();
            System.out.println("orderList = " + orderList);
        }
    }
}
