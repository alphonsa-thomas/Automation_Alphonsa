package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    @FindBy(id="email")
    WebElement emailField ;


    @FindBy(id="pass")
    WebElement passwordField;

    @FindBy(xpath="//*[@data-testid='royal_login_button']")
    WebElement loginButton;


    public LoginPage(WebDriver driver){
        this.driver= driver;
         PageFactory.initElements(driver, this);
    }

    public void enterEmail(String email){
        emailField.sendKeys(email);
    }

    public void enterPass(String password){
        passwordField.sendKeys(password);

    }

    public void clickButton(){
        loginButton.click();
    }

    public void enterinvalidEmail(){
        emailField.sendKeys("invalid@gmail.com");
    }
}
