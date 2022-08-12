package com.demo.awsdemo.service;

import com.demo.awsdemo.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TestService {

    @Autowired
    TestDao testDao;

    public String testGet(){
        return testDao.testGet();
    }

    public String testDelete(){
        return testDao.testDelete();
    }

    public String testPut(){
        return testDao.testPut();
    }

    public String testPost(){
        return testDao.testPost();
    }

}
