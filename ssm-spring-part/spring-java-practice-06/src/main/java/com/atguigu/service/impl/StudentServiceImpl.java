package com.atguigu.service.impl;

import com.atguigu.dao.StudentDAO;
import com.atguigu.pojo.Student;
import com.atguigu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDAO studentDAO;
    @Override
    public List<Student> findAll() {
        List<Student> studentList = studentDAO.queryall();
        System.out.println("Student Service 层" + studentList);
        return studentList;
    }
}
