package com.example.demo.service.Impl;

import com.example.demo.dao.BatchInsertsDao;
import com.example.demo.entity.Person;
import com.example.demo.service.BatchInsertsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BatchInsertsServiceImpl implements BatchInsertsService {

    @Resource
    private BatchInsertsDao batchInsertsDao;

    @Override
    public Integer batchInsertsIgnoreRep(List<Person> list) {
        return batchInsertsDao.batchInsertsIgnoreRep(list);
    }
}
