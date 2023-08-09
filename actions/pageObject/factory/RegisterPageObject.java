package pageObject.factory;

import commons.BasePage;
import org.openqa.selenium.WebDriver;


public class RegisterPageObject extends BasePage {

    WebDriver driver;

    public RegisterPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void clickToElementRegisterButton() {
    }

    public String getTextFirstNameErrorMessage() {
        return null;
    }

    public String getTextLastNameErrorMessage() {
        return null;
    }

    public String getTextEmailErrorMessage() {
        return null;
    }

    public String getTextPasswordErrorMessage() {
        return null;
    }

    public String getTextConfirmPasswordErrorMessage() {
        return null;
    }

    public void clickToNopCommerceLogo() {
    }

    public void enterToFirstNameTextBox(String automation) {
    }

    public void enterToLastNameTextBox(String fc) {
    }

    public void enterToEmailTextBox(String s) {
    }

    public void enterToPasswordTextBox(String number) {
    }

    public void enterToConfirmPasswordTextBox(String number) {
    }

    public String getTextRegistrationCompleted() {
        return null;
    }
}
