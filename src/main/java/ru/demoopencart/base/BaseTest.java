package ru.demoopencart.base;


import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.open;

import java.util.Objects;

public class BaseTest {

    @BeforeMethod
    public void setup() {
        baseUrl = "http://demo-opencart.ru";
        browser = "chrome";
        startMaximized = true;
        timeout = 15000;
        holdBrowserOpen = true;
        open(baseUrl);
    }

    @AfterMethod
    public void close() {
        if (Objects.nonNull(WebDriverRunner.getWebDriver())) {
            WebDriverRunner.getWebDriver().quit();
        }
    }

}
