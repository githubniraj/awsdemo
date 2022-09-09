package com.demo.awsdemo.service;

import org.springframework.http.ResponseEntity;

public class DemoService {

    public ResponseEntity<String> get() {
        return ResponseEntity.ok("ok");
    }

    public ResponseEntity<String> put(){
        return ResponseEntity.ok("ok");
    }

    public ResponseEntity<String> post(){
        return ResponseEntity.ok("ok");
    }

    public ResponseEntity<String> delete() {
        return ResponseEntity.ok("ok");
    }

}
