package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class AddressPageObject extends BasePage {

    public AddressPageObject(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;

}
