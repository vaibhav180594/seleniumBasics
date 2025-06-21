package com.thetestingacademy.ex_selenium.seleniumBasicsDay7;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class selenium_049_relativeLocatorsB {
    WebDriver driver;

    @BeforeTest
    public void openBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new ChromeDriver(options);
    }

    @Description("Verify RL")
    @Test
    public void test_RL_P2() throws InterruptedException {


        driver.get("https://www.aqi.in/real-time-most-polluted-city-ranking");
        driver.manage().window().maximize();

        Thread.sleep(5000);


        WebElement search_element = driver.findElement(By.xpath("//input[@id='search_city']"));
        search_element.sendKeys("India" + Keys.ENTER);


        List<WebElement> list_of_states = driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td[2]"));

        for (WebElement l : list_of_states) {
            System.out.println(l.getText());
            String s1 = driver.findElement(with(By.tagName("p")).toRightOf(l)).getText();
            String s2 = driver.findElement(with(By.tagName("p")).toLeftOf(l)).getText();
            String s3 = driver.findElement(with(By.tagName("p")).below(l)).getText();
            String s4 = driver.findElement(with(By.tagName("p")).above(l)).getText();
            System.out.println(l.getText() + " | " + s1 + " | " + s2);
            System.out.println(l.getText() + " | " + s3 + " | " + s4);

        }
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
