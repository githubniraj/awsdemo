package com.demo.awsdemo.unit;

import com.demo.awsdemo.dao.DemoDAO;
import com.demo.awsdemo.model.Student;
import com.demo.awsdemo.service.DemoService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(MockitoExtension.class)
public class DemoServiceTest {

    @Mock
    private DemoDAO demoDAO;

    @InjectMocks
    private DemoService demoService;

    private Student std;

    @BeforeAll
    public void setUp() {
        std = new Student(10, "Ram");
        MockitoAnnotations.openMocks(this);
    }


    @Test
    public void testGetStudentHappyPath(){
        Mockito.when(demoDAO.get(Mockito.anyInt())).thenReturn(Optional.of(new Student()));
        Optional<Student> student = demoService.getStudent(1);
        assertTrue(student.get()!=null);
        assertEquals(null, student.get().getName());
        Mockito.verify(demoDAO, Mockito.times(1)).get(Mockito.anyInt());
    }


    @Test
    public void testGetStudentEmptyHappyPath(){
        Mockito.when(demoDAO.get(Mockito.anyInt())).thenReturn(Optional.empty());
        Optional<Student> student = demoService.getStudent(1);
        assertTrue(student.get()!=null);
        assertEquals(null, student.get().getName());
        Mockito.verify(demoDAO, Mockito.times(1)).get(Mockito.anyInt());
    }

    @Test
    public void testGetStudentExceptionPath(){
        Mockito.when(demoDAO.get(Mockito.anyInt())).thenThrow(new IllegalArgumentException("Illegal arguments"));
        Optional<Student> student = demoService.getStudent(1);
        assertTrue(!student.isPresent());
        Mockito.verify(demoDAO,Mockito.times(1)).get(Mockito.anyInt());
    }

    @Test
    public void testPostStudentHappyPath(){
        Mockito.when(demoDAO.post(Mockito.any(Student.class))).thenReturn(1);
        int returnValue = demoService.postStudent(std);
        assertTrue(returnValue==1);
        assertTrue(std!=null);
        assertEquals(returnValue, 1);
        Mockito.verify(demoDAO, Mockito.times(1)).post(std);
    }

    @Test
    public void testPostStudentExceptionPath(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            demoService.postStudent(null);
        });
        String expectedMessage = "Illegal arguments";
        String actualMessage = exception.getMessage();
    }
}