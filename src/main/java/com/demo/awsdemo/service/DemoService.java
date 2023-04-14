package com.demo.awsdemo.service;

import com.demo.awsdemo.dao.DemoDAO;
import com.demo.awsdemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Optional;

@Component
public class DemoService {

//    DemoDAO demoDao = new DemoDAO();
    @Autowired
    DemoDAO demoDao;
    public Optional<Student> getStudent(int id) {
        return demoDao.get(id);
    }

    public Collection<Student> getAllStudent() {
        return demoDao.getAll();
    }

    public int postStudent(Student student) {
        return demoDao.post(student);
    }

    public int putStudent(Student student)
    {
        return demoDao.put(student);
    }


    public int deleteStudent(int id)
    {
        return demoDao.delete(id);
    }
}
