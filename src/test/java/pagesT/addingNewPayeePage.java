package pagesT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilitiesT.CommonMethodsT;
import utilitiesT.DriverClassT;

public class addingNewPayeePage extends CommonMethodsT {
    @FindBy(xpath = "//div[strong='Online Banking']")
    public WebElement clickOnlineButton ;

    @FindBy(xpath = "(//span[@id='pay_bills_link'])[1]")
    public WebElement clickPayBillsButton ;

    @FindBy(xpath = "(//a[normalize-space()='Add New Payee'])[1]")
    public WebElement clickaddNewPayeeButton ;




    @FindBy(xpath = "(//input[@type='text'])[5]")
    public WebElement payeeNameTextAdding ;

    @FindBy(xpath = "//textarea[@id='np_new_payee_address']")
    public WebElement PayeeAddressTextAdding ;

    @FindBy(xpath = "(//input[@id='np_new_payee_account'])[1]")
    public WebElement accountTextAdding ;

    @FindBy(xpath = "(//input[@id='np_new_payee_details'])[1]")
    public WebElement payeDetailTextAdding ;

    @FindBy(xpath = "(//input[@id='add_new_payee'])[1]")
    public WebElement clickAddButton ;

    public WebElement payeemMessage(String payeeName) {
        return DriverClassT.
                getDriver().
                findElement
                        (By.xpath(
                                "//div[text()='The new payee \"" + payeeName + "\" was successfully created.']"));



    }



}
