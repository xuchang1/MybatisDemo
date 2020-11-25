package com.example.demo.service;

import com.example.demo.entity.Person;

import java.util.List;

public interface BatchInsertsService {

    Integer batchInsertsIgnoreRep(List<Person> list);
}
