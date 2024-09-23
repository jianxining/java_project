package com.atguigu.mapper;

import com.atguigu.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/*
* 规定数据库的接口
* */
public interface EmployeeMapper {
    //根据id获取员工的信息
    Employee queryById(Integer id);


    // 根据员工的id进行删除
    int deleteById(Integer id);

    List<Employee> queryBySalary(Double salary);


    //插入员工数据
    int insertEmp(Employee employee);

    //根据员工的姓名和工资查询员工信息

    List<Employee> queryByNameAndSalary(@Param("empName") String name, @Param("empSalary") Double salary);

    //用map传入用户的信息，map key的值为用户的名字，值为薪水
    int insertMap(Map data);
}
