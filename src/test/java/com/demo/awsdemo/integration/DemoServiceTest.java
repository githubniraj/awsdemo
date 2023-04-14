package com.demo.awsdemo.integration;

import com.demo.awsdemo.model.Student;
import com.demo.awsdemo.service.DemoService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DemoServiceTest {
    DemoService demoService;
    @BeforeAll
    void setUp(){
        demoService = new DemoService();
    }
    @Test
    public void testGetStudentNegativePath(){

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            demoService.getStudent(0);
        });

        String expectedMessage = "Illegal arguments";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testGetStudentHappyPath(){

        Optional<Student> student = demoService.getStudent(1);
        assertTrue(student.get()!=null);
        assertEquals("Sanchay", student.get().getName());
    }
}
