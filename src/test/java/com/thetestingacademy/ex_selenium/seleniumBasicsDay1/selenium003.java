package com.thetestingacademy.ex_selenium.seleniumBasicsDay1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class selenium003 {

    @Test
    public void testMethod(){

//        Important Concepts of OOPs ->
//         Upcasting -> Dynamic Dispatch - Poly

//         In Selenium 3 -
//         System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

//         In Selenium 4
//         Opera is Removed, and No usage of the setProperty due to the architectural change

//        WebDriver driver = new EdgeDriver();
//        WebDriver driver2 = new ChromeDriver();
//        WebDriver driver3 = new FirefoxDriver();
//        WebDriver driver4 = new InternetExplorerDriver();
//        WebDriver driver5 = new SafariDriver();


//                SearchContext(I) (2) -> WebDriver(I)( 10) -> RemoteWebDriver(C) (15) -> ChromiumDriver(C) 25 -> EdgeDriver(C) (45)
//                SearchContext(I) -> WebDriver(I) -> RemoteWebDriver(C) -> ChromiumDriver(C) -> ChromeDriver(C)


//         SearchContext - Interface - findElement, and findElements - GGF
//         WebDriver - Interface - some incomplete functions - GF
//         RemoteWebDriver - Class- It also has some functions - F
//         ChromeDriver, FirefoxDriver, EdgeDriver, SafariDriver, InternetExplorerDriver  Class - S

//         Selenium - Arch - API
//         Create Session, Commands or Functions -> API Request to Browser Driver (
//         Pass the commands as API

//        SearchContext driver = new ChromeDriver();
//        WebDriver driver = new ChromeDriver();
//        RemoteWebDriver driver1 = new ChromeDriver();
//         driver1 = new EdgeDriver()


          ChromeDriver  driver = new ChromeDriver();
//        driver = new EdgeDriver();        -- not possible

//         Scenarios
//         1. Do want to run on  Chrome or Edge?
//        ChromeDriver driver = new ChromeDriver(); ~1%
//
//         2  Do you want to run on Chrome then change to Edge ?
//         WebDriver driver = new ChromeDriver();
//         driver = new EdgeDriver(); 97% -
//
//
//         3. do you want to run on multiple browsers, aws machine, ? 2%
//         RemoteWebDriver driver (with GRID) - Advance (Last 2 Sessions)


//        Chromium is a search engine for the chrome, Edge, Brave and Opera browser

//        Gecko search engine is used for Firefox and TOR browser

    }

}
