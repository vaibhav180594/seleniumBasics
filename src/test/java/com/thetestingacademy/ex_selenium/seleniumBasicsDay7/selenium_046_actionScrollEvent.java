package com.thetestingacademy.ex_selenium.seleniumBasicsDay7;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;
import java.lang.invoke.StringConcatFactory;

public class selenium_046_actionScrollEvent {
    WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("guest");
        driver = new ChromeDriver(options);
    }

    @Test
    @Description(" Windows Scroll Event ")
    public void testWindows() throws InterruptedException {
        driver.manage().window().maximize();
        String URL = "https://www.makemytrip.com/";
        driver.get(URL);

        Actions action = new Actions(driver);

//        action.moveToElement(driver.findElement(By.xpath("//span[@data-cy='closeModal']")));
//        WebElement closeModal = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
//        closeModal.click();
//
//        Thread.sleep(10000);

        action.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();


    }

    @AfterTest
    public void closeBrowser(){
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        driver.quit();
    }

}
