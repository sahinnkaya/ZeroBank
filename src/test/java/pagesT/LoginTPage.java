package pagesT;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;
import utilitiesT.CommonMethodsT;
import utilitiesT.DriverClassT;

public class LoginTPage extends CommonMethodsT {


  @FindBy(xpath = "//button[@id='signin_button']")
  public WebElement signInLink;

    @FindBy(xpath = "//input[@id='user_login']")
    public WebElement loginTextBox;

    @FindBy(xpath = "//input[@id='user_password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement signInButton;

    @FindBy(xpath = "//a[@id='online-banking']")
    public WebElement moreServicesLink;

    @FindBy(xpath = "//span[@id='pay_bills_link']")
    public WebElement payBillsLink;
  @FindBy(xpath = "//a[text()='Purchase Foreign Currency']")
  public WebElement purchaseForeignCurrencyLink;

  @FindBy(xpath = "//select[@id='pc_currency']")
  public WebElement selectTextBox;

  @FindBy(xpath = "//input[@id='pc_amount']")
  public WebElement amountTextBox;

  //input[@id="pc_inDollars_true"]

  @FindBy(xpath = "//input[@id='pc_inDollars_true']")
  public WebElement pcInDollars;

  @FindBy(xpath = "//input[@id='pc_calculate_costs']")
  public WebElement calculateCostButton;

  @FindBy(xpath = "//input[@id='purchase_cash']")
  public WebElement purchaseButton;

  @FindBy(xpath = "//div[text()='Foreign currency cash was successfully purchased.']")
  public WebElement confirmationMessage;



}
