package ru.demoopencart.entities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


public class ChromeBrowser {

    public ChromeOptions getBrowserOptions() {
        return new ChromeOptions();
    }


    public RemoteWebDriver getRemoteDriver() throws MalformedURLException {
        return new RemoteWebDriver(
                new URL("http://0.0.0.0:4444/wd/hub"),
                getCapabilities()
        );
    }

    public WebDriver getDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(getBrowserOptions());
    }



    public DesiredCapabilities getCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setVersion("84.0");
        capabilities.setCapability(ChromeOptions.CAPABILITY, getBrowserOptions());
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);
        return capabilities;
    }
}
