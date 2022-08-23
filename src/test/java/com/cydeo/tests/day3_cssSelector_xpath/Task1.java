package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task1 {
    public static void main(String[] args) {

        //TC #1: NextBaseCRM, locators and getText() practice
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //2- Go to: https://login1.nextbasecrm.com/

        driver.get("https://login1.nextbasecrm.com/");

        //3- Enter incorrect username: “incorrect”
        //driver.findElement(By.name("USER_LOGIN")).sendKeys("incorrect");
        WebElement inputUserName = driver.findElement(By.name("USER_LOGIN"));
        inputUserName.sendKeys("incorrect");

        //4- Enter incorrect password: “incorrect”
        WebElement inputPassword = driver.findElement(By.name("USER_PASSWORD"));
        inputPassword.sendKeys("incorrect");
        // driver.findElement(By.name("USER_PASSWORD")).sendKeys("incorrect");

        //5- Click to login button.
        //driver.findElement(By.className("login-btn")).click();
        WebElement logInButton = driver.findElement(By.className("login-btn"));
        logInButton.click();



        //6- Verify error message text is as expected:
        //Expected: Incorrect login or password
        WebElement error = driver.findElement(By.className("errortext"));
        String expected = "Incorrect login or password";
        String actual = error.getText();

        if (actual.equals(expected)){
            System.out.println("Correct error message - passed");
        }else{
            System.out.println("Incorrect error message - failed");
        }

        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
        driver.close();



    }
}
