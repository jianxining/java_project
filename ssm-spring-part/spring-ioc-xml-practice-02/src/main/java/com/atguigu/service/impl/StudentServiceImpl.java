package com.atguigu.service.impl;

import com.atguigu.dao.StudentDAO;
import com.atguigu.pojo.Student;
import com.atguigu.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDAO studentDAO;

    public void setStudentDAO(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Override
    public List<Student> findAll() {
        List<Student> studentList = studentDAO.queryall();
        System.out.println("Student Service 层" + studentList);
        return studentList;
    }
}
