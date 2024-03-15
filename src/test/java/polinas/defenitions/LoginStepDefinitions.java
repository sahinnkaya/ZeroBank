package polinas.defenitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import polinas.utilities.WebDriverClass;

public class LoginStepDefinitions {

    private final WebDriver driver = WebDriverClass.getDriver();

    @Given("I am on the homepage of the Zero web application")
    public void iAmOnTheHomepageOfTheZeroWebApplication() {
        driver.get("http://zero.webappsecurity.com/");
    }

    @When("I click on the \"Sign in\" button")
    public void iClickOnTheSignInButton() {
        driver.findElement(By.xpath("//button[@id='signin_button']")).click();
    }

    @Then("I should be directed to the login page")
    public void iShouldBeDirectedToTheLoginPage() {
        WebElement loginForm = driver.findElement(By.xpath("(//h3[normalize-space()='Log in to ZeroBank'])[1]"));
        assert loginForm.isDisplayed();
    }

    @When("I enter the username {string} and password {string} correctly")
    public void iEnterTheUsernameAndPasswordCorrectly(String username, String password) {
        driver.findElement(By.id("user_login")).sendKeys(username);
        driver.findElement(By.id("user_password")).sendKeys(password);
    }

    @When("I click on the login button")
    public void iClickOnTheLoginButton() {
        driver.findElement(By.name("submit")).click();
    }

    @Then("I should be redirected back to the previous page")
    public void iShouldBeRedirectedBackToThePreviousPage() {
        WebElement loggedInElement = driver.findElement(By.xpath("//a[normalize-space()='Zero Bank']"));
        assert loggedInElement.isDisplayed();
    }

    @Then("I should be able to verify that I am logged in by checking for appropriate indicators on the page")
    public void iShouldBeAbleToVerifyThatIAmLoggedInByCheckingForAppropriateIndicatorsOnThePage() {
        WebElement profileIndicator = driver.findElement(By.xpath("//a[normalize-space()='username']"));
        assert profileIndicator.isDisplayed();
    }
}