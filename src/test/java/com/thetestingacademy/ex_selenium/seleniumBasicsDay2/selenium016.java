package com.thetestingacademy.ex_selenium.seleniumBasicsDay2;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class selenium016 {

    // Linked Text and Partial Link Text

    @Description("Verify that with invalid email, pass, error message is shown on the app.vwo.com")
    @Test
    public void testVwoLoginNegative() {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.navigate().to("https://app.vwo.com");
        System.out.println(driver.getTitle());

        // Linked Text and Partial Linked Text only work with <a> tag
        // Linked Text basically full match
        // Partial Linked Text contains partial match

//        WebElement link_webelement = driver.findElement(By.linkText("Start a free trial"));
//        link_webelement.click();

        WebElement partial_link_webelement = driver.findElement(By.partialLinkText("free trial"));
        partial_link_webelement.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.navigate().back();

        driver.quit();
    }

}
