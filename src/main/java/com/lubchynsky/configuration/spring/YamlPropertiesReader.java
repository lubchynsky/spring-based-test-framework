package com.lubchynsky.configuration.spring;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:users.yml", factory = YamlPropertyReaderFactory.class)
@Getter
@Setter
public class YamlPropertiesReader {
    @Value("${users.name}")
    private String name;
    @Value("${users.surname}")
    private String surname;
}
