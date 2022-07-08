package com.demo.awsdemo.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    public void testMethod(){
        System.out.println("Modified method statement");
    }

    public ResponseEntity<String> updateTest(String hello) {

        return  ResponseEntity.ok(String.format("%s , update successfully", hello));
    }

    public ResponseEntity<String> deleteTest() {

        return  ResponseEntity.ok(String.format("delete successfully"));
    }
}
