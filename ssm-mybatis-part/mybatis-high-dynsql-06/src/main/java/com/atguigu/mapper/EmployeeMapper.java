package com.atguigu.mapper;

import com.atguigu.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {

    List<Employee> query(@Param("name") String name, @Param("salary") Double salary);

    //根据员工id更新员工数据

    int update(Employee employee);

    List<Employee> queryBatch(@Param("ids") List<Integer> ids);

    List<Employee> deleteBatch(@Param("ids") List<Integer> ids);

    int insertBatch(@Param("List") List<Employee> employeeList);

    int updateBatch(@Param("List") List<Employee> employeeList);

}
