package com.demo.awsdemo.service;

import com.demo.awsdemo.dao.DemoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DemoService {


    @Autowired
    DemoDao demoDao;

    public ResponseEntity<String> post(String input){
        if(input == null || input.isEmpty())
            return null;
        if(input.equalsIgnoreCase("Dipsikha"))
            throw new IllegalArgumentException("Exception");
        if(input.equalsIgnoreCase("Namsang"))
            return ResponseEntity.ok("Not valid");
        return demoDao.post(input);
    }

    public ResponseEntity<String> delete(String input) {
        if(input == null || input.isEmpty())
            return null;
        if(input.equalsIgnoreCase("ThrowsTest"))
            throw new IllegalArgumentException("Exception");
        if(input.equalsIgnoreCase("namsang"))
            return ResponseEntity.ok("Invalid");
        return demoDao.delete(input);
    }

    public ResponseEntity<String> get() {
        return demoDao.get();
    }

    public ResponseEntity<String> put(){
        return demoDao.put();
    }

}
