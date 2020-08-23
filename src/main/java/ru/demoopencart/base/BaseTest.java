package ru.demoopencart.base;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.Objects;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    private final boolean LOCALE = true;

    @BeforeMethod
    public void setup() {
        if (LOCALE) {
            baseUrl = "http://demo-opencart.ru";
            browser = "chrome";
            startMaximized = true;
            timeout = 15000;
            holdBrowserOpen = true;
            open(baseUrl);
        } else {

            Configuration.remote = "http://localhost:4444/wd/hub";
            Configuration.browser = "chrome";
            Configuration.browserSize = "1920x1080";
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            Configuration.browserCapabilities = capabilities;
        }
    }

    @AfterMethod
    public void close() {
        if (Objects.nonNull(WebDriverRunner.getWebDriver())) {
            WebDriverRunner.getWebDriver().quit();
        }
    }

}
