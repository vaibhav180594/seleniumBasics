package com.thetestingacademy.ex_selenium;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class practiceLab001 {

    @Test
    public void test1(){

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();

        driver.findElement(By.name("username")).sendKeys("abcd@gmail.com");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.id("js-login-btn")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement errorMessage = driver.findElement(By.className("notification-box-description"));
        System.out.println(errorMessage.getText());
        Assert.assertEquals(errorMessage.getText(), "Your email, password, IP address or location did not match");

        driver.quit();
    }

}
