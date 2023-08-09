package pageObject.factory;

import commons.BasePage;
import org.openqa.selenium.WebDriver;



public class CustomerPageObject extends BasePage {

    WebDriver driver;

    public CustomerPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public String getFirstNameTextBoxAttributeValue() {
        return null;
    }

    public String getLastNameTextBoxAttributeValue() {
        return null;
    }

    public String getEmailAddressTextBoxAttributeValue() {
        return null;

    }
}
