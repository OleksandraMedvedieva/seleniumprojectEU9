package com.cydeo.tests.day2_homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_IncorrectLoginTitleVerification {
    public static void main(String[] args) {

        //TC #2: Facebook incorrect login title verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        //3. Enter incorrect username
        WebElement userNameBox = driver.findElement(By.name("email"));
        userNameBox.sendKeys("incorrect@gmail.com");

        //4. Enter incorrect password
        WebElement passwordBox = driver.findElement(By.id("pass"));
        passwordBox.sendKeys("invalidPass");
        WebElement logInButton = driver.findElement(By.name("login"));
        logInButton.click();

        //5. Verify title changed to:
        //Expected: “Facebook - log in or sign up”
        String expectedTitle = "Facebook - log in or sign up";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }



    }
}
