package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {

        //1 - setting up the webdriver manager
        //We create our "Browser Driver"
        WebDriverManager.chromedriver().setup();

        //2 - Create instance/object of the chrome driver
        //open browser for us
        WebDriver driver = new ChromeDriver();

        //3 - Test if driver is working as expected
        // goto the exact page
        driver.get("https://www.google.com");


    }
}
