package com.thetestingacademy.ex_selenium.seleniumBasicsDay2;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class selenium015 {
    //Locators - Find the web elements
    //Open the URL app.vwo.com/#/login](https://app.vwo.com/#/login)
    //Find the Email id** and enter the email as admin@admin.com
    //Find the pass inputbox** and enter passwrod as admin.
    //Find and Click on the submit button
    //Verify that the error message is shown "Your email, password, IP address or location did not match"

    @Description("Verify that with invalid email, pass, error message is shown on the app.vwo.com")
    @Test
    public void testVwoLoginNegative(){
        // How to find the elements
        // Selenium
        // ID, NAME, CLASS NAME, TAGName,
        // Advance -> Css Selector, Xpath

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        edgeOptions.addArguments("--start-maximized");

        // FindElement -> 1 element first web element
        // FindElements -> which can find multiple web elements

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.navigate().to("https://app.vwo.com/#/login");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");

        // Find the email and password input box and enter the email and password
             //<input type="email" class="text-input W(100%)" name="username" id="login-username" data-qa="hocewoqisi">
        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");

            //<input type="password" class="text-input W(100%)" name="password" id="login-password" data-qa="jobodapuxe">
        WebElement passwordInputBox = driver.findElement(By.name("password"));
        passwordInputBox.sendKeys("password@321");

            //Finding the Sign In button
        WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click();

        //After 3 seconds error comes
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //Finding the error message element
        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(error_message.getText(), ("Your email, password, IP address or location did not match"));

        driver.quit();
    }

}
