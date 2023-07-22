package com.lubchynsky.basic;

import com.lubchynsky.components.HelloWorldService;
import com.lubchynsky.configuration.spring.UseSpringContextConfiguration;
import com.lubchynsky.configuration.test.BaseTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

@UseSpringContextConfiguration
public class HelloWorldTest extends BaseTest {

    @Autowired
    private HelloWorldService helloWorldService;

    @Test
    public void springContextTest() {
        helloWorldService.printHello();
    }
}
