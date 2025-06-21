package com.thetestingacademy.ex_selenium.seleniumBasicsDay7;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;

public class selenium_044_windowsAction {
    WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("guest");
        driver = new ChromeDriver(options);
    }

    @Test
    @Description(" Verify Windows Action ")
    public void testWindows(){
        driver.manage().window().maximize();
        String URL = "https://the-internet.herokuapp.com/windows";
        driver.get(URL);

        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window handle: " + parentWindow);

        driver.findElement(By.linkText("Click Here")).click();

        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("Window handles: " + windowHandles);

        for(String handle : windowHandles){
            driver.switchTo().window(handle);
            if (driver.getPageSource().contains("New Window")){
                System.out.println("Test Case is passed");
                break;
            }
        }

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
