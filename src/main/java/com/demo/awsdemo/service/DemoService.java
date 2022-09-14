package com.demo.awsdemo.service;


import com.demo.awsdemo.dao.DemoDao;
import org.springframework.http.HttpHeaders;

import org.springframework.http.ResponseEntity;

public class DemoService {


    DemoDao demoDao = new DemoDao();

    public ResponseEntity<String> post(String input){
        if(input == null || input.isEmpty())
            return null;
        if(input.equalsIgnoreCase("Dipsikha"))
            throw new IllegalArgumentException("Exception");
        if(input.equalsIgnoreCase("Namsang"))
            return ResponseEntity.ok("Not valid");
        return demoDao.post(input);
    }




    public ResponseEntity<String> get() {
        return demoDao.get();
    }
    public ResponseEntity<String> put(){
        return demoDao.put();
    }

    public ResponseEntity<String> delete() {
        return demoDao.delete();

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
