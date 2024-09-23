package com.atguigu.controller;


import com.atguigu.pojo.Schedule;
import com.atguigu.service.ScheduleService;
import com.atguigu.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@CrossOrigin //允许其他源访问
@RestController
@RequestMapping("/schedule")
@Slf4j
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;
    //Controller会有接受参数和返回结果的功能
    @GetMapping("/{pageSize}/{currentPage}")
    public R page(@PathVariable int pageSize,
                  @PathVariable int currentPage){
        R r = scheduleService.page(pageSize,currentPage);
        log.info("输出的数据为：{}",r);
        return r;
    }

    @DeleteMapping("/{id}")
    public R remove(@PathVariable int id){
        R r = scheduleService.remove(id);
        log.info("输出的数据为：{}",r);
        return r;
    }

    @PostMapping
    public R save(@Validated @RequestBody Schedule schedule, BindingResult result){//从前端输入数据到后端，是一个请求体的JSON，是RequestBody
        //这里需要对前端传来的数据做校验，就用jSR350的注解，在pojo中加上注释即可
        //@Validated 使在pojo类中添加的校验生效，
        if(result.hasErrors()){
            return R.fail("参数为空，不能保存");
        }
        R r = scheduleService.save(schedule);
        return r;
    }

    @PutMapping
    public R update(@Validated @RequestBody Schedule schedule, BindingResult result){//从前端输入数据到后端，是一个请求体的JSON，是RequestBody
        //这里需要对前端传来的数据做校验，就用jSR350的注解，在pojo中加上注释即可
        //@Validated 使在pojo类中添加的校验生效，
        if(result.hasErrors()){
            return R.fail("参数为空，不能保存");
        }
        R r = scheduleService.update(schedule);
        return r;
    }
}
