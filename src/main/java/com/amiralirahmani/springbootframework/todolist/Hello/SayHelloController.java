package com.amiralirahmani.springbootframework.todolist.Hello;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SayHelloController {

    @RequestMapping("hello_world")
    @ResponseBody
    public String SayHello(){
        return "Hello World! this is my ToDo-list app";
    }
}
