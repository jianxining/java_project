package com.atguigu.test;
import com.atguigu.mapper.UserMapper;
import com.atguigu.pojo.User;
import com.mysql.cj.Session;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {


    private SqlSession sqlSession;
    @BeforeEach
    private void init() throws IOException {
          sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml")).openSession();
    }

    @AfterEach
    public void clean(){
        sqlSession.close();
    }


    @Test
    public void test_01() throws IOException {
        // 获取接口的代理对象  --> 调用代理对象的方法去查找Mapper接口的方法
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("jianxining");
        user.setPassword("123456");
        mapper.insert(user);
        System.out.println("user = " + user);
        // 提交事务和释放资源
        sqlSession.commit();
        clean();
    }
}
