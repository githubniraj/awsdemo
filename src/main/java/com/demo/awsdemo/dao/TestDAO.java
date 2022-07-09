package com.demo.awsdemo.dao;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

public class TestDao {
    public ResponseEntity<String> updateTest(String msg) {
        return ResponseEntity.ok(String.format("%s, You have update the message!" , msg));
    }
}
