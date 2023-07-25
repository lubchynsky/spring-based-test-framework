package com.lubchynsky.basic;

import com.lubchynsky.components.HelloWorldService;
import com.lubchynsky.configuration.spring.UseSpringContextConfiguration;
import com.lubchynsky.configuration.test.BaseTest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import static com.lubchynsky.loggers.AllureAndConsoleLogger.logInfo;

@UseSpringContextConfiguration
@Slf4j
public class HelloWorldTest extends BaseTest {
    @Autowired
    private HelloWorldService helloWorldService;

    @Test
    public void springContextTest() {
        logInfo(helloWorldService.getHello());
    }
}
