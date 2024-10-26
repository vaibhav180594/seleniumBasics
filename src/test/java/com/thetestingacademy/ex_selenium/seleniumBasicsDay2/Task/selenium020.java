package com.thetestingacademy.ex_selenium.seleniumBasicsDay2.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class selenium020 {

    @Test
    public void testVWO(){
        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://app.vwo.com/");
        driver.manage().window().maximize();

        driver.findElement(By.className("text-link")).click();
        driver.findElement(By.name("email")).sendKeys("test@test.com");
        driver.findElement(By.name("gdpr_consent_checkbox")).click();
        List<WebElement> createAccount = driver.findElements(By.tagName("button"));
        createAccount.get(0).click();

//        driver.quit();
    }

}
