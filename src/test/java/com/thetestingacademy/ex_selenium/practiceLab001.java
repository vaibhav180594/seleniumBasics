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
        driver.get("https://awesomeqa.com/ui/index.php?route=account/register");
        driver.manage().window().maximize();

        driver.findElement(By.name("firstname")).sendKeys("Vaibhav");
        driver.findElement(By.name("lastname")).sendKeys("Shinde");
        driver.findElement(By.id("input-email")).sendKeys("vaibhavh@gmail.com");
        driver.findElement(By.id("input-telephone")).sendKeys("02228508246");
        driver.findElement(By.name("password")).sendKeys("Vaibhav123");
        driver.findElement(By.name("confirm")).sendKeys("Vaibhav123");
        driver.findElement(By.name("newsletter")).click();


//        driver.quit();
    }

}
