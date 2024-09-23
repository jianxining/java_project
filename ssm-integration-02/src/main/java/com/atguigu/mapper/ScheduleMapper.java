package com.atguigu.mapper;

import com.atguigu.pojo.Schedule;
import com.atguigu.utils.R;

import java.util.List;

//mapper是一个接口，具体实现在同名的mapper文件中
public interface ScheduleMapper {
    List<Schedule> queryList();

    //mapper层根据id删除用户
    int removeById(int id);
    int save(Schedule schedule);

    int update(Schedule schedule);
}
