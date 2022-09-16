package com.demo.awsdemo.dao;

import org.springframework.http.ResponseEntity;

public class DemoDao {

    public ResponseEntity<String> get() {
        return ResponseEntity.ok("ok");
    }

    public ResponseEntity<String> put(){
        return ResponseEntity.ok("ok");
    }

    public ResponseEntity<String> post(){
        return ResponseEntity.ok("ok");
    }

    public ResponseEntity<String> delete(String input) {
        return ResponseEntity.ok(input);
    }

}
