package com.lubchynsky.components;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {

    public void printHello() {
        System.out.println("Hello world");
    }
}
