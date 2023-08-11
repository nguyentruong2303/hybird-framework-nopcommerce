package commons;

import org.openqa.selenium.WebDriver;
import pageObjects.*;

public class PageGeneratorManager {
    public static LoginPageObject getLoginPage(WebDriver driver) {
        return new LoginPageObject(driver);
    }
    public static CustomerPageObject getCustomerPage(WebDriver driver) {
        return new CustomerPageObject(driver);
    }
    public static RegisterPageObject getRegisterPage(WebDriver driver) {
        return new RegisterPageObject(driver);
    }
    public static HomePageObject getHomePage(WebDriver driver) {
        return new HomePageObject(driver);
    }

    public static AddressPageObject getAddressPage(WebDriver driver) {
        return new AddressPageObject(driver);
    }

    public static BackInStockSubscriptionsPageObject getBackInStockSubcriptions(WebDriver driver){
        return new BackInStockSubscriptionsPageObject(driver);
    }

    public static ChangePasswordPageObject getChangePassword(WebDriver driver) {
        return new ChangePasswordPageObject(driver);
    }
    public static DownloadableProductsPageObject getDownloadableProducts(WebDriver driver) {
        return  new DownloadableProductsPageObject(driver);
    }
    public static MyProductReviewsPageObject getMyProductsReviews(WebDriver driver) {
        return new MyProductReviewsPageObject(driver);
    }
    public static RewardPointsPageObject getRewardPoints(WebDriver driver) {
        return  new RewardPointsPageObject(driver);
    }

    public static OrdersPageObject getOrders(WebDriver driver) {
        return new OrdersPageObject(driver);
    }
}
