package com.qingguatang.java5minute.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {
    @RequestMapping(value="/")
    @ResponseBody
    public String hello(){
        String message="Hello World";
        return message;
    }
}