package com.demo.awsdemo.service;

import com.demo.awsdemo.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    TestDao testDao;

    public void testMethod(){
        System.out.println("Modified method statement");
    }

    public ResponseEntity<String> updateTest(String hello) {

        return  ResponseEntity.ok(String.format("%s , update successfully", hello));
    }

    public ResponseEntity<String> deleteTest() {
       return testDao.deleteTest();
    }
}
