package com.lubchynsky.configuration.spring;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@org.springframework.test.context.ContextConfiguration(classes = ContextConfiguration.class)
public @interface UseSpringContextConfiguration {
}
