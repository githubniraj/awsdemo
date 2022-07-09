package com.demo.awsdemo.service;

import com.demo.awsdemo.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    TestDao testDao;

    public String getTest() {

        return testDao.getTest();
    }

    public String postTest() {
        return testDao.postTest();
    }

    public String updateTest() {
        return testDao.updateTest();
    }

    public String deleteTest() {
        return testDao.deleteTest();
    }


}
