package polinas.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverClass {

    private static WebDriver driver;

    public static WebDriver getDriver(){
        if(driver == null){

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alexey\\Downloads\\chromedriver_win32");

            ChromeOptions options = new ChromeOptions();


            options.addArguments("--start-maximized");
            options.addArguments("--ignore-certificate-errors");
            options.addArguments("--disable-popup-blocking");

            driver = new ChromeDriver(options);

            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void closeDriver(){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }
}
