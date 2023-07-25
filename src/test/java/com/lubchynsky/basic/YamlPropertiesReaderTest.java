package com.lubchynsky.basic;

import com.lubchynsky.configuration.spring.YamlPropertiesReader;
import com.lubchynsky.configuration.test.BaseTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import static com.lubchynsky.configuration.loggers.AllureAndConsoleLogger.logInfo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

public class YamlPropertiesReaderTest extends BaseTest {
    @Autowired
    private YamlPropertiesReader propertiesReader;

    @Test
    public void springContextTest() {
        assertThat(propertiesReader.getName(), is(notNullValue()));
        assertThat(propertiesReader.getSurname(), is(notNullValue()));
        logInfo(propertiesReader.getName());
        logInfo(propertiesReader.getSurname());
    }
}
