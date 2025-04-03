package com.thetestingacademy.ex_selenium.seleniumBasicsDay1;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.io.File;

public class selenium007 {
    public static void main(String[] args) {

        // How to add extensions to the browser
        // How to download CRX file of extension
        // Copy the URL of extension  eg. https://chromewebstore.google.com/detail/adblock-%E2%80%94-block-ads-acros/gighmmpiobklfepjocnamgkkbiglidom
        // go to the https://crxextractor.com/ website paste the extension URL and you can download this as a CRX file

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addExtensions(new File("src/test/java/com/thetestingacademy/ex_selenium/seleniumBasicsDay1/extensions/Adblock.crx"));

        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.manage().window().maximize();
        driver.get("https://google.com");

    }

}
