package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.CustomerPageUI;

public class CustomerPageObject extends BasePage {

    public CustomerPageObject(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;

    public String getFirstNameTextBoxAttributeValue() {
        waitForElementVisible(driver, CustomerPageUI.FIRST_NAME_TEXTBOX);
        return getAttributeValue(driver,CustomerPageUI.FIRST_NAME_TEXTBOX,"value");
    }

    public String getLastNameTextBoxAttributeValue() {
        waitForElementVisible(driver, CustomerPageUI.LAST_NAME_TEXTBOX);
        return getAttributeValue(driver,CustomerPageUI.LAST_NAME_TEXTBOX,"value");

    }

    public String getEmailAddressTextBoxAttributeValue() {
        waitForElementVisible(driver, CustomerPageUI.EMAIL_ADDRESS_TEXTBOX);
        return getAttributeValue(driver,CustomerPageUI.EMAIL_ADDRESS_TEXTBOX,"value");
    }


}
