package com.demo.awsdemo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class TestDao {

    public String getTest() {
        return "Get testing";
    }

    public String postTest() {
        return "Post testing";
    }

    public String updateTest() {
        return "Update testing";
    }

    public String deleteTest() {
        return "Delete testing";
    }
}
