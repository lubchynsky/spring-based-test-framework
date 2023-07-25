package com.lubchynsky.basic;

import com.lubchynsky.components.HelloWorldService;
import com.lubchynsky.configuration.test.BaseTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import static com.lubchynsky.configuration.loggers.AllureAndConsoleLogger.logInfo;

public class HelloWorldTest extends BaseTest {
    @Autowired
    private HelloWorldService helloWorldService;

    @Test
    public void springContextTest() {
        logInfo(helloWorldService.getHello());
    }
}
