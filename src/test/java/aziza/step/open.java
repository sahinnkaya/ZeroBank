package aziza.step;

import aziza.page.LoginPage;
import aziza.page.ParentPage;
import aziza.utilit.UTI;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilitiesT.DriverClassT;

import java.time.Duration;

public class open {
    UTI ut = new UTI();
    LoginPage page = new LoginPage();
    ParentPage pa = new ParentPage();

    @Then("I creating new a Payee Name")
    public void i_creating_new_a_payee_name() throws InterruptedException {


        ut.actionClick(page.clickaddNewPayeeButton);
        pa.wait(2);
        pa.clickElement(page.PayeeName);
        pa.wait(1);
        ut.sendKeys(page.PayeeName, "Rihanna");
    }
    @Then("I creating new a Payee Address")
    public void i_createing_new_a_payee_address() throws InterruptedException {
        pa.clickElement(page.PayeeAddress);
        pa.wait(1);
        ut.sendKeys(page.PayeeAddress, "I Do NOt");

    }
    @Then("I creating new a Account")
    public void i_creating_new_a_account() throws InterruptedException {
        pa.clickElement(page.Account);
        pa.wait(1);
        ut.sendKeys(page.Account, "147852369");

    }
    @Then("I creating new a Payee Details")
    public void i_creating_new_a_payee_details() throws InterruptedException {
        pa.clickElement(page.PayeeDetails);
        pa.wait(1);
        ut.sendKeys(page.PayeeDetails, "Internet Bill");

    }
    @Then("I pushing Add")
    public void i_pushing_add() {
        pa.clickElement(page.pushAdd);
    }

    @Given("I navigate to the Zero bank")
    public void iNavigateToTheZeroBank() {
        DriverClassT.getDriver().get("http://zero.webappsecurity.com/login.html");
    }

    @When("I click on Signin")
    public void iClickOnSignin() {
     ut.clickElement(page.login1);
     ut.sendKeys(page.login1,"username" );
        ut.clickElement(page.password1);
        ut.sendKeys(page.password1,"password" );

    }

    @And("I enter valid login and user")
    public void iEnterValidLoginAndUser() {


//
//        usernameField.sendKeys("username");
//        passwordField.sendKeys("password");
    }
}
