package com.demo.awsdemo.service;

import com.demo.awsdemo.dao.DemoDAO;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


public class DemoService {

    DemoDAO dao = new DemoDAO();
    public String getStudents(Integer id)
    {
        return dao.getStudents(id);
    }


    public String deleteStudents(Integer id)
    {
       return dao.deleteStudents(id);
    }


    public String putStudents(Integer id, String student)
    {
        return dao.putStudents(id, student);
    }

    public String postStudents(Integer id, String student)
    {
        return dao.postStudents(id, student);
    }
}
