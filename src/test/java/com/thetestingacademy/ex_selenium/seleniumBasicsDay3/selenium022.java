package com.thetestingacademy.ex_selenium.seleniumBasicsDay3;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class selenium022 {

    @Description("Verify that Free trial expire message in idrive.com")
    @Test
    public void test_verify_expire_message() {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.idrive360.com/enterprise/login");
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        // driver.manage().window().maximize();

        // <input
        // _ngcontent-qcv-c4=""
        // autofocus=""
        // class="id-form-ctrl ng-pristine ng-valid ng-touched"
        // id="username"
        // name="username"
        // type="email">

//        WebElement username_input_id = driver.findElement(By.id("username"));
        WebElement username_input_xpath = driver.findElement(By.xpath("//input[@id='username']"));
//        WebElement username_input_css_1 = driver.findElement(By.cssSelector("input#username"));
//        WebElement username_input_css_2 = driver.findElement(By.cssSelector("#username"));
//        WebElement username_input_name = driver.findElement(By.name("username"));

        username_input_xpath.sendKeys("augtest_040823@idrive.com");

        WebElement password_input_xpath = driver.findElement(By.xpath("//input[@id='password']"));
        password_input_xpath.sendKeys("123456");

        WebElement span_checkbox = driver.findElement(By.className("id-checkmark"));
        span_checkbox.click();

        WebElement button_submit = driver.findElement(By.xpath("//button[@id='frm-btn']"));
        button_submit.click();


        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //h5[@class="id-card-title"]
        WebElement error_message_free_trial = driver.findElement(By.xpath("//h5[@class='id-card-title']"));
        Assert.assertEquals(error_message_free_trial.getText(),"Your free trial has expired");

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        driver.quit();
    }

}
