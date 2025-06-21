package com.thetestingacademy.ex_selenium.seleniumBasicsDay5;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class selenium027 {
// Implicit Wait
    @Description("Implicit Wait")
    @Test
    public void test_verify_print_imac_price() {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        edgeOptions.addArguments("--start-maximized");

        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        try {
//            Thread.sleep(20000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        driver.findElement(By.id("js-login-btn")).click();

        driver.findElement(By.id("js-notification-box-msg"));
        driver.quit();
    }
}
