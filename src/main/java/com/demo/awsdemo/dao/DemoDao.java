package com.demo.awsdemo.dao;

import com.demo.awsdemo.bean.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class DemoDao
{
    private static HashMap<Integer, Student> studentsMap;

    public DemoDao()
    {
        studentsMap = new HashMap<Integer, Student>();
        Student student = new Student(1, "Namshang");
        Student student1 = new Student(2, "Deepa");
        studentsMap.put(1, student);
        studentsMap.put(2, student1);
    }

    // Get all students
    public List demoGet()
    {
        List<Student> students = new ArrayList(studentsMap.values());
        return students;
    }


    //Get students by id
    public Student demoGetbyID (int id) throws RuntimeException
    {
        if(studentsMap.containsKey(id)) {
        Student student = studentsMap.get(id);
        return student;
    }
    throw new RuntimeException("Id does not exist!!!!!");
    }

    //Get students by name
    public Student demogetbyName (String name) {
        Student student = null;
        for (int i : studentsMap.keySet()) {
            if (studentsMap.get(i).getName().equals(name)) {
                student = studentsMap.get(i);
                return student;
            }
        }
        throw new RuntimeException("Name does not exist!");
    }

    //Add students and automatically generate id using utility method
    public Student demoAdd(Student student) {
        if (studentsMap.containsKey(student.getId())) {
            throw new RuntimeException("Id exist already!!!!!");
        }
        student.setId(demoGetMaxId());
        studentsMap.put(student.getId(), student);
        return student;
    }

    //utility method to get max id
    public static int demoGetMaxId()
    {
        int max = 0;
        for (int id:studentsMap.keySet())
            if (max <= id)
                max = id;
        return max +1;
    }

    //Update existing students

    public Student demoUpdate (Student student) throws RuntimeException
    {
        if (studentsMap.containsKey(student.getId()) || student.getId()>0)
        {
            studentsMap.put(student.getId(), student);
            return student;
        }
        else
            throw new RuntimeException("Cannot update as Id exist already!!!!!");
    }

    //Delete existing students by id

    public String demoDelete (int id) throws RuntimeException
    {
        if(studentsMap.containsKey(id))
        {
            studentsMap.remove(id);
            return "It's removed okay :). Please check it to make sure.";

        }
        throw new RuntimeException("Id does not exist!!!!!");
    }
}
