package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import pages.US_02_ConvertMoneyLogin;

public class US_02_ConvertMoneyNegative
{
    US_02_ConvertMoneyLogin page = new US_02_ConvertMoneyLogin();
    @Then("I navigate to the element Online Banking -> More Services")
    public void iNavigateToTheElementOnlineBankingMoreServices() {
        page.clickElement(page.moreServices);
    }

    @And("I click the Pay Bills link")
    public void iClickThePayBillsLink() {
        page.clickElement(page.payBills);
    }
    @And("I choose Purchase Foreign Currency link")
    public void iChoosePurchaseForeignCurrencyLink() {
        page.actionClick(page.purchaseForeignCurrency);
    }

    @And("I should select currency")
    public void iShouldSelectCurrency() {
        Select select = new Select(page.selectTextBox);
        select.selectByVisibleText("Eurozone (euro)");
    }

    @Then("I should enter amount")
    public void iShouldEnterAmount() {
        page.sendKeys(page.amountTextBox,"200");
        page.waitTime(1);
    }

    @And("I should choose U.S Dollar")
    public void iShouldChooseUSDollar() {
        page.clickElement(page.Dollars);
        page.waitTime(1);
    }

    @Then("I should press Calculate Costs")
    public void iShouldPressCalculateCosts() {
        page.clickElement(page.calculateCostButton);
        page.waitTime(1);
    }

    @And("I should click on the Purchase button")
    public void iShouldClickOnThePurchaseButton() {
        page.clickElement(page.purchaseButton);
        page.waitTime(1);
    }

    @Then("I should receive confirmation message")
    public void iShouldReceiveConfirmationMessage() {
        page.isWebElementDisplayed(page.confirmationMessage);

    }
}