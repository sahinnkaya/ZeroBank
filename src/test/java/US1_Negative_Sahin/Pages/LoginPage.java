package US1_Negative_Sahin.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ParentPage {

    @FindBy(xpath = "(//button[normalize-space()='Signin'])[1]")
    public WebElement signInButton;

    @FindBy(xpath = "(//input[@id='user_login'])[1]")
    public WebElement loginBox;

    @FindBy(xpath = "(//input[@id='user_password'])[1]")
    public WebElement passwordBox;

    @FindBy(xpath = "(//input[@name='submit'])[1]")
    public WebElement signInSubmitButton;

    @FindBy(xpath = "(//h3[normalize-space()='Troubles entering the site?'])[1]")
    public WebElement wrongLoginTitle;

    @FindBy(xpath = "(//div[@class='alert alert-error'])[1]")
    public WebElement wrongLoginMessage;

//    @FindBy(xpath = "")
//    public WebElement ;
//
//    @FindBy(xpath = "")
//    public WebElement ;
//
//    @FindBy(xpath = "")
//    public WebElement ;
//
//    @FindBy(xpath = "")
//    public WebElement ;
//
//    @FindBy(xpath = "")
//    public WebElement ;
//
//    @FindBy(xpath = "")
//    public WebElement ;
//
//    @FindBy(xpath = "")
//    public WebElement ;




}
