package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests {
    private static final Logger log = LoggerFactory.getLogger(LoginTests.class);
    WebDriver driver;

    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        //opening browser
         driver =  new ChromeDriver();
        //maximize screen
        driver.manage().window().maximize();
        //opening website
        driver.get("https://www.facebook.com/");
    }

    @Test
    public void validLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterEmail("abc@gmail.com");
        loginPage.enterPass("1234");
        loginPage.clickButton();

    }

    @Test
    public void invalidLogin(){
LoginPage loginPage= new LoginPage(driver);
loginPage.enterEmail("xyz@gmail.com");
loginPage.enterPass("1111");
loginPage.clickButton();

    }

    @AfterTest
    public void close(){

    }
}
