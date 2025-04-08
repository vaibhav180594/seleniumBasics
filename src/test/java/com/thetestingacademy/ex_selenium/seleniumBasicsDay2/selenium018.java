package com.thetestingacademy.ex_selenium.seleniumBasicsDay2;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class selenium018 {

    @Description("Verify that the error message will come for the wrong email at the free trail in the app.vwo.com signup page.")
    @Test
    public void testVWOFreeTrial(){

        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://vwo.com/free-trial/");
        driver.manage().window().maximize();

        driver.findElement(By.id("page-v1-step1-email")).sendKeys("1235");
        driver.findElement(By.name("gdpr_consent_checkbox")).click();
//        driver.findElement(By.linkText("The email address you entered is incorrect.")).click();

        List<WebElement> buttomList = driver.findElements(By.tagName("button"));
        buttomList.get(0).click();

        WebElement errorMessage = driver.findElement(By.className("invalid-reason"));
        System.out.println(errorMessage.getText());

        Assert.assertEquals(errorMessage.getText(), "The email address you entered is incorrect.");

        driver.findElement(By.linkText("Privacy Policy")).click();

        driver.findElement(By.linkText("Terms")).click();


//        driver.quit();

    }

}
