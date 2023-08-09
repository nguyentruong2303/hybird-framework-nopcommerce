package pageObject.factory;

import commons.BasePage;
import org.openqa.selenium.WebDriver;


public class LoginPageObject extends BasePage {

    WebDriver driver;

    public LoginPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void enterToEmailTextBox(String emailAddress) {
    }

    public void enterToPasswordTextBox(String number) {
    }

    public void clickToLoginButton() {
    }
}
