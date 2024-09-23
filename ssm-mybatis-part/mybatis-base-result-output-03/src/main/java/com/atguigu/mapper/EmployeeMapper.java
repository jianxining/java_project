package com.atguigu.mapper;

import com.atguigu.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {

    // DML 语句，返回值类型是int或者long

    int deleteById(Integer id);



    // 根据员工id查姓名
    String queryNameById(Integer id);

    Double querySalaryById(Integer id);

    // 查询工资高于传入值的员工姓名
    List<String> queryNameUpSalaryBySalary(Double salary);

    //员工插入
    int insertEmployee(Employee employee);
}
