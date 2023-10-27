package com.lbg;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;
class AppTest {

    @Test
    void main() {

    }

    @Test
    void login() {
        App app = new App();
        WebDriver driver= app.getDriver();
        app.login();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://live.browserstack.com/dashboard";
        assertEquals(expectedURL,actualURL);

    }
}