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
        setupRemoteDriverIfPresent();
        setupBrowser();
    }

    private void setupRemoteDriverIfPresent() {
        /*
         * By default, selenide will start driver locally.
         * To start it in selenium grid, "-Dremote" option should be used or "remote" profile selected
         * */
        if (System.getProperty("remote") != null) {
            Configuration.remote = selenideConfiguration.getRemoteHubUrl();
        }
    }

    private void setupBrowser() {
        /*
         * By default, selenide will start test on chrome browser.
         * To select diff browser, -Dbrowser=<type> option should be used or maven profile selected.
         * Browser types: firefox, chrome or edge
         * */
        Configuration.browser = System.getProperty("browser", "chrome");
    }
}
