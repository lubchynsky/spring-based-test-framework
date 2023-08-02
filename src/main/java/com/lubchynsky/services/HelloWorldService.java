package com.lubchynsky.services;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {

    public String getHello() {
        return "Hello world";
    }
}
