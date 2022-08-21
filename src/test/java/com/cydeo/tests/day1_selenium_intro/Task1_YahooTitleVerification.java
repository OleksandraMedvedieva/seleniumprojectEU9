package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {
    public static void main(String[] args) {


         //TC #1: Yahoo Title Verification
        WebDriverManager.chromedriver().setup();

         //1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

         //Go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");

         //3.Verify title:
         //Expected: Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos
        String expectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title correct.PASSED");
        }else{
            System.out.println("Title not correct.FAILED");
        }





    }
}

