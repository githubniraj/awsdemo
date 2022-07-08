package com.demo.awsdemo.dao;

import org.springframework.http.ResponseEntity;

public class TestDao {

    public ResponseEntity<String> deleteTest() {
        return ResponseEntity.ok(String.format( " delete successfully"));
    }
}
