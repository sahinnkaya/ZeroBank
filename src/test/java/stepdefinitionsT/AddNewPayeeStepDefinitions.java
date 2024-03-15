package stepdefinitionsT;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilitiesT.DriverClassT;

import java.time.Duration;

public class AddNewPayeeStepDefinitions {

    @Given("I am logged into the Zero web application")
    public void iAmLoggedIntoTheZeroWebApplication() {
        DriverClassT.getDriver().get("http://zero.webappsecurity.com/index.html");

        WebElement signInButton = DriverClassT.getDriver().findElement(By.id("signin_button"));
        signInButton.click();

        new WebDriverWait(DriverClassT.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h3[normalize-space()='Log in to ZeroBank'])[1]")));

        WebElement usernameField = DriverClassT.getDriver().findElement(By.id("user_login"));
        WebElement passwordField = DriverClassT.getDriver().findElement(By.id("user_password"));
        usernameField.sendKeys("username");
        passwordField.sendKeys("password");

        WebElement submitButton = DriverClassT.getDriver().findElement(By.xpath("//input[@name='submit']"));
        submitButton.click();


        new WebDriverWait(DriverClassT.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='username']")));
    }


    @And("I navigate to the online banking section")
    public void iNavigateToTheOnlineBankingSection() {
        WebElement onlineBankingLink = DriverClassT.getDriver().findElement(By.xpath("//strong[normalize-space()='Online Banking']"));
        onlineBankingLink.click();
    }

    @And("I click on the \"Pay Bills\" button")
    public void iClickOnThePayBillsButton() {
        WebElement payBillsButton = DriverClassT.getDriver().findElement(By.xpath("//span[@id='pay_bills_link']"));
        payBillsButton.click();
    }

    @And("I click on the \"Add New Payee\" button")
    public void iClickOnTheAddNewPayeeButton() {
        WebElement addNewPayeeButton = DriverClassT.getDriver().findElement(By.xpath("//a[normalize-space()='Add New Payee']"));
        addNewPayeeButton.click();
    }

    @When("I enter the payee's name {string}, address {string}, account number {string}, and details {string}")
    public void iEnterThePayeesNameAddressAccountNumberAndDetails(String name, String address, String accountNumber, String details) {
        DriverClassT.getDriver().findElement(By.id("np_new_payee_name")).sendKeys(name);
        DriverClassT.getDriver().findElement(By.id("np_new_payee_address")).sendKeys(address);
        DriverClassT.getDriver().findElement(By.id("np_new_payee_account")).sendKeys(accountNumber);
        DriverClassT.getDriver().findElement(By.id("np_new_payee_details")).sendKeys(details);
    }

    @And("I click on the add button")
    public void iClickOnTheAddButton() {
        WebElement addButton = DriverClassT.getDriver().findElement(By.xpath("//input[@id='add_new_payee']"));
        addButton.click();
    }

    @Then("I should receive a confirmation message indicating the successful addition of the new payee")
    public void iShouldReceiveAConfirmationMessage() {
        // Verify the confirmation message, assuming its locator is known
        WebElement confirmationMessage = DriverClassT.getDriver().findElement(By.xpath("//div[@id='alert_content']"));
        boolean isDisplayed = confirmationMessage.isDisplayed();
        assert isDisplayed;
    }


}
