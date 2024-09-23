package com.atguigu.test;

import com.atguigu.Controller.StudentController;
import com.atguigu.pojo.Student;
import com.atguigu.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Jdbctest {

    @Test
    public void testJdbc1(){
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("spring-01.xml");

        JdbcTemplate jdbcTemplate = applicationContext.getBean(JdbcTemplate.class);

        // 增加 update
        String sql = "insert into students (id,name,gender,age,class) values (?,?,?,?,?);";

        // id不是默认的值

        int rows = jdbcTemplate.update(sql,10,"汪苏", "男", "35", "主任");
        System.out.println("rows = " + rows);
    }

    @Test
    public void testJdbc2(){
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("spring-01.xml");

        JdbcTemplate jdbcTemplate = applicationContext.getBean(JdbcTemplate.class);

        // 查询
        String sql = "select id , name , age , gender , class as classes from students where id = ? ;";

        // id不是默认的值
        Student student1 = jdbcTemplate.queryForObject(sql, (rs, rowNum) -> {
            // rs 是行数
            // rowNum 行数
            Student student = new Student();
            student.setAge(rs.getInt("age"));
            student.setId(rs.getInt("id"));
            student.setName(rs.getString("name"));
            student.setGender(rs.getString("gender"));
            student.setClasses(rs.getString("classes"));
            return student;
        }, 1);

        System.out.println(student1);
    }

    @Test
    public void testJdbc3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-01.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean(JdbcTemplate.class);
        String sql = "select id , name , age , gender , class as classes from students;";

        List<Student> studentList
                = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));
        System.out.println(studentList);

    }
    @Test
    /*
    * 从IOC容器中调用业务
    * */
    public void testfindall(){
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("spring-02.xml");
        StudentController bean = applicationContext.getBean(StudentController.class);
        bean.findAll();

    }
}
