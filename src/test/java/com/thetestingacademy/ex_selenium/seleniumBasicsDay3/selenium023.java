package com.thetestingacademy.ex_selenium.seleniumBasicsDay3;

import io.qameta.allure.Description;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class selenium023 {

    @Description("Verify that Ebay print the prices of mac")
    @Test
    public void test_verify_print_imac_price(){

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.navigate().to("https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067");

        //01:44::07







    }

}
