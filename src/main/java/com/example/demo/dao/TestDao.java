package com.example.demo.dao;

import com.example.demo.entity.Test;
import com.example.demo.entity.Test1;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestDao {
    List<Test1> test();

    List<Test> testList();
}
