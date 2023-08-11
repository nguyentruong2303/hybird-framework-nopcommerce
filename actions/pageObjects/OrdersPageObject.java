package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class OrdersPageObject extends BasePage {
    public OrdersPageObject(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;
}
