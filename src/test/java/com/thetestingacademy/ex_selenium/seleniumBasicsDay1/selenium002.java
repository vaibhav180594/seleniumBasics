package com.thetestingacademy.ex_selenium.seleniumBasicsDay1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium002 {
    public static void main(String[] args) {

       // ChromiumDriver driver = new ChromeDriver();
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com");
        driver.navigate().to("https://app.vwo.com");
        //driver.close();
        driver.quit();

    }

}
