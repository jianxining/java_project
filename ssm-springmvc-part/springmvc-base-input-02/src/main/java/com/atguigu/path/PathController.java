package com.atguigu.path;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/path")
@ResponseBody
public class PathController {


    @GetMapping("/{id}/{name}")
    public String path1(@PathVariable String id,@PathVariable String name){
        System.out.println("id = " + id + ", name = " + name);
        return "id = " + id + ", name = " + name;
    }
}
