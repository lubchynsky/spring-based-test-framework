package com.lubchynsky.configuration.spring;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:host.properties")
@Getter
public class PropertiesReader {

    @Value("${host.url}")
    private String hostUrl;
}
