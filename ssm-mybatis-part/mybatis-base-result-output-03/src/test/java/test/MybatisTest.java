package test;

import com.atguigu.mapper.EmployeeMapper;
import com.atguigu.mapper.TeacherMapper;
import com.atguigu.pojo.Employee;
import com.atguigu.pojo.Teacher;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;

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
        List<String> res = mapper.queryNameUpSalaryBySalary(200.0);
        System.out.println("res = " + res);
        // 提交事务和释放资源
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test_02() throws IOException {
        // 读取外部配置文件
        InputStream ips = Resources.getResourceAsStream("mybatis-config.xml");

        //常见sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(ips);

        // 根据sqlSessionFactory创建sqlSess
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = new Employee();
        employee.setEmpName("马云2");
        employee.setEmpSalary(2500.0);

        int rows = mapper.insertEmployee(employee);

        System.out.println("rows = " + rows);
        System.out.println("employee = " + employee);

        //非查询语句是默认开启事务的，如果我们在代码中补写提交事务的命令，则Mybatis是不会为我们去更新数据库的
//        sqlSession.commit();
        sqlSession.close();

    }


    @Test
    public void test_03() throws IOException {
        // 读取外部配置文件
        InputStream ips = Resources.getResourceAsStream("mybatis-config.xml");

        //常见sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(ips);

        // 根据sqlSessionFactory创建sqlSess
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = new Teacher();
        teacher.settName("蔡徐坤1");
//        String id = UUID.randomUUID().toString().replaceAll("-", "");
//        teacher.settId(id);

       int rows = mapper.insertTeacher(teacher);
        System.out.println("rows = " + rows);
    }
}
