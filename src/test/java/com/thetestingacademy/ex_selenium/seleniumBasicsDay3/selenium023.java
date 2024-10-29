package com.thetestingacademy.ex_selenium.seleniumBasicsDay3;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class selenium023 {

    @Description("Verify that Ebay print the prices of mac")
    @Test
    public void test_verify_print_imac_price(){

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.navigate().to("https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067");

        WebElement searchBox = driver.findElement(By.xpath("//input[@id='gh-ac']"));
        searchBox.sendKeys("macmini");

        WebElement searchButton = driver.findElement(By.xpath("//input[@id='gh-btn']"));
        searchButton.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Print all the titles
        List<WebElement> searchTitles = driver.findElements(By.xpath("//div[@class='s-item__title']/span"));
        List<WebElement> searchTitlesPrices = driver.findElements(By.xpath("//span[@class='s-item__price']"));

        // s-item__title ,  s-item__price
        // min >> loop where

        int size = Math.min(searchTitles.size(), searchTitlesPrices.size());
        for (int i = 0; i < size; i++) {

            System.out.println("Title " + searchTitles.get(i).getText() + " || " + "Price " + searchTitlesPrices.get(i).getText());
            System.out.println();

            // Find Max price and min Price Product

        }
        driver.quit();
    }

}
