package commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.Random;
import java.util.concurrent.TimeUnit;


public class BaseTest {

    WebDriver driver;
    String path = System.getProperty("user.dir");

    protected WebDriver getBrowserDriver(String browserName) {
        BrowserList browser = BrowserList.valueOf(browserName.toUpperCase());
        switch (browser) {
            case FIREFOX:
                System.setProperty("webdriver.gecko.driver", path + "\\browserDrivers\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            case CHROME:
                System.setProperty("webdriver.chrome.driver", path + "\\browserDrivers\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case EDGE:
                System.setProperty("webdriver.edge.driver", path + "\\browserDrivers\\msedgedriver.exe");
                driver = new EdgeDriver();
                break;
            case OPERA:
                System.setProperty("webdriver.opera.driver", path + "\\browserDrivers\\operadriver.exe");
                driver = new OperaDriver();
                break;
            default:
                System.out.println("Browser is invalid");
        }
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");
        return driver;
    }
    public String getRandomEmail() {
        Random rand = new Random();
        return "automation" + rand.nextLong(9999) + "@gmail.com";
    }

    public void quitBrowser(){
        driver.quit();
    }
}
