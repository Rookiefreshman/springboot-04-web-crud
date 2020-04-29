package com.atguigu.springboot04webcrud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
    @RequestMapping("/success")
//    (Map<String,Object> map)
    public String success(Map<String,Object> map){
        
        map.put("hello","测试");
        map.put("name","sx");
        return "success";
    }
}
