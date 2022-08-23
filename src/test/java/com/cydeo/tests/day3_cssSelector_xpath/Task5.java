package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task5 {
    public static void main(String[] args) {

//1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

//2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

//3- Enter incorrect username into login box:
        WebElement logInBox = driver.findElement(By.cssSelector("input[name='USER_LOGIN']"));
        logInBox.sendKeys("test123");


//4- Click to `Reset password` button
        WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[value='Reset password']"));
        resetPasswordButton.click();

//5- Verify “error” label is as expected
// Expected: Login or E-mail not found
        WebElement errorLabel = driver.findElement(By.cssSelector("div[class='errortext']"));
        String expectedErrorLabel = "Login or E-mail not found";
        String actualErrorLabel = errorLabel.getText();
        if (actualErrorLabel.equals(expectedErrorLabel)){
            System.out.println("\"error\" label is as expected.Passed");
        }else{
            System.out.println("\"error\" label is not as expected.Failed");
        }
        driver.close();




    }
}
