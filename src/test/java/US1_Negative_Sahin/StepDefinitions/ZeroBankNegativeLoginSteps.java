package US1_Negative_Sahin.StepDefinitions;

import US1_Negative_Sahin.Pages.LoginPage;
import US1_Negative_Sahin.Utilities.ReusableMethods;
import US1_Negative_Sahin.Utilities.ThreadSafeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ZeroBankNegativeLoginSteps {

    LoginPage loginPage = new LoginPage();
    ReusableMethods reusableMethods = new ReusableMethods();


    @Given("Navigate to ZeroBank website")
    public void navigate_to_zero_bank_website() {
        ThreadSafeDriver.getDriver().get("http://zero.webappsecurity.com/index.html");
        // loginPage.navigateBack();
    }

    @When("I click on SignIn")
    public void iClickOnSignIn() {
        reusableMethods.wait(2);
        loginPage.signInButton.click();
    }

    @When("I enter {string} in the login box")
    public void iEnterInTheLoginBox(String username) {
        reusableMethods.wait(2);
        loginPage.sendKeys(loginPage.loginBox, username);
    }

    @When("I enter {string} in password box")
    public void iEnterInPasswordBox(String password) {
        reusableMethods.wait(2);
        loginPage.sendKeys(loginPage.passwordBox, password);
    }

    @When("I click on Sign In button")
    public void iClickOnSignInButton() {
        loginPage.signInSubmitButton.click();
    }

    @And("I should see the wrong login title {string}")
    public void iShouldSeeTheWrongLoginTitle(String title) {
        reusableMethods.wait(2);
        Assert.assertEquals(loginPage.wrongLoginTitle.getText(), title);
    }

    @And("I should see the wrong login message {string}")
    public void iShouldSeeTheWrongLoginMessage(String message) {
        reusableMethods.wait(2);
        Assert.assertEquals(loginPage.wrongLoginMessage, message);
    }
}
