package com.thetestingacademy.ex_selenium.seleniumBasicsDay5;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.function.Function;

public class selenium030 {

    @Description("Fluent Wait")
    @Test
    public void testVwoLoginNegative(){

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://app.vwo.com/#/login");
        driver.manage().window().maximize();

        driver.findElement(By.id("login-username")).sendKeys("admin@admin.com");
        driver.findElement(By.name("password")).sendKeys("password@321");
        driver.findElement(By.id("js-login-btn")).click();

        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

//        WebElement errorMessageNotification = driver.findElement(By.xpath("//div[@id='js-notification-box-msg']"));

        error_message = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.className("notification-box-description"));
            }
        });

        Assert.assertEquals(error_message.getText(), "Your email, password, IP address or location did not match");

        driver.quit();
    }
}
