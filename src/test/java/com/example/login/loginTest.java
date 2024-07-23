package com.example.login;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class LoginTest {

    private AndroidDriver<AndroidElement> driver;

    @BeforeEach
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "MyDevice");
        capabilities.setCapability("app", "/path/to/my/app.apk");
        // Add other capabilities as needed

        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), capabilities);
    }

    @Test
    void testLoginFunctionality() {
        MobileElement loginField = driver.findElementById("com.example:id/loginField");
        loginField.sendKeys("username");
        MobileElement passwordField = driver.findElementById("com.example:id/passwordField");
        passwordField.sendKeys("password");
        MobileElement loginButton = driver.findElementById("com.example:id/loginButton");
        loginButton.click();
        // Add assertions as needed
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
