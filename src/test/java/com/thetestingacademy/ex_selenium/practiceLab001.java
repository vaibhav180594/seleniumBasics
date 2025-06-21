package com.thetestingacademy.ex_selenium;


import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class practiceLab001 {
    WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("guest");
        driver = new ChromeDriver(options);
    }

    @Test
    @Description("IFrame")
    public void webTables() throws InterruptedException {
        driver.manage().window().maximize();
        String URL = "https://app.vwo.com/#/test/ab/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=1";
        driver.get(URL);
        Actions action = new Actions(driver);
        Thread.sleep(5000);

        String parentWindowHandle = driver.getWindowHandle();
        System.out.println("Parent Window is: " + parentWindowHandle);

        List<WebElement> listHeatmaps = driver.findElements(By.xpath("//img[@data-qa='danawobuqa']"));
        action.moveToElement(listHeatmaps.get(1)).click().build().perform();

        Thread.sleep(15000);

        Set<String> allhandles = driver.getWindowHandles();
        System.out.println(allhandles);

        for(String handle : allhandles){
            if (!handle.equals(parentWindowHandle)){
                driver.switchTo().window(handle);
                driver.switchTo().frame("heatmap-iframe");

                WebElement clickMap = driver.findElement(By.xpath("//div[@data-qa='liqokuxuba']"));
                clickMap.click();
            }
        }


    }

    @AfterTest
    public void closeBrowser(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
