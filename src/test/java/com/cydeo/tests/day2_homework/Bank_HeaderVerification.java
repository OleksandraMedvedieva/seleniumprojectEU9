package com.cydeo.tests.day2_homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bank_HeaderVerification {
    public static void main(String[] args) {

        //TC #2: Zero Bank header verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        //3. Verify header text
        //Expected: Log in to ZeroBank
        WebElement header = driver.findElement(By.tagName("h3"));
        String actualHeader = header.getText();
        String expectedHeader = "Log in to ZeroBank";

        if (actualHeader.equals(expectedHeader)){
            System.out.println("header test passed");
        }else{
            System.out.println("header test failed");
        }

        driver.close();




    }
}
