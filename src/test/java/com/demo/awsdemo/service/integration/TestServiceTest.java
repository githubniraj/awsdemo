package com.demo.awsdemo.service.integration;

import com.demo.awsdemo.service.TestService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestServiceTest {

    TestService testService;

    @BeforeAll
    void setUp(){
        testService = new TestService();
    }

    @Test
    void testGetNull(){
        String actualValue  = testService.testGet(null);
        Assertions.assertEquals(null, actualValue);
    }


    @Test
    void testGetEmpty(){
        String actualValue  = testService.testGet("");
        Assertions.assertEquals("", actualValue);
    }

    @Test
    void testGetWithSaroj(){
        String actualValue  = testService.testGet("saroj");
        Assertions.assertEquals("saroj", actualValue);
    }
/*
    @Test(expected = RuntimeException.class)
    void testGetWithException(){
        String actualValue  = testService.testGet("exception");
        Assertions.assertEquals("exception", actualValue);
    }
   */


    @Test
    void testGetWithBipasha(){
        String actualValue  = testService.testGet("bipasha");
        Assertions.assertEquals("bipasha", actualValue);
    }
    @Test
    void testDeleteNull(){
        String actualValue  = testService.testDelete(null);
        Assertions.assertEquals(null, actualValue);
    }


    @Test
    void testDeleteEmpty(){
        String actualValue  = testService.testDelete("");
        Assertions.assertEquals("", actualValue);
    }

    @Test
    void testDeleteWithAjay(){
        String actualValue  = testService.testDelete("ajay");
        Assertions.assertEquals("ajay", actualValue);
    }

    @Test
    void testDeleteWithSaroj(){
        String actualValue  = testService.testDelete("saroj");
        Assertions.assertEquals("saroj", actualValue);
    }

    @Test
    void testPostNull(){
        String actualValue  = testService.testPost(null);
        Assertions.assertEquals(null, actualValue);
    }

    @Test
    void testPostEmpty(){
        String actualValue  = testService.testPost("");
        Assertions.assertEquals("", actualValue);
    }

    @Test
    void testPostWithAjay(){
        String actualValue  = testService.testPost("ajay");
        Assertions.assertEquals("ajay", actualValue);
    }

    @Test
    void testPostWithSaroj(){
        String actualValue  = testService.testPost("saroj");
        Assertions.assertEquals("saroj", actualValue);
    }




    @Test
    void testPutNull(){
        String actualValue  = testService.testPut(null);
        Assertions.assertEquals(null, actualValue);
    }

    @Test
    void testPutEmpty(){
        String actualValue  = testService.testPut("");
        Assertions.assertEquals("", actualValue);
    }

    @Test
    void testPutWithAjay(){
        String actualValue  = testService.testPut("ajay");
        Assertions.assertEquals("ajay", actualValue);
    }

    @Test
    void testPutWithSaroj(){
        String actualValue  = testService.testPut("saroj");
        Assertions.assertEquals("saroj", actualValue);
    }




}
