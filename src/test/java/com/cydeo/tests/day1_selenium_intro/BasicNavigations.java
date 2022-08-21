package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.tesla.com/");
        System.out.println(driver.getTitle());

        // stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate back
        driver.navigate().back();

        // stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate forward
        driver.navigate().forward();

        // stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate refresh
        driver.navigate().refresh();

        // stop code execution for 3 seconds
        Thread.sleep(1000);

        //use navigate().to():
        driver.navigate().to("https://www.google.com");

        //get title
        System.out.println(driver.getTitle());

        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);


        driver.close();
        driver.quit();





    }
}
