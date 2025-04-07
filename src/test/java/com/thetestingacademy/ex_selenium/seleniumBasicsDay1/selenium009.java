package com.thetestingacademy.ex_selenium.seleniumBasicsDay1;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class selenium009 {

@Test
    public void testQuitVsClose(){

    EdgeDriver driver = new EdgeDriver();
    driver.get("https://sdet.live");

    // What is the difference between close and quit method?
    // driver.close();
        // Close the Current Browser Window - not the full browser
        // Closed the window, Session id != null, Error - Invalid session ID

    driver.quit();
        // Close all the /sessions/windows and stop the browser
        // driver.quit(); // Closed All the window and Session = null, Error - Session ID is null


}

}
