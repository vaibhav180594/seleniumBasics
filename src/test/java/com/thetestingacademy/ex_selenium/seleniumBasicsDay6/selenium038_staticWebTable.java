package com.thetestingacademy.ex_selenium.seleniumBasicsDay6;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class selenium038_staticWebTable {
    WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new ChromeDriver(options);
    }

    @Description(" Verify web tables ")
    @Test
    public void webTables(){
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/webtable.html");

        int row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td")).size();

        System.out.println(row);
        System.out.println(col);

        // xpath - //table[@id="customers"]/tbody/tr[
        // i
        // ]/td[
        // j
        // ]

        String first_part = "//table[@id=\"customers\"]/tbody/tr[";
        String second_part = "]/td[";
        String third_part = "]";
        // i = 1 to 7
        // j = 1,2,3

        for (int i = 2; i <= row ; i++) {
            for (int j = 1; j <= col ; j++) {

                String dynamicXpath = first_part + i + second_part + j + third_part;
                String data = driver.findElement(By.xpath(dynamicXpath)).getText();
//                System.out.println(data);

                if(data.contains("Helen Bennett")){
                    String country_path = dynamicXpath+"/following-sibling::td";
                    String country_company = dynamicXpath+"/preceding-sibling::td";
                    String country_text = driver.findElement(By.xpath(country_path)).getText();
                    String company_text = driver.findElement(By.xpath(country_company)).getText();
                    System.out.println("------");
                    System.out.println("Helen Bennett is In - " + country_text);
                    System.out.println("Helen Bennett is Company - " + company_text);
                }

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
        driver.quit();
    }
}
