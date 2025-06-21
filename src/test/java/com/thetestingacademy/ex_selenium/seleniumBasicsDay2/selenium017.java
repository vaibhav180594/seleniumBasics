package com.thetestingacademy.ex_selenium.seleniumBasicsDay2;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class selenium017 {

    @Description("Selecting radio button from the web form.")
    @Test
    public void test_awesomeQA(){

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        WebElement selectSex = driver.findElement(By.id("sex-0"));
        selectSex.click();

//        driver.quit();
    }

}
