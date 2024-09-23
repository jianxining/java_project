package com.atguigu.service;

import com.atguigu.pojo.Schedule;
import com.atguigu.utils.R;
import jakarta.ejb.Schedules;

public interface ScheduleService {
     R page(int pageSize,int currentPage);

     R remove(int id);
     R save(Schedule schedule);
     R update(Schedule schedule);
}
