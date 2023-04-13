package com.demo.awsdemo.service;

import com.demo.awsdemo.dao.DemoDAO;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


public class DemoService {

    DemoDAO dao = new DemoDAO();
    public String getStudents()
    {
        return dao.getStudents();
    }


    public String deleteStudents()
    {
        return dao.deleteStudents();
    }


    public String putStudents()
    {
        return dao.putStudents();
    }

    public String postStudents()
    {
        return dao.postStudents();
    }


}
