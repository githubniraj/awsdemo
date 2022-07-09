package com.demo.awsdemo.dao;

import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Repository;

@Repository
public class TestDao {
    public ResponseEntity<String> updateTest(String msg) {
        return ResponseEntity.ok(String.format("%s, You have update the message!" , msg));
    }
    public ResponseEntity<String> postTest(String str){
        return ResponseEntity.ok(String.format("Post this message", str));
    }

    public ResponseEntity<String> deleteTest() {
        return ResponseEntity.ok(String.format( " delete successfully"));
    }
}


