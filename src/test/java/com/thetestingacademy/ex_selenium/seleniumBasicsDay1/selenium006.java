package com.thetestingacademy.ex_selenium.seleniumBasicsDay1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class selenium006 {

@Test
 public void testMethod01(){
    // EdgeOptions -> It will help you to set the browser
    // What options can we give to the browser?
    // Window Size
    // headless mode --> There is no UI --> advantage --> Fast Execution
    // full UI mode  --> by default it is a full UI mode
    // can use incognito mode
    // Start browser with maximize
    // we can add extensions
    // can set the local storage
    // set the file downloading path

    EdgeOptions edgeOptions = new EdgeOptions();
    // like EdgeOptions, each browser have there own browser options eg ChromeOptions etc
    edgeOptions.addArguments("--start-maximized");
    edgeOptions.addArguments("--incognito");
    edgeOptions.addArguments("--window-size=800,600");

    EdgeDriver driver = new EdgeDriver(edgeOptions);
    driver.get("https://google.com");

    // if you do not maximize with the argument then you can use following method
   ChromeDriver cd = new ChromeDriver();
   cd.manage().window().maximize();
   cd.get("https://google.com");


}

}
