package com.lubchynsky.components;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {

    public String getHello() {
        return "Hello world";
    }
}
