package com.atguigu.mapper;

import com.atguigu.pojo.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface EmployeeMapper {
    //查询所有员工信息的接口
    List<Employee> queryList();
}
