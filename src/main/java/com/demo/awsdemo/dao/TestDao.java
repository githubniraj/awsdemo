package com.demo.awsdemo.dao;


import org.springframework.stereotype.Repository;

@Repository
public class TestDao {
    public String testGet(String str){
        return str;
    }

    public String testDelete(String id){
        return id;
    }

    public String testPut(){
        return "Test Put";
    }

    public String testPost(){
        return "Test Post";
    }
}
