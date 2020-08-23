package com.example.demo.controller;

import com.example.demo.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class Test1 {

    @Resource
    private TestService testService;

    @RequestMapping("/test")
    public void test1() {
        testService.test1();
    }
}
