package com.atguigu.service.impl;

import com.atguigu.mapper.ScheduleMapper;
import com.atguigu.pojo.Schedule;
import com.atguigu.service.ScheduleService;
import com.atguigu.utils.PageBean;
import com.atguigu.utils.R;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//把service层的实现类加到Ioc容器
@Service
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    private ScheduleMapper scheduleMapper;
    @Override
    public R page(int pageSize, int currentPage) {
        //业务逻辑的思考？要去做什么 ？ ————> 查询数据库的全部数据，然后用分页插件进行分页
        //分页、查询、分页数据装配R
        PageHelper.startPage(currentPage,pageSize); //这个插件会帮助我们再SQL语句的后面加上limit x，y
        //查询 要利用mapper查询
        List<Schedule> scheduleList = scheduleMapper.queryList();
        PageInfo<Schedule> info = new PageInfo<>(scheduleList);

        //装配PageNBean
        PageBean<Schedule> pageBean = new PageBean<>(currentPage,pageSize,info.getTotal(),info.getList());

        R ok = R.ok(pageBean);
        return ok;
    }

    @Override
    public R remove(int id) {
        //根据id删除schedule
        int rows = scheduleMapper.removeById(id);
        if(rows > 0)
                return R.ok(null);
        return R.fail(null);
    }

    @Override
    public R save(Schedule schedule) {
        int rows = scheduleMapper.save(schedule);
        if(rows > 0)
            return R.ok(null);
        return R.fail(null);
    }

    @Override
    public R update(Schedule schedule) {
        if(schedule.getId() == null)
            return R.fail("Id为空，无法更新");
        int rows = scheduleMapper.update(schedule);
        if(rows > 0)
            return R.ok(null);
        return R.fail(null);
    }
}
