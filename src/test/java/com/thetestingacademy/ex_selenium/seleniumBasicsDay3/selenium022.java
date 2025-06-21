package com.thetestingacademy.ex_selenium.seleniumBasicsDay3;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class selenium022 {

    @Description("Verify that Free trial expire message in idrive.com")
    @Test
    public void test_verify_expire_message() {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://www.idrive360.com/enterprise/login");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("augtest_040823@idrive.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
        driver.findElement(By.className("id-checkmark")).click();
        driver.findElement(By.xpath("//button[@type='submit' and contains(text(),'Sign in')]")).click();

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement errorMessage = driver.findElement(By.xpath("//h5[@class='id-card-title' and contains(text(), 'Your free trial has expired')]"));
        Assert.assertEquals(errorMessage.getText(), "Your free trial has expired");

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }

}
