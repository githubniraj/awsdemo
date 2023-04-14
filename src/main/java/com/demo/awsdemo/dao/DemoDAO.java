package com.demo.awsdemo.dao;

import java.util.*;
public class DemoDAO {
    HashMap <Integer, String> students = new HashMap<>();

    public DemoDAO (){
        students.put(1, "Surendra");
        students.put(2, "Milind");
        students.put(3, "Sanjay");
    }

    // Check is key exists in the Map
    boolean isIdPresent;
    public String getStudents(Integer id)
    {
        // Check if key exists in the Map
        isIdPresent = students.containsKey(id);

        if (isIdPresent) {
            return students.get(id);
        }
        return ("Student with id "+ id +" is not found...");
    }

    public String deleteStudents(Integer id)
    {
        isIdPresent = students.containsKey(id);
        if (isIdPresent) {
            students.remove(id);
            return ("Student with id "+ id +" has been deleted...");
        }
        return ("Student with id "+ id +" is not found. Cannot be deleted..");
    }

    public String putStudents(Integer id, String student)
    {
        isIdPresent = students.containsKey(id);
        if (isIdPresent){
            students.put(id, student);
            return ("Student with id "+id+" has been updated with name "+student);
        }
        return ("Student with id "+ id+" does not exists. Cannot be updated.");
    }

    public String postStudents(Integer id, String student)
    {
        isIdPresent = students.containsKey(id);
        if (!isIdPresent){
            students.put(id, student);
            return ("Student " +student+ " with id "+id+" has been added.");
        }
        return ("Student with id "+ id+" already exists. Cannot be added.");
    }

}
