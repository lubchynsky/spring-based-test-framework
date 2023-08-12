package com.lubchynsky.ui;

import com.codeborne.selenide.Configuration;
import com.lubchynsky.configuration.spring.SelenideConfiguration;
import com.lubchynsky.configuration.test.BaseTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.BeforeClass;

public class BaseUiTest extends BaseTest {
    @Autowired
    private SelenideConfiguration selenideConfiguration;

    @BeforeClass
    public void setupSelenide() {
        /*
         * By default, selenide will start driver locally.
         * To start it selenium grid, "-Dremote" option should be used
         * */
        if (System.getProperty("remote") != null) {
            Configuration.remote = selenideConfiguration.getRemoteHubUrl();
            Configuration.browser = selenideConfiguration.getBrowser();
        }
    }
}
