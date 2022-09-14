package com.demo.awsdemo.service.intregration;

import com.demo.awsdemo.service.DemoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DemoServiceTest {
    DemoService service;

    @BeforeAll
    void setUp(){
        service = new DemoService();
    }



    @Test
    void testPostWithNull() {
        ResponseEntity response = service.post(null);
        Assertions.assertEquals(null, response);
    }

    @Test
    void testPostWithEmpty() {
        ResponseEntity response = service.post("");
        Assertions.assertEquals(null, response);
    }

    @Test
    void testPostWithDipsikha() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            service.post("Dipsikha");
        });
        String expectedMessage = "Exception";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void testPostWithNamsang() {
        String input = "Namsang";
        ResponseEntity response = service.post(input);
        String actual= (String)response.getBody();
        Assertions.assertEquals("Not valid",actual);

    }

    @Test
    void testPost() {
        String input = "mangal";
        ResponseEntity response = service.post(input);
        String responseBody = (String) response.getBody();
        Assertions.assertEquals("mangal", responseBody);
    }

}
