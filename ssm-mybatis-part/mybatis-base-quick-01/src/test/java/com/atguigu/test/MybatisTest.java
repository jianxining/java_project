package com.atguigu.test;

import com.atguigu.mapper.EmployeeMapper;
import com.atguigu.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {

    @Test
    public void test_01() throws IOException {
        // 读取外部配置文件
        InputStream ips = Resources.getResourceAsStream("mybatis-config.xml");

        //常见sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(ips);

        // 根据sqlSessionFactory创建sqlSess
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 获取接口的代理对象  --> 调用代理对象的方法去查找Mapper接口的方法
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        List<Employee> employees = mapper.queryByNameAndSalary("tom", 200.33);
        System.out.println("employees = " + employees);
        // 提交事务和释放资源
        sqlSession.commit();
        sqlSession.close();
    }
}
