package com.thetestingacademy.ex_selenium.seleniumBasicsDay6;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class selenium035_SVG {
    WebDriver driver;

    @BeforeTest
    public void openBrowser(){

        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new ChromeDriver(options);
    }

    @Description("Verify that Maharashtra is in India and click on it")
    @Test
    public void testMapOfIndiaSVG(){
        driver.manage().window().maximize();
        driver.get("https://www.amcharts.com/svg-maps/?map=india");

        List<WebElement> stateSVG = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']"));

        for(WebElement state : stateSVG){
            System.out.println(state.getAttribute("aria-label"));
            if (state.getAttribute("aria-label").contains("Delhi")){
                state.click();
            }
        }
    }

    @AfterTest
    public void closeBrowser(){
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
//        driver.quit();
    }

}


