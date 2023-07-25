package com.lubchynsky.loggers;

import lombok.extern.slf4j.Slf4j;

import static io.qameta.allure.Allure.step;

@Slf4j
public class AllureAndConsoleLogger {

    public static void logInfo(String info) {
        step(info);
        log.info(info);
    }
}
