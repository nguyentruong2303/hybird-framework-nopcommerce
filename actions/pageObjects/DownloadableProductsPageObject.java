package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class DownloadableProductsPageObject extends BasePage {
    public DownloadableProductsPageObject(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;
}
