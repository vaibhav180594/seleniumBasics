package com.thetestingacademy.ex_selenium;


import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class practiceLab003 {
    WebDriver driver;
    @BeforeTest
    public void openBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("guest");
        driver = new ChromeDriver(options);
    }

    @Description(" Web table ")
    @Test
    public void shadowDOM() throws InterruptedException {
        driver.manage().window().maximize();
        String URL = "https://awesomeqa.com/webtable.html";
        driver.get(URL);

        int row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td")).size();

        System.out.println("Count of row is = " + row);
        System.out.println("Count of column is = " + col);

        String firstPart = "//table[@id='customers']/tbody/tr[";
        String secondPart = "]/td[";
        String thirdPart = "]";

        for (int i = 2; i < row; i++) {
            for (int j = 1; j < col; j++) {
                String dynamicXPath = firstPart + i + secondPart + j + thirdPart;
                String data = driver.findElement(By.xpath(dynamicXPath)).getText();
//                System.out.println(data);

                if (data.contains("Helen Bennett")){
                    String countryPath = dynamicXPath + "/following-sibling :: td";
                    String CompanyPath = dynamicXPath + "/following-sibling :: td";

                    String countryText = driver.findElement(By.xpath(countryPath)).getText();
                    String companyText = driver.findElement(By.xpath(CompanyPath)).getText();

                    System.out.println("-----------------------");

                    System.out.println("Helen Bennett is In - " + countryText);
                    System.out.println("Helen Bennett is Company - " + companyText);
                }

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