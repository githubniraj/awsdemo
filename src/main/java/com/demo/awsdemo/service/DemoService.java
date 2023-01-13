package com.demo.awsdemo.service;

import com.demo.awsdemo.bean.Student;
import com.demo.awsdemo.dao.DemoDao;
import java.util.List;

public class DemoService {

    private DemoDao demoDao = new DemoDao();

    public List<Student> getallStudents() {
        return demoDao.demoGet();
    }

    public Student getStudentsbyID (int id)
    {
        if (id == 0)
            throw new IllegalArgumentException("Invalid input");
        return demoDao.demoGetbyID(id);
    }

    public Student getStudentsbyName (String name)
    {
        return demoDao.demogetbyName(name);
    }

    public Student addStudents (Student student)
    {
        return demoDao.demoAdd(student);
    }


    public Student updateStudents (Student student)
    {
        return demoDao.demoUpdate(student);
    }


    public String deleteStudents(int id)
    {
        return demoDao.demoDelete(id);
    }

}
