package com.demo.awsdemo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class TestDao {
    public String updateTest() {
        return "Update successfully";
    }

    public String getTest() {

        return "get successfully";
    }

    public String postTest() {
        return "Post successfully";

    }

    public String deleteTest() {
        return "delete successfully";
    }
}


