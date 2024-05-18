package pageObjects.jquery;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.jquery.HomePageUI;

public class HomePageObject extends BasePage{
	WebDriver driver;

	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public void inputToColumnTextboxByName(String columnName, String valueToSend) {
		waitForElementVisible(driver, HomePageUI.COLUMN_TEXTBOX_BY_NAME, columnName);
		sendkeyToElement(driver, HomePageUI.COLUMN_TEXTBOX_BY_NAME, valueToSend, columnName);
	}
	
	public void clickToPageLinkByNumber(String pageNumber) {
		waitForElementClickable(driver, HomePageUI.PAGE_LINK_BY_NUMBER, pageNumber);
		clickToElement(driver, HomePageUI.PAGE_LINK_BY_NUMBER, pageNumber);
	}
	
	public boolean isPageActiveByNumber(String pageNumber) {
		waitForElementVisible(driver, HomePageUI.PAGE_ACTIVE_BY_NUMBER, pageNumber);
		return	isElementDisplayed(driver, HomePageUI.PAGE_ACTIVE_BY_NUMBER, pageNumber);
	}
	
	public boolean isRowValuesDisplayed(String female, String country, String male, String total) {
		waitForElementVisible(driver, HomePageUI.DYNAMIC_ROW_VALUE, female, country, male, total );
		return isElementDisplayed(driver, HomePageUI.DYNAMIC_ROW_VALUE, female, country, male, total);
	}
	
	public void clickToRowActionByCountryName(String country, String action) {
		waitForElementClickable(driver, HomePageUI.DYNAMIC_ACTION_ROW, country, action);
		clickToElement(driver, HomePageUI.DYNAMIC_ACTION_ROW, country, action);
	}
	

}
