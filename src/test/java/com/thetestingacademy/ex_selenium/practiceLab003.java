package com.thetestingacademy.ex_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;

public class practiceLab003 {
    public static void main(String[] args) throws InterruptedException {

        ChromiumDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://app.vwo.com");
        driver.quit();
        Thread.sleep(Long.parseLong("15000"));

    }
}
