package com.lubchynsky.configuration.spring;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * This class is used to read configuration from properties file
 */
@Configuration
@PropertySource("classpath:host.properties")
@Getter
public class PropertiesReader {

    @Value("${ui.host.url}")
    private String uiHostUrl;

    @Value("${api.host.url}")
    private String apiHostUrl;
}
