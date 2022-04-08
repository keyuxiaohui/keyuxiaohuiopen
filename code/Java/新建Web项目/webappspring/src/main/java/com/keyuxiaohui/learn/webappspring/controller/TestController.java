package com.keyuxiaohui.learn.webappspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("getStatus")
    @ResponseBody
    public String getStatus(){
        return "success";
    }

    @RequestMapping("test1")
    public String test1(){
        return "test/test1";
    }

}
