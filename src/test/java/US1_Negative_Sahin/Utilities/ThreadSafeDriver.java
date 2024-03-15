package US1_Negative_Sahin.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadSafeDriver {

    private static WebDriver driver;

    private static ThreadLocal<WebDriver> threadDriver=new ThreadLocal<>();

    public static ThreadLocal<String> threadBrowserName=ThreadLocal.withInitial(() -> "chrome"); // default to chrome

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

    public static void quitDriver() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        if (threadDriver.get()!=null) {
            threadDriver.get().quit();

            WebDriver driver=threadDriver.get();
            driver=null;

            threadDriver.set(driver);
        }
    }

    public static boolean isRunningOnJenkins() {
        String jenkinsHome = System.getenv("JENKINS_HOME");
        return jenkinsHome != null && !jenkinsHome.isEmpty();
    }

}
