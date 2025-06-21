package com.thetestingacademy.ex_selenium.seleniumBasicsDay6;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class selenium036_ShadowP1 {
    WebDriver driver;
    @BeforeTest()
    public void openBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new ChromeDriver(options);
    }

    @Description(" javaScript Executor ")
    @Test
    public void shadowDom() throws InterruptedException {

        driver.manage().window().maximize();
        driver.get("https://selectorshub.com/xpath-practice-page/");

        JavascriptExecutor js =  (JavascriptExecutor) driver;

        WebElement divToScroll = driver.findElement(By.xpath("//div[@id='userName']"));
        js.executeScript("arguments[0].scrollIntoView(true);", divToScroll);

        Thread.sleep(15000);

        WebElement inputboxPizza = (WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector(\"div#app2\").shadowRoot.querySelector(\"#pizza\")");
        inputboxPizza.sendKeys("farmhouse");

    }

    @AfterTest()
    public void closeBrowser(){
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        driver.quit();
    }
}
