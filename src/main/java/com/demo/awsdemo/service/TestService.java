package com.demo.awsdemo.service;

import com.demo.awsdemo.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TestService {
    TestDao testDao = new TestDao();

    public String testGet(String str){
        if (str == null)
            return null;
        if(str.isEmpty())
            return "";
        if (str.equalsIgnoreCase("saroj")) //other service
            return str;
        if(str.equalsIgnoreCase("exception"))
            return str;
        return testDao.testGet(str);
    }

    public String testDelete(String id){
        if (id == null)
            return null;
        if(id.isEmpty())
            return "";
        if (id.equalsIgnoreCase("ajay"))
            return id;
        return testDao.testDelete(id);
    }

    public String testPut(String id){
        if (id == null)
            return null;
        if(id.isEmpty())
            return "";
        if (id.equalsIgnoreCase("ajay"))
            return id;

        return testDao.testPut(id);
    }

    public String testPost(String id){
        if (id == null)
            return null;
        if(id.isEmpty())
            return "";
        if (id.equalsIgnoreCase("ajay"))
            return id;
        if (id.equalsIgnoreCase("saroj")) //other service
            return id;
        if(id.equalsIgnoreCase("exception"))
            return id;
        return testDao.testPost(id);
    }

}
