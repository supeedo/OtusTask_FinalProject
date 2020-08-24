package ru.demoopencart.driver;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import java.util.Objects;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    private final boolean LOCALE = true;

    @BeforeMethod
    public void setup() {
        if (LOCALE) {
            setUpLocaleTests();
        } else {
            setUpRemoteTests();
        }
    }

    //@AfterMethod
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
        open(baseUrl);
    }

    public void setUpRemoteTests(){
        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;
    }

}
