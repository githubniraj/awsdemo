package com.demo.awsdemo.service;

import com.demo.awsdemo.dao.DemoDAO;
import com.demo.awsdemo.model.Student;

import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Optional;

@Component
public class DemoService {





    DemoDAO demoDao = new DemoDAO();
    public Optional<Student> getStudent(int id) {
        Optional<Student> student = Optional.empty();
        try {

            if (id <= 0) {
                throw new IllegalArgumentException("Illegal arguments");
            }
            student = demoDao.get(id);
            if (!student.isPresent())
                throw new IllegalArgumentException("invalid input");
            return student;
        }
        catch (Exception e){
            return Optional.empty();
        }
    }


    public Collection<Student> getAllStudent() {
        return demoDao.getAll();
    }


    public int postStudent(Student student) {
        if(student==null || student.getId()<=0){
            throw new IllegalArgumentException("Illegal arguments");
        }
        return demoDao.post(student);
    }

    public int putStudent(Student student)
    {
        if(student==null || student.getId()<=0){
            throw new IllegalArgumentException("Illegal arguments");
        }
        return demoDao.put(student);
    }


    public int deleteStudent(int id)
    {
        if(id<=0){
            throw new IllegalArgumentException("Illegal arguments");
        }
        return demoDao.delete(id);
    }

}
