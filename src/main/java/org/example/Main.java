package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //setting up drivers
        WebDriverManager.chromedriver().setup();
        //opening browser
        WebDriver driver =  new ChromeDriver();
        //maximize screen
        driver.manage().window().maximize();
        //opening website
        driver.get("https://www.facebook.com/");

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("abc@gmail.com");
        WebElement passwordField = driver.findElement(By.id("pass"));
        passwordField.sendKeys("123456");
        WebElement loginButton = driver.findElement(By.xpath("//*[@data-testid='royal_login_button']"));
        loginButton.click();
        //driver.quit();


    }
}