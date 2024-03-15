package utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class US_02_CommonMethods {
    public US_02_CommonMethods(){
        PageFactory.initElements(US_02_DriverClass.getDriver(),this);
    }
    protected static final Logger log = LogManager.getLogger();
    public WebDriverWait wait = new WebDriverWait(US_02_DriverClass.getDriver(), Duration.ofSeconds(10));

    public void waitUntilVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }


    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) US_02_DriverClass.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickElement(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElement(element);
        element.click();
    }

    public void verifyContainsText(WebElement element, String value) {
        wait.until(ExpectedConditions.textToBePresentInElement(element, value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()));
        new Actions(US_02_DriverClass.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
    }

    public void clickJSExecutor(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElement(element);
        JavascriptExecutor js = (JavascriptExecutor) US_02_DriverClass.getDriver();
        js.executeScript("arguments[0].click();", element);
    }

    public boolean isWebElementDisplayed(WebElement webElement) {
        log.trace("isWebElementDisplayed(" + webElement + ")");

        return webElement.isDisplayed();
    }

    public void sendKeys(WebElement element, String key) {

        element.sendKeys(key);

    }
    public void actionClick(WebElement element){
        Actions action = new Actions(US_02_DriverClass.getDriver());
        action.moveToElement(element).click(element).build().perform();

    }
    public void clickMethod(WebElement element){
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();

    }

    public void navigateBack(){
        US_02_DriverClass.getDriver().navigate().back();
    }
    public static void waitTime(int seconds){
        try{
            Thread.sleep(1000L * seconds);
        } catch (InterruptedException e) {
            log.warn("InterruptedException in Thread.sleep(). Message: " + e.getMessage());
        }

    }
}
