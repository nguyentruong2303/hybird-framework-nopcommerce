package pageObjects.user;

import commons.BasePage;
import commons.PageGeneratorManager;
import org.openqa.selenium.WebDriver;
import pageUIs.user.MyAccountSideBarUI;

public class MyAccountSideBarPageObject extends BasePage {
    public MyAccountSideBarPageObject(WebDriver driver) {
        this.driver = driver;
    }


    WebDriver driver;


    public AddressPageObject openAddressPage(WebDriver driver) {
        waitForElementClickable(driver, MyAccountSideBarUI.ADDRESS_LINK_TEXT);
        clickToElement(driver, MyAccountSideBarUI.ADDRESS_LINK_TEXT);
        return PageGeneratorManager.getAddressPage(driver);
    }

    public OrdersPageObject openOrdersPage(WebDriver driver) {
        waitForElementClickable(driver, MyAccountSideBarUI.ORDERS_LINK_TEXT);
        clickToElement(driver, MyAccountSideBarUI.ORDERS_LINK_TEXT);
        return PageGeneratorManager.getOrders(driver);
    }

    public DownloadableProductsPageObject openDownloadableProductsPage(WebDriver driver) {
        waitForElementClickable(driver, MyAccountSideBarUI.DOWNLOADABLE_PRODUCTS_LINK_TEXT);
        clickToElement(driver, MyAccountSideBarUI.DOWNLOADABLE_PRODUCTS_LINK_TEXT);
        return PageGeneratorManager.getDownloadableProducts(driver);
    }

    public BackInStockSubscriptionsPageObject openBackInStockSubscriptionsPage(WebDriver driver) {
        waitForElementClickable(driver, MyAccountSideBarUI.BACK_IN_STOCK_SUBSCRIPTION_LINK_TEXT);
        clickToElement(driver, MyAccountSideBarUI.BACK_IN_STOCK_SUBSCRIPTION_LINK_TEXT);
        return PageGeneratorManager.getBackInStockSubcriptions(driver);
    }

    public RewardPointsPageObject openRewardPointsPage(WebDriver driver) {
        waitForElementClickable(driver, MyAccountSideBarUI.REWARD_POINTS_LINK_TEXT);
        clickToElement(driver, MyAccountSideBarUI.REWARD_POINTS_LINK_TEXT);
        return PageGeneratorManager.getRewardPoints(driver);
    }

    public ChangePasswordPageObject openChangePasswordPage(WebDriver driver) {
        waitForElementClickable(driver, MyAccountSideBarUI.CHANGE_PASSWORD_LINK_TEXT);
        clickToElement(driver, MyAccountSideBarUI.CHANGE_PASSWORD_LINK_TEXT);
        return PageGeneratorManager.getChangePassword(driver);
    }

    public MyProductReviewsPageObject openMyProductReviewsPage(WebDriver driver) {
        waitForElementClickable(driver, MyAccountSideBarUI.MY_PRODUCT_REVIEWS_LINK_TEXT);
        clickToElement(driver, MyAccountSideBarUI.MY_PRODUCT_REVIEWS_LINK_TEXT);
        return PageGeneratorManager.getMyProductsReviews(driver);
    }
}
