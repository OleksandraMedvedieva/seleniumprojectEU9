package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task2 {
    public static void main(String[] args) {

       //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/ ");

        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        WebElement label = driver.findElement(By.className("login-item-checkbox-label"));
        String actualLabel = label.getText();
        String expectedLabel = "Remember me on this computer";
        if (actualLabel.equals(expectedLabel)){
            System.out.println("Label test passed");
        }else{
            System.out.println("Label test failed");
        }

        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?
        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));
        String expectedForgotPasswordLink = "FORGOT YOUR PASSWORD?";
        String actualForgotPasswordLink = forgotPasswordLink.getText();

        if (actualForgotPasswordLink.equals(expectedForgotPasswordLink)){
            System.out.println("forgot link verification passed");
        }else{
            System.out.println(actualForgotPasswordLink);
            System.out.println(expectedForgotPasswordLink);
            System.out.println("forgot link verification failed");
        }

        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes
        String expectedInHref = "forgot_password=yes";
        String actualInHref = forgotPasswordLink.getAttribute("href");
        if (actualInHref.contains(expectedInHref)){
            System.out.println("Href link verification passed");
        }else{
            System.out.println("Href link verification failed");
        }





        driver.close();




    }
}
