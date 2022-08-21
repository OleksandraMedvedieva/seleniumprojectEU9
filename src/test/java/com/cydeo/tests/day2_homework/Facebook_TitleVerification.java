package com.cydeo.tests.day2_homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_TitleVerification {
    public static void main(String[] args) {
        //TC #1: Facebook title verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        //3. Verify title:
        //Expected: “Facebook - Facebook - log in or sign up
        String expectedTitle = "Facebook - log in or sign up";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
        driver.close();

    }
}
