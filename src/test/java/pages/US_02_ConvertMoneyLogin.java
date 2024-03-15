package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.US_02_CommonMethods;
import utilities.US_02_DriverClass;

public class US_02_ConvertMoneyLogin extends US_02_CommonMethods {



    @FindBy(xpath = "//input[@value='Sign in']")
    public WebElement signInButton1;


    @FindBy(xpath = "//button[@id='signin_button']")
    public WebElement signInLink;

    @FindBy(xpath = "//input[@id='user_login']")
    public WebElement loginTextBox;

    @FindBy(xpath = "//input[@id='user_password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement signInButton;

    @FindBy(xpath = "//a[@id='online-banking']")
    public WebElement moreServices;

    @FindBy(xpath = "//span[@id='pay_bills_link']")
    public WebElement payBills;
    @FindBy(xpath = "//a[text()='Purchase Foreign Currenc']")
    public WebElement purchaseForeignCurrency;

    @FindBy(xpath = "//select[@id='pc_currency']")
    public WebElement selectTextBox;

    @FindBy(xpath = "//input[@id='pc_amount']")
    public WebElement amountTextBox;


    @FindBy(xpath = "//input[@id='pc_inDollars_true']")
    public WebElement Dollars;

    @FindBy(xpath = "//input[@id='pc_calculate_costs']")
    public WebElement calculateCostButton;

    @FindBy(xpath = "//input[@id='purchase_cash']")
    public WebElement purchaseButton;

    @FindBy(xpath = "//div[text()='Foreign currency cash was successfully purchased.']")
    public WebElement confirmationMessage;



}
