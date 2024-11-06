package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class Test2 {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");

        //WebElement searchField = driver.findElement(By.id("searchBar"));
        //searchField.sendKeys("iPhone");

        driver.findElement(By.linkText("Cart")).click();
        driver.findElement(By.partialLinkText("Signup")).click();
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size());




    }
}