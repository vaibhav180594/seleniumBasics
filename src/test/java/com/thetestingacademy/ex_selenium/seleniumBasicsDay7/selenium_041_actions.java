package com.thetestingacademy.ex_selenium.seleniumBasicsDay7;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class selenium_041_actions {
    WebDriver driver;

    @BeforeTest
    public void openBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new ChromeDriver(options);
    }

   @Description(" Verify Actions ")
    @Test
    public void test_actions() throws InterruptedException {
        driver.manage().window().maximize();
        String URL = "https://awesomeqa.com/practice.html";
        driver.get(URL);

       WebElement firstName = driver.findElement(By.name("firstname"));
       // Keyboard Event = keyDown(click) > Shift key > sendKeys > KeyUp

       Actions action = new Actions(driver);
       action.keyDown(Keys.SHIFT).sendKeys(firstName, "vaibhav").keyUp(Keys.SHIFT).build().perform();

       Thread.sleep(10000);

    }



    @AfterTest
    public void closeBrowser() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
