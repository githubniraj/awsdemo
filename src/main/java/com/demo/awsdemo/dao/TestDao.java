package com.demo.awsdemo.dao;


import org.springframework.stereotype.Repository;

@Repository
public class TestDao {
    public String testGet(){
        return "Test Get";
    }

    public String testDelete(){
        return "Test Delete";
    }

    public String testPut(){
        return "Test Put";
    }

    public String testPost(){
        return "Test Post";
    }
}
