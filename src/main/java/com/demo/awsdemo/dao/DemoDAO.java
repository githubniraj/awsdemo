package com.demo.awsdemo.dao;


import com.demo.awsdemo.model.Student;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class DemoDAO {

    Set<Student> students = new HashSet<>();
    public DemoDAO(){
        this.students.add(new Student(1, "Sanchay"));
        this.students.add(new Student(2, "Surendra"));
        this.students.add(new Student(3, "Mil"));
    }

    public Optional<Student> get(int id) {
        Student student = students.stream().filter(std->id == std.getId()).findFirst().orElse(null);
        return Optional.ofNullable(student);
    }

    public boolean idExists(int id){
        Student student = students.stream().filter(std->id == std.getId()).findFirst().orElse(null);
        if(student==null){
            return false;
        }
        else{
            return true;
        }
    }

    public Collection<Student> getAll() {
        return students;
    }

    public int post(Student student) {
        if(idExists(student.getId())){
            return 0;
        }else{
            this.students.add(student);
            return 1;
        }
    }

    public int put(Student student) {
        this.students.remove(students.stream().filter(std->student.getId() == std.getId()).findFirst().orElse(null));
        this.students.add(student);
        return 1;
    }

    public int delete(int id) {
        this.students.remove(students.stream().filter(std->id == std.getId()).findFirst().orElse(null));
        return 1;
    }

}
