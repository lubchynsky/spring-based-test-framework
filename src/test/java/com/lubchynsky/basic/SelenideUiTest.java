package com.lubchynsky.basic;

import com.codeborne.selenide.Selenide;
import com.lubchynsky.configuration.test.BaseTest;
import com.lubchynsky.ui.SelenideHomePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import static com.lubchynsky.configuration.loggers.AllureAndConsoleLogger.logInfo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;


public class SelenideUiTest extends BaseTest {

    @Autowired
    private SelenideHomePage selenideHomePage;

    @Test
    public void selenideHomePageTest(){
        String releasedVersion = selenideHomePage.openPage()
                        .getReleasedVersion();
        assertThat(releasedVersion, containsString("Released Selenide"));
        logInfo(releasedVersion);
    }

}
