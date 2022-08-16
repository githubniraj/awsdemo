package com.demo.awsdemo.service;

import com.demo.awsdemo.dao.TestDao;


public class TestService {

    TestDao testDao = new TestDao();

    public String testGet(String str){
        if (str == null)
            return null;
        if(str.isEmpty())
            return "";
        if (str.equalsIgnoreCase("saroj")) //other service
            return str;
        return testDao.testGet(str);
    }

    public String testDelete(){
        return testDao.testDelete();
    }

    public String testPut(){
        return testDao.testPut();
    }

    public String testPost(){
        return testDao.testPost();
    }

}
