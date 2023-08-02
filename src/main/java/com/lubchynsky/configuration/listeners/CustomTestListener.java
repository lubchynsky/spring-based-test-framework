package com.lubchynsky.configuration.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import static com.lubchynsky.configuration.loggers.AllureAndConsoleLogger.logInfo;

/**
 * <h1>Custom Listener class</h1>
 * When added to TestNG test class, listener will produce informational logs
 * in console and allure report about test status.
 *
 * @author  Lubchynsky
 * @version 1.0
 */
public class CustomTestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        logInfo(String.format("TEST STARTED: %s", result.getTestClass().getName()));
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        logInfo(String.format("TEST PASSED: %s", result.getTestClass().getName()));
    }

    @Override
    public void onTestFailure(ITestResult result) {
        logInfo(String.format("TEST FAILED: %s", result.getTestClass().getName()));
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        logInfo(String.format("TEST SKIPPED: %s", result.getTestClass().getName()));
    }
}
