package com.thetestingacademy.ex_selenium.seleniumBasicsDay1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class selenium001 {
    public static void main(String[] args) {

        ChromiumDriver driver = new ChromeDriver();
//        driver.get("https://app.vwo.com");
        driver.navigate().to("https://app.vwo.com");
        //driver.close();
       // driver.quit();

    }

}
