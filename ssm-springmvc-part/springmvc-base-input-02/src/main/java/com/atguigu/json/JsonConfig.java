package com.atguigu.json;


import com.atguigu.pojo.Person;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class JsonConfig {

    @RequestMapping(value = "/json",consumes = MediaType.APPLICATION_JSON_VALUE)
    public String json1(@RequestBody Person person){
        System.out.println("person = " + person);
        return person.toString();
    }
}
