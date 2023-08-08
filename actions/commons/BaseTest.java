package commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;


public class BaseTest {

    WebDriver driver;
    String path = System.getProperty("user.dir");

    protected void getBrowserDriver(String browserName) {
        switch (browserName) {
            case "firefox":
                System.setProperty("webdriver.gecko.driver", path + "\\browserDrivers\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            case "chrome":
                System.setProperty("webdriver.chrome.driver", path + "\\browserDrivers\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "edge":
                System.setProperty("webdriver.edge.driver", path + "\\browserDrivers\\msedgedriver.exe");
                driver = new EdgeDriver();
                break;
            case "opera":
                System.setProperty("webdriver.opera.driver", path + "\\browserDrivers\\msedgedriver.exe");
                driver = new OperaDriver();
                break;
            default:
                System.out.println("Browser is invalid");
        }
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
}
