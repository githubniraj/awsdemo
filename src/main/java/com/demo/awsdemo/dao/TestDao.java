package com.demo.awsdemo.dao;


import org.springframework.http.ResponseEntity;

public class TestDao {

    public ResponseEntity<String> getTest() {

        return  ResponseEntity.ok(String.format("get successfully"));
    }
}
