
package com.demo.awsdemo.service;

import com.demo.awsdemo.bean.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DemoServiceTest
{
    DemoService demoService;
    @BeforeAll
    void setUp()
    {
        demoService = new DemoService();
    }

    @Test
    void testGetAllStudents() {
       List<Student> listStudents =  demoService.getallStudents();
        Assertions.assertTrue(listStudents.size()>=2);
    }

    @Test
    void testGetStudentbyID() {
        Student student =  demoService.getStudentsbyID(1);
        Assertions.assertEquals(1,student.getId());
        Assertions.assertEquals("Namshang", student.getName());
    }

    @Test
    void testGetStudentbyIDDOE() {
        RuntimeException thrown = Assertions.assertThrows(RuntimeException.class, () -> {
            //Code under test
            demoService.getStudentsbyID(3);
        });
        Assertions.assertEquals("Id does not exist!!!!!", thrown.getMessage());
    }

    @Test
    void testGetStudentbyInvalidInput() {
        IllegalArgumentException thrown = Assertions.assertThrows( IllegalArgumentException.class, () -> {
            //Code under test
            demoService.getStudentsbyID(0);
        });
        Assertions.assertEquals("Invalid input", thrown.getMessage());
    }

    @Test
    void testAddStudents() {
        Student student = new Student(3, "Mahima");
        Student addStudent = demoService.addStudents(student);
        assertNotNull(addStudent);
        Assertions.assertEquals("Mahima", addStudent.getName());
        Assertions.assertEquals(3, addStudent.getId());
    }

    @Test
    void testAddStudentsAlreadyExists() {
        RuntimeException thrown = Assertions.assertThrows(RuntimeException.class, () -> {
            Student student = new Student(2, "Mahima");
            demoService.addStudents(student);
        });
        Assertions.assertEquals("Id exist already!!!!!", thrown.getMessage());
    }

    @Test
    void testAddStudentsNull() {
        NullPointerException thrown = Assertions.assertThrows(NullPointerException.class, () -> {
            demoService.addStudents(null);
        });
        Assertions.assertEquals("Null input", thrown.getMessage());
    }

    @Test
    void testGetStudentbyName() {
        Student student =  demoService.getStudentsbyName("Deepa");
        Assertions.assertEquals(2,student.getId());
        Assertions.assertEquals("Deepa", student.getName());
    }

    @Test
    void testGetStudentbyNameNull() {
        NullPointerException thrown = Assertions.assertThrows(NullPointerException.class, () -> {
            //Code under test
            demoService.getStudentsbyName(null);
        });
        Assertions.assertEquals("Null input", thrown.getMessage());
    }

    @Test
    void testGetStudentbyNameDoesnotExist() {
        RuntimeException thrown = Assertions.assertThrows(RuntimeException.class, () -> {
            //Code under test
            demoService.getStudentsbyName("Puja");
        });
        Assertions.assertEquals("Name does not exist!", thrown.getMessage());
    }
}