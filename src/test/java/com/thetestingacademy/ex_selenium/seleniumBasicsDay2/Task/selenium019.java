package com.thetestingacademy.ex_selenium.seleniumBasicsDay2.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class selenium019 {

    @Test
    public void testPageTitle() {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=account/register");
        driver.manage().window().maximize();

        driver.findElement(By.name("firstname")).sendKeys("Vaibhav");
        driver.findElement(By.id("input-lastname")).sendKeys("Shinde");
        driver.findElement(By.name("email")).sendKeys("vaibhav115@gmail.com");
        driver.findElement(By.id("input-telephone")).sendKeys("02228508246");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.name("confirm")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@name='newsletter' and @value=0]")).click();
        driver.findElement(By.name("agree")).click();
        driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();

        if (driver.getPageSource().contains("Your Account Has Been Created!")){
            System.out.println("Account Created");
        } else {
            System.out.println("Not created");
        }
//        driver.quit();
    }
}
