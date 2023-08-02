package com.lubchynsky.basic;

import com.lubchynsky.configuration.test.BaseTest;
import com.lubchynsky.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import static com.lubchynsky.configuration.loggers.AllureAndConsoleLogger.logInfo;

/**
 * Basic class to test Spring context
 */
public class HelloWorldTest extends BaseTest {
    @Autowired
    private HelloWorldService helloWorldService;

    @Test
    public void springContextTest() {
        logInfo(helloWorldService.getHello());
    }
}
