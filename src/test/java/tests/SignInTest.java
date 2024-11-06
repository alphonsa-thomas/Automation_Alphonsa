package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.SignInPage;

public class SignInTest {

    WebDriver driver;

    @BeforeTest
    public void testSetUp()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void testLogin() {
        SignInPage signinPage = new SignInPage (driver);
        signinPage.enterUsername("standard_user");
        signinPage.enterPassword("secret_sauce");
        signinPage.enterButton();


    }
    }

