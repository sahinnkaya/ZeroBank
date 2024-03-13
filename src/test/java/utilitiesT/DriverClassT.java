package utilitiesT;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DriverClassT {

   private static WebDriver driver;

   public static WebDriver getDriver(){
       if(driver==null){
           Logger logger = Logger.getLogger("");
           logger.setLevel(Level.SEVERE);
           driver = new ChromeDriver();
           driver.manage().window().maximize();
           driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       }
       return driver;
   }
   public static void  quitDriver(){
       if (driver==null){
           driver.quit();
           driver=null;

       }
   }
}
