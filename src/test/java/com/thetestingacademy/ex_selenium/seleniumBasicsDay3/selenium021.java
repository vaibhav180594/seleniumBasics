package com.thetestingacademy.ex_selenium.seleniumBasicsDay3;

public class selenium021 {

    /** Xpath
         2 types  a] absolute     b]  Relative
         absolute: - Complete path from the Root Element.
                   - If any element is **added or deleted**, Xpath fails.
         /html/body/div[2]/div[1]/div[2]/div/div[1]/div/div/div[3]/form[1]/ul/li[1]/div/input
         How to find it: Ans. Inspect an element iin dev tool then right click and copy full XPath

         relative: - You can simply start by referencing the element you want and go from there.
                   - Based on searching an element in DOM.

     <input type="email" class="text-input W(100%)" name="username" id="login-username" data-qa="hocewoqisi">
     <input type="password" class="text-input W(100%)" name="password" id="login-password" data-qa="jobodapuxe">
     Below mentioned XPath will find Email address and password element on the VWO login html DOM
     How to find relative xpath of element?
     //input[@id="login-username"]
     //input[@name="password"]

     if we don't know the tag name like "input" in above example then we can use * instead tag name
     //*[@name="password"]

        XPath Functions:
            - Know attribute
            - Tag name
                //a[@id = "btn-make-appointment"]

     <a id="btn-make-appointment" href="./profile.php#login" class="btn btn-dark btn-lg">Make Appointment</a>

     - Text Matching:
        - Full Visible Text: text()
            //a[text()="Make Appointment"]


        - Partial Matching Text: contains(); starts-with(); normalize-space()
            //a[contains(text(), "Make")]
            //a[contains(text(), "Make Appointment")]
            //a[contains(@id, "btn-make-appointment")]

            //a[starts-with(text(),"Make")]

            //a[normalize-space()="Make Appointment"] --> this function will remove head and trails spaces and then match

     Operators - AND & OR
            //tag_name[@name = 'Name value' and @id = ‘ID value’]
            //a[text()="Make Appointment" and contains(@id,"btn-make-appointment")]

     XPath Axes
        In the XML documents, we have **relationships between various nodes(html tags) to locate those nodes in the DOM structure.
          https://awesomeqa.com/xpath/
            //div[@class="Mammal"]
            //div[@class="Mammal"]/child::div

     */

    /**
     CSS Selectors
     - Css Selector is also a way to find the element by the simple css logics
     - id -> #
     - ClassName -> .
     - Name -> [name="vaue"]
     - attribute -> [attribute=value]
     - //  Css Selectors -> little fast, Nowadays since more ram - xpath  == css selector

     input[id="login-username"]
     // - Remove from xpath
     @ -> Remove from xpath

     //div[@class="second"]/span -> Lsit of Elements - (get(1))
     List<WebElement> spans = driver.findElements(By.Xpath("//div[@class="second"]/span"))
     spans.get(0).click()

     div[class="second"] > span
     div.second > span





     */






}
