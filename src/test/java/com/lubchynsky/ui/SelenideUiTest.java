package com.lubchynsky.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import static com.lubchynsky.configuration.loggers.AllureAndConsoleLogger.logInfo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

/**
 * This test class uses Selenide-base page object
 */
public class SelenideUiTest extends BaseUiTest {

    @Autowired
    private SelenideHomePage selenideHomePage;

    @Test
    public void selenideHomePageTest() {
        String releasedVersion = selenideHomePage.openPage()
                .getReleasedVersion();
        assertThat(releasedVersion, containsString("Released Selenide"));
        logInfo(releasedVersion);
    }
}
