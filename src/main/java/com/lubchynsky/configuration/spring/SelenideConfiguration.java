package com.lubchynsky.configuration.spring;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:selenide.properties")
@Getter
public class SelenideConfiguration {

    @Value("${remote.hub.url}")
    private String remoteHubUrl;
    @Value("${browser}")
    private String browser;
}
