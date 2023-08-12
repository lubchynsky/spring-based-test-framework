package com.lubchynsky.ui;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.lubchynsky.configuration.spring.PropertiesReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$x;

@Component
public class SelenideHomePage {

    private static final SelenideElement releasedSelenideVersion = $x("//div[contains(@class, 'news')]//*[contains(text(),'Released Selenide')]");

    @Autowired
    private PropertiesReader propertiesReader;

    public SelenideHomePage openPage() {
        Selenide.open(propertiesReader.getUiHostUrl());
        return this;
    }

    public String getReleasedVersion() {
        return releasedSelenideVersion.shouldBe(Condition.visible)
                .getText();
    }

}
