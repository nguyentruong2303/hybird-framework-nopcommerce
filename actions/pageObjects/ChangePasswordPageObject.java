package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class ChangePasswordPageObject extends BasePage {
    public ChangePasswordPageObject(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;
}
