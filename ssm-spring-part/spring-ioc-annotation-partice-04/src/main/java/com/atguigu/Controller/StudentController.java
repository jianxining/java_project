package com.atguigu.Controller;

import com.atguigu.pojo.Student;
import com.atguigu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    public void findAll() {
        List<Student> all = studentService.findAll();
        System.out.println("controller 层的数据" + all);
    }
}
