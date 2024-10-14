package com.thetestingacademy.ex_selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium002 {
    public static void main(String[] args) {

       // ChromiumDriver driver = new ChromeDriver();
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com");
        driver.navigate().to("https://app.vwo.com");
        //driver.close();
        driver.quit();

    }

}
