package com.atguigu.mapper;

import com.atguigu.pojo.Teacher;

public interface TeacherMapper {

    int insertTeacher(Teacher teacher);

    //根据Id查找teacher
    Teacher queryById(String id);
}
