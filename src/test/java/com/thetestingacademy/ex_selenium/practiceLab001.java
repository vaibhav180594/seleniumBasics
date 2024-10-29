package com.thetestingacademy.ex_selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class practiceLab001 {

    public static void main(String[] args) {

        ChromiumDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/");
        driver.manage().window().maximize();
    }
}
