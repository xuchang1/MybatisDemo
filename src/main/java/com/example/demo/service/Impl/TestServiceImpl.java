package com.example.demo.service.Impl;

import com.example.demo.dao.TestDao;
import com.example.demo.entity.Test;
import com.example.demo.entity.Test1;
import com.example.demo.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Resource
    private TestDao testDao;

    @Override
    public void test1() {
        List<Test1> list1 = testDao.test();

        List<Test> list2 = testDao.testList();
    }
}
