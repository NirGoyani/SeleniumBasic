package org.example.SeleniumBasic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunctionality {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.next.co.uk/");
        //....
        //...
        // Login Functinality test

        //branch -- it's basically copy the project from which you create the branch
        //commit -- code / button
        // push -- code / button


    }
}
