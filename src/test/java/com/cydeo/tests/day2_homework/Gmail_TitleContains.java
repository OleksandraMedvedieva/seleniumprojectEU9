package com.cydeo.tests.day2_homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_TitleContains {
    public static void main(String[] args) {

        //TC #3: Back and forth navigation
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://google.com");

        //3- Click to Gmail from top right.
        WebElement gmail = driver.findElement(By.linkText("Gmail"));
        gmail.click();

        //4- Verify title contains:
        //  Expected: Gmail
        String expectedTitle = "Gmail: надійна, конфіденційна й безкоштовна електронна пошта | Google Workspace";
        String actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle)){
            System.out.println("test for gmail title passed");
        }else{
            System.out.println("test for gmail title failed");
        }

        //5- Go back to Google by using the .back();
        driver.navigate().back();

        //6- Verify title equals:
        //  Expected: Google
        expectedTitle = "Google";
        actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle)){
            System.out.println("test for google title passed");
        }else{
            System.out.println("test for google title failed");
        }




    }
}
