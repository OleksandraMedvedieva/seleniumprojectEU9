package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_GetText_GetAttribute {
    public static void main(String[] args) {
        //TC #5: getText() and getAttribute() method practice
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form ");
        WebElement header = driver.findElement(By.tagName("h2"));
        //3- Verify header text is as expected:
        //  Expected: Registration form
        String actualHeader = header.getText();
        String expectedHeader = "Registration form";
        if (actualHeader.equals(expectedHeader)){
            System.out.println("header pass");
        }else{
            System.out.println("header fail");
        }
        //4- Locate “First name” input box
        WebElement inputBoxFirstName = driver.findElement(By.name("firstname"));

        //5- Verify placeholder attribute’s value is as expected:
        //  Expected: first name
        String expectedPlaceHolder = "first name";
        String actualPlaceHolder = inputBoxFirstName.getAttribute("placeholder");
        if (actualPlaceHolder.equals(expectedPlaceHolder)){
            System.out.println("placeholder pass");
        }else{
            System.out.println("placeholder fail");
        }

        driver.close();

    }
}
