package com.thetestingacademy.ex_selenium.seleniumBasicsDay2;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class selenium013 {

    @Test
    public void VWOLogin(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://sdet.live");

        System.out.println(driver.getPageSource());
        System.out.println("Current URL is: "  + driver.getCurrentUrl());
        System.out.println("Title is: " + driver.getTitle());

        Assert.assertEquals(driver.getTitle(),("Learn Software Testing &amp; Test Automation"));
        Assert.assertEquals(driver.getCurrentUrl(),("https://courses.thetestingacademy.com/"));

//        driver.quit();
    }

}
