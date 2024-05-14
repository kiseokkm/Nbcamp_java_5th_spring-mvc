package com.sparta.nbcamp_java_5th_springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class HelloController {

    //가장 많이 사용되는 get,post,put,delete  경로 중복 될 수 있음 ! 하지만 메서드는 달라야 함

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello world" ;
    }

    @GetMapping("/get")
    @ResponseBody
    public String get() {
        return "GET Method 요청" ;
    }

    @PostMapping ("/post")
    @ResponseBody
    public String post() {
        return "POST Method 요청" ;
    }

    @PutMapping ("/put")
    @ResponseBody
    public String put() {
        return "PUT Method 요청" ;
    }

    @DeleteMapping ("/delete")
    @ResponseBody
    public String delete() {
        return "DELETE Method 요청" ;
    }


}
