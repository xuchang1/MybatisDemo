package com.example.demo.controller;

import com.example.demo.entity.Person;
import com.example.demo.service.BatchInsertsService;
import com.example.demo.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Test1 {

    @Resource
    private TestService testService;

    @Resource
    private BatchInsertsService batchInsertsService;

    @RequestMapping("/test")
    public void test1() {
        testService.test1();
    }

    @RequestMapping("/batchInsertsIgnoreRep")
    public void batchInsertsIgnoreRep() {
        List<Person> peopleList = new ArrayList<>();
        peopleList.add(new Person("小明", 20));
        peopleList.add(new Person("小率", 30));
        System.out.println(batchInsertsService.batchInsertsIgnoreRep(peopleList));
    }
}
