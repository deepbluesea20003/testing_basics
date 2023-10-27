package com.lbg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App
{
    final private WebDriver driver = new ChromeDriver();

    public static void main( String[] args )
    {

//        ChromeOptions options = new ChromeOptions();
//        options.addArguments();
        //invoke the browser

        WebDriver driver = new ChromeDriver();

        //
        driver.get("https://mdbootstrap.com/docs/standard/extended/login/");

        String title = driver.getTitle();
        System.out.println("Title is: "+title);

        String url= driver.getCurrentUrl();
        System.out.println("URL is: " + url);

//        driver.manage().window().maximize();

        driver.findElement(By.id("form2Example1")).sendKeys("adam");
        WebElement but = driver.findElement(By.className("btn btn-primary btn-block mb-4"));
        but.click();

//        driver.close();
//
//        driver.quit(); // fully shuts down the webdriver

    }

    public void login(){
        driver.manage().window().maximize();
        driver.get("https://www.browserstack.com/users/sign_in");
        WebElement username=driver.findElement(By.id("user_email_login"));
        WebElement password=driver.findElement(By.id("user_password"));
        WebElement login=driver.findElement(By.name("commit"));
        username.sendKeys("abc@gmail.com");
        password.sendKeys("your_password");
        login.click();

        // 1) actual url
        // 2) expected url
        // 3) assert if the expected match the current
    }

    public WebDriver getDriver() {

        return driver;
    }
}
