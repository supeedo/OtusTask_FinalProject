package ru.demoopencart.driver;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.Objects;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.open;

public class InitDriver {
    private final boolean LOCALE = false;

    @BeforeMethod
    public void setup() {
        if (LOCALE) {
            setUpLocaleTests();
        } else {
            setUpRemoteTests();
        }
        open(baseUrl);
    }

    @AfterMethod
    public void close() {
        if (Objects.nonNull(WebDriverRunner.getWebDriver())) {
            WebDriverRunner.getWebDriver().quit();
        }
    }

    public void setUpLocaleTests(){
        baseUrl = "http://demo-opencart.ru";
        browser = "chrome";
        startMaximized = true;
        timeout = 15000;
        holdBrowserOpen = true;
    }

    public void setUpRemoteTests(){
        baseUrl = "http://demo-opencart.ru";
        remote = "http://localhost:4444/wd/hub";
        Configuration.browser = "chrome";
        browserVersion = "84";
        browserSize = "1920x1080";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);
        browserCapabilities = capabilities;
    }

}
