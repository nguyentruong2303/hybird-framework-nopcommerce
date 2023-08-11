package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class MyProductReviewsPageObject extends BasePage {
    public MyProductReviewsPageObject(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;
}
