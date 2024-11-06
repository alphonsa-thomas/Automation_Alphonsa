package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class LoginFacebook {


    WebDriver driver;
    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

    }
    @Test
    public void login(){


        WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
        searchField.sendKeys("iPhone");
        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();
    }

    @Test
    public void invalid(){


        WebElement searchField = driver.findElement(By.id("abc@gmail.com"));
        searchField.sendKeys("iPhone");
        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();
    }
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
        searchField.sendKeys("iPhone");
        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();

    }
}