package com.example.demo.dao;

import com.example.demo.entity.Person;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BatchInsertsDao {

    Integer batchInsertsIgnoreRep(@Param("persons") List<Person> list);
}
