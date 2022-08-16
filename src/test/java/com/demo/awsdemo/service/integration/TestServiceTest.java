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

    @Test
    void testGetWithBipasha(){
        String actualValue  = testService.testGet("bipasha");
        Assertions.assertEquals("bipasha", actualValue);
    }


}
