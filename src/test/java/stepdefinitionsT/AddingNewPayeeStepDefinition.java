package stepdefinitionsT;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pagesT.addingNewPayeePage;
import utilitiesT.CommonMethodsT;
import utilitiesT.DriverClassT;

import java.util.List;

public class AddingNewPayeeStepDefinition {
    CommonMethodsT commonMethodsT = new CommonMethodsT();
    addingNewPayeePage addingNewPayeePge = new addingNewPayeePage();
    @When("I click on the online Banking Buttons")
    public void ı_click_on_the_online_banking_buttons() {
        addingNewPayeePge.waitTime(2);
       addingNewPayeePge.clickOnlineButton.click();
    }
    @When("I click the pay bills button")
    public void ı_click_the_pay_bills_button() {
        addingNewPayeePge.waitTime(2);
        addingNewPayeePge.clickPayBillsButton.click();
    }
    @When("I click the addin new payee button")
    public void ı_click_the_addin_new_payee_button() {
        addingNewPayeePge.waitTime(2);
        addingNewPayeePge.clickaddNewPayeeButton.click();
    }
    @When("I Send the keys text box")
    public void ı_send_the_keys_text_box(DataTable addinPayee) {
        List<String> ListOfPayee =addinPayee.asList();
        addingNewPayeePge.sendKeys(addingNewPayeePge.payeeNameTextAdding,ListOfPayee.get(0));
        addingNewPayeePge.waitTime(1);
        addingNewPayeePge.sendKeys(addingNewPayeePge.PayeeAddressTextAdding,ListOfPayee.get(1));
        addingNewPayeePge.waitTime(1);
        addingNewPayeePge.sendKeys(addingNewPayeePge.accountTextAdding,ListOfPayee.get(2));
        addingNewPayeePge.waitTime(1);
        addingNewPayeePge.sendKeys(addingNewPayeePge.payeDetailTextAdding,ListOfPayee.get(3));
        addingNewPayeePge.waitTime(1);


    }
    @When("I click on the add button")
    public void ı_click_on_the_add_button() {
        addingNewPayeePge.waitTime(2);
        addingNewPayeePge.clickAddButton.click();
    }

    @Then("I Should see the The new payee {string} was successfully created message")
    public void ı_should_see_the_the_new_payee_was_successfully_created_message(String message) {

       Assert.assertEquals(addingNewPayeePge.payeemMessage(message).getText(),message );
    }





}
