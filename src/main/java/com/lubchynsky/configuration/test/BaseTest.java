package com.lubchynsky.configuration.test;

import com.lubchynsky.configuration.listeners.CustomTestListener;
import com.lubchynsky.configuration.spring.UseSpringContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Listeners;

@Listeners(CustomTestListener.class)
@UseSpringContextConfiguration
public class BaseTest extends AbstractTestNGSpringContextTests {
}
