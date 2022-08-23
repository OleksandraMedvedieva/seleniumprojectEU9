package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task4 {
    public static void main(String[] args) {

        //TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //3- Verify “Reset password” button text is as expected:
        //Expected: Reset password
        WebElement resetPassButtonText = driver.findElement(By.cssSelector("button[value='Reset password']"));
        String expectedResetPassButtonText = "Reset password";
        String actualResetPassButtonText = resetPassButtonText.getText();

        if (actualResetPassButtonText.equals(expectedResetPassButtonText)){
            System.out.println("Button text verification passed");
        }else{
            System.out.println("Button text verification failed");
        }

        driver.close();



    }
}
