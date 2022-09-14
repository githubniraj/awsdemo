package com.demo.awsdemo.service;

import com.demo.awsdemo.dao.DemoDao;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

public class DemoService {

    DemoDao demoDao = new DemoDao();

    public ResponseEntity<String> get() {
       // HeaderToken headerTokern = HttpHeaders.readOnlyHttpHeaders();
        //headerTokern.verify()//Verify if it is for Tesla or not
        // if yes then proccess the request
        // allow ther request
        // request(latigute and longitue for Peureto rico)
        // call the db
        return demoDao.get();
        // send response
    }

    public ResponseEntity<String> put(){
        return demoDao.put();
    }

    public ResponseEntity<String> post(){
        return demoDao.post();
    }

    public ResponseEntity<String> delete() {
        return demoDao.delete();
    }

}
