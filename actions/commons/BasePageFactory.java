package commons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePageFactory {
    public void openPageUrl(WebDriver driver, String urlPage) {
        driver.get(urlPage);
    }

    public String getPageTitle(WebDriver driver) {
        return driver.getTitle();
    }

    public String getCurrentPageUrl(WebDriver driver) {
        return driver.getCurrentUrl();
    }

    public String getPageResource(WebDriver driver) {
        return driver.getPageSource();
    }

    public void backToPage(WebDriver driver) {
        driver.navigate().back();
    }

    public void forwardToPage(WebDriver driver) {
        driver.navigate().forward();
    }

    public void refreshPageCurrent(WebDriver driver) {
        driver.navigate().refresh();
    }


    public void clickToElement(WebDriver driver, WebElement element) {
        element.click();
    }

    public String getTextElement(WebDriver driver, WebElement element) {
        return element.getText();
    }


    public void sendkeyToElement(WebDriver driver, WebElement element, String valueToSend) {
       element.sendKeys(valueToSend);
    }
}
