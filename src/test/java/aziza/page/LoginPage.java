package aziza.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage  extends ParentPage {

        @FindBy(xpath = "//input[@id='user_login']")
        public WebElement login1 ;

        @FindBy(xpath = "(//input[@id='user_password'])[1]")
        public WebElement password1 ;

        @FindBy(xpath = "(//a[normalize-space()='Add New Payee'])[1]")
        public WebElement clickaddNewPayeeButton ;
        @FindBy(xpath = "(//input[@type='text'])[5]")
        public WebElement payeeNameTextAdding ;

        @FindBy(xpath = "//textarea[@id='np_new_payee_address']")
        public WebElement PayeeAddressTextAdding ;

        @FindBy(xpath = "(//input[@id='np_new_payee_account'])[1]")
        public WebElement accountTextAdding ;

        @FindBy(xpath = "//input[@id='np_new_payee_name']")
        public WebElement PayeeName
        ;
        @FindBy(xpath = "(//textarea[@id='np_new_payee_address'])[1]")
        public WebElement PayeeAddress
        ;
        @FindBy(xpath = "(//input[@id='np_new_payee_account'])[1]")
        public WebElement Account ;

        @FindBy(xpath = "//input[@id='np_new_payee_details']")
        public WebElement PayeeDetails ;
        @FindBy(xpath = "(//input[@id='add_new_payee'])[1]")
        public WebElement pushAdd ;



}
