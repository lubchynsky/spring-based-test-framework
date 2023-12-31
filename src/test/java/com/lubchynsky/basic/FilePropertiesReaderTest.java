package com.lubchynsky.basic;

import com.lubchynsky.configuration.spring.PropertiesReader;
import com.lubchynsky.configuration.test.BaseTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import static com.lubchynsky.configuration.loggers.AllureAndConsoleLogger.logInfo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

/**
 * This test class uses simple properties reader
 */
public class FilePropertiesReaderTest extends BaseTest {
    @Autowired
    private PropertiesReader propertiesReader;

    @Test
    public void springContextTest() {
        assertThat(propertiesReader.getUiHostUrl(), is(notNullValue()));
        logInfo(propertiesReader.getUiHostUrl());
    }
}
