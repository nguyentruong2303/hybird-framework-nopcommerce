package commons;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.Random;
import java.util.concurrent.TimeUnit;


public class BaseTest {

    private WebDriver driver;
    private String path = System.getProperty("user.dir");

    protected WebDriver getBrowserDriver(String browserName) {
        BrowserList browser = BrowserList.valueOf(browserName.toUpperCase());
        switch (browser) {
            case FIREFOX:
                driver = WebDriverManager.firefoxdriver().create();
                break;
            case CHROME:
                driver = WebDriverManager.chromedriver().create();
                break;
            case EDGE:
                driver = WebDriverManager.edgedriver().create();
                break;
            case OPERA:
                driver = WebDriverManager.operadriver().create();
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
