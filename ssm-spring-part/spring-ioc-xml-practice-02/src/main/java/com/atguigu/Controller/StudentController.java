package com.atguigu.Controller;

import com.atguigu.pojo.Student;
import com.atguigu.service.StudentService;

import java.util.List;

public class StudentController {
    private StudentService studentService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public void findAll(){
        List<Student> all = studentService.findAll();
        System.out.println("controller 层的数据" + all);
    }
}
