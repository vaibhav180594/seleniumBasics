package com.thetestingacademy.ex_selenium.seleniumBasicsDay2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import java.net.URL;

public class selenium014 {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");

        Assert.assertEquals(driver.getTitle(), "CURA Healthcare Service");
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/");

        if (driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("Verified");
            Assert.assertTrue(true);
        } else {

            Assert.assertFalse(false);
        }
        driver.quit();
    }
}
