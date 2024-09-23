package com.atguigu.dao.impl;

import com.atguigu.dao.StudentDAO;
import com.atguigu.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Student> queryall() {
        String sql = "select id , name , age , gender , class as classes from students ;";
        List<Student> studentsList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));
        System.out.println("Students = " + studentsList);
        return studentsList;
    }
}
