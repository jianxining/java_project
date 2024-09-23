package com.atguigu.config.jsp;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jsp")
public class JspController {

    /*
    * 不能添加@ResponseBody,@ResponseBody的意思是直接返回字符串到浏览器，就不会找视图解析器了
    * */
    @GetMapping("/index")
    public String index(HttpServletRequest request){
        request.setAttribute("data","hello jsp");
        System.out.println("JspController.index");
        return "/index";
    }

    //转发

    @GetMapping("/forward")
    public String forward(){
        System.out.println("JspController.forward");
        return "forward:/jsp/index";
    }

    //重定向
    @GetMapping("/redirect")
    public String redirect(){
        System.out.println("JspController.redirect");
        return "redirect: /jsp/index";
    }

    @GetMapping("/redirectBaidu")
    public String redirectBaidu(){
        System.out.println("JspController.redirectBaidu");
        return "redirect:http://www.baidu.com";
    }

}
