package polinas.defenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import polinas.utilities.WebDriverClass;

import java.time.Duration;

public class AddNewPayeeStepDefinitions {

    @Given("I am logged into the Zero web application")
    public void iAmLoggedIntoTheZeroWebApplication() {
        WebDriverClass.getDriver().get("http://zero.webappsecurity.com/index.html");

        WebElement signInButton = WebDriverClass.getDriver().findElement(By.id("signin_button"));
        signInButton.click();

        new WebDriverWait(WebDriverClass.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h3[normalize-space()='Log in to ZeroBank'])[1]")));

        WebElement usernameField = WebDriverClass.getDriver().findElement(By.id("user_login"));
        WebElement passwordField = WebDriverClass.getDriver().findElement(By.id("user_password"));
        usernameField.sendKeys("username");
        passwordField.sendKeys("password");

        WebElement submitButton = WebDriverClass.getDriver().findElement(By.xpath("//input[@name='submit']"));
        submitButton.click();


        new WebDriverWait(WebDriverClass.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='username']")));
    }


    @And("I navigate to the online banking section")
    public void iNavigateToTheOnlineBankingSection() {
        WebElement onlineBankingLink = WebDriverClass.getDriver().findElement(By.xpath("//strong[normalize-space()='Online Banking']"));
        onlineBankingLink.click();
    }

    @And("I click on the \"Pay Bills\" button")
    public void iClickOnThePayBillsButton() {
        WebElement payBillsButton = WebDriverClass.getDriver().findElement(By.xpath("//span[@id='pay_bills_link']"));
        payBillsButton.click();
    }

    @And("I click on the \"Add New Payee\" button")
    public void iClickOnTheAddNewPayeeButton() {
        WebElement addNewPayeeButton = WebDriverClass.getDriver().findElement(By.xpath("//a[normalize-space()='Add New Payee']"));
        addNewPayeeButton.click();
    }

    @When("I enter the payee's name {string}, address {string}, account number {string}, and details {string}")
    public void iEnterThePayeesNameAddressAccountNumberAndDetails(String name, String address, String accountNumber, String details) {
        WebDriverClass.getDriver().findElement(By.id("np_new_payee_name")).sendKeys(name);
        WebDriverClass.getDriver().findElement(By.id("np_new_payee_address")).sendKeys(address);
        WebDriverClass.getDriver().findElement(By.id("np_new_payee_account")).sendKeys(accountNumber);
        WebDriverClass.getDriver().findElement(By.id("np_new_payee_details")).sendKeys(details);
    }

    @And("I click on the add button")
    public void iClickOnTheAddButton() {
        WebElement addButton = WebDriverClass.getDriver().findElement(By.xpath("//input[@id='add_new_payee']"));
        addButton.click();
    }

    @Then("I should receive a confirmation message indicating the successful addition of the new payee")
    public void iShouldReceiveAConfirmationMessage() {
        WebElement confirmationMessage = WebDriverClass.getDriver().findElement(By.xpath("//div[@id='alert_content']"));
        boolean isDisplayed = confirmationMessage.isDisplayed();
        assert isDisplayed;
    }


}
