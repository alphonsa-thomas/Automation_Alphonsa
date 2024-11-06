package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    WebDriver driver;

    @FindBy(id="user-name")
    WebElement userName;

    @FindBy(id="password")
    WebElement passwordText;

    @FindBy(id="login-button")
    WebElement logButton;

    public SignInPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
public void enterUsername(String username){userName.sendKeys(username);}

    public void enterPassword(String password){passwordText.sendKeys(password);}

    public void enterButton(){logButton.click();}
}

