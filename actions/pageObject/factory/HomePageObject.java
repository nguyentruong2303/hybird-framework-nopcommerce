package pageObject.factory;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class HomePageObject extends BasePage {
    
    WebDriver driver;

    public HomePageObject(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }

    public void clickToRegisterLink() {
    }

    public void clickToLoginLink() {
    }

    public void clickToMyAccountLink() {
    }
}
