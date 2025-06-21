package com.thetestingacademy.ex_selenium.seleniumBasicsDay7;

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

public class selenium_040 {
    WebDriver driver;

    @BeforeTest
    public void openBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new ChromeDriver(options);
    }


    @Description("Verify Web Tables Dynamic")
    @Test
    public void test_web_tables(){
        driver.manage().window().maximize();
            String URL = "https://awesomeqa.com/webtable1.html";
        driver.get(URL);

        // XPath for the web table: //table[@summary='Sample Table']/tbody

        WebElement table = driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody"));
        // Rows and Columns
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        for (int i = 0; i < rows.size(); i++) {
            List<WebElement> column = rows.get(i).findElements(By.tagName("td"));
            for(WebElement col : column){
                System.out.println(col.getText());
            }
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
