package stepdefinitionsT;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pagesT.LoginTPage;
import utilitiesT.CommonMethodsT;
import utilitiesT.DriverClassT;

import java.util.List;

public class LoginTStepDefinition   {

    LoginTPage page = new LoginTPage();

    @Given("I navigate to the Zero bank page")
    public void iNavigateToTheZeroBankPage() {
        DriverClassT.getDriver().get("http://zero.webappsecurity.com/index.html");
    }

   @When("I click on Signin link")
   public void iClickOnSigninLink() {
  page.clickElement(page.signInLink);

    }

    @And("I enter valid login and user name")
    public void iEnterValidLoginAndUserName(DataTable dataTable) {
        List<String> loginList = dataTable.asList();
        page.sendKeys(page.loginTextBox,loginList.get(0));
        page.waitTime(1);
        page.sendKeys(page.passwordTextBox,loginList.get(1));
        page.waitTime(1);

    }

    @And("I click on the Sing in button")
    public void iClickOnTheSingInButton() {
        page.clickElement(page.signInButton);
        page.navigateBack();
    }
}
