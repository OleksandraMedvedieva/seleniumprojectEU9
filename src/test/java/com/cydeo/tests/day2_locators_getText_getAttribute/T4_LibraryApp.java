package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryApp {
    public static void main(String[] args) {

        //TC #4: Library verifications
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://library1.cydeo.com/login.html
        driver.get(" https://library1.cydeo.com/login.html");
        //3. Enter username: “incorrect@email.com”
        WebElement usernameInput = driver.findElement(By.className("form-control"));
        usernameInput.sendKeys("incorrect@email.com");

        //4. Enter password: “incorrect password”
        WebElement passwordInput = driver.findElement(By.id("inputPassword"));
        passwordInput.sendKeys("incorrect password");

        // 5.Click on sign in button
        WebElement signInButton = driver.findElement(By.tagName("button"));
        signInButton.click();

        //6. Verify: visually “Sorry, Wrong Email or Password”
        String expectMessage = "Sorry, Wrong Email or Password";
        String actualMessage = driver.findElement(By.className("mb-4")).getText();
        System.out.println(actualMessage);

          if (expectMessage.equals(actualMessage)){
            System.out.println("warning message passed");
        }else{
            System.out.println("warning message failed");
        }





        //displayed
        //PS: Locate username input box using “className” locator
        //Locate password input box using “id” locator
        //Locate Sign in button using “tagName” locator




    }
}
