package com.demo.awsdemo.dao;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public class TestDAO {

    public ResponseEntity<String> postTest(String str){

       return ResponseEntity.ok(String.format("Post this message", str));
    }
}
