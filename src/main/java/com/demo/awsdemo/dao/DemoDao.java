package com.demo.awsdemo.dao;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public class DemoDao {

    public ResponseEntity<String> get() {
        return ResponseEntity.ok("ok");
    }

    public ResponseEntity<String> put(){
        return ResponseEntity.ok("ok");
    }

    public ResponseEntity<String> post(String input){
        return ResponseEntity.ok("Devendra");
    }

    public ResponseEntity<String> delete(String input) {
        return ResponseEntity.ok(input);
    }

}
