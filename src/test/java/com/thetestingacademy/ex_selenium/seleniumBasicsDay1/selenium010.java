package com.thetestingacademy.ex_selenium.seleniumBasicsDay1;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class selenium010 {

    // what is the difference between get amd navigate().to()?

    public static void main(String[] args) {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        EdgeDriver driver = new EdgeDriver();
        //driver.get("https://sdet.live");
        // No back, forward allowed in case of get

        driver.navigate().to("https://bing.com");
        driver.navigate().to("https://sdet.live");
        driver.navigate().to("https://app.vwo.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
    }

}
