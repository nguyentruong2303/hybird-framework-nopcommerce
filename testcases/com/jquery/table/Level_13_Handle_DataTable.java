package com.jquery.table;

import commons.BaseTest;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.jquery.HomePageObject;
import pageObjects.jquery.PageGeneratorManager;

public class Level_13_Handle_DataTable extends BaseTest {

    WebDriver driver;
    private HomePageObject homePage;

    @Parameters({"browser", "url"})
    @BeforeClass
    public void BeforeClass(String browserName, String url) {
        driver = getBrowserDriverWithUrl(browserName, url);
        homePage = PageGeneratorManager.getHomePageObject(driver);
    }

    
    public void TC_01_Search_Data() {
    	homePage.inputToColumnTextboxByName("Females","384187");
    	homePage.sleepInSecond(2);
    	
    	homePage.inputToColumnTextboxByName("Country","Albania");
    	homePage.sleepInSecond(2);

    	homePage.inputToColumnTextboxByName("Males","276472");
    	homePage.sleepInSecond(2);

    	homePage.inputToColumnTextboxByName("Total","1900");
    	homePage.sleepInSecond(2);

    }

    public void TC_02_Paging() {
    	homePage.clickToPageLinkByNumber("4");
    	homePage.sleepInSecond(2);
    	Assert.assertTrue(homePage.isPageActiveByNumber("4"));
    	
    	
    	homePage.clickToPageLinkByNumber("12");
    	homePage.sleepInSecond(2);
    	Assert.assertTrue(homePage.isPageActiveByNumber("12"));


    	homePage.clickToPageLinkByNumber("20");
    	homePage.sleepInSecond(2);
    	Assert.assertTrue(homePage.isPageActiveByNumber("20"));


    	homePage.clickToPageLinkByNumber("2");
    	homePage.sleepInSecond(2);
    	Assert.assertTrue(homePage.isPageActiveByNumber("2"));


    	homePage.clickToPageLinkByNumber("10");
    	homePage.sleepInSecond(2);
    	Assert.assertTrue(homePage.isPageActiveByNumber("10"));
    }

    public void User_03_Displayed() {
    	Assert.assertTrue(homePage.isRowValuesDisplayed("384187","Afghanistan", "407124", "791312"));
    	Assert.assertTrue(homePage.isRowValuesDisplayed("283821","Algeria", "295140", "578961"));
    	Assert.assertTrue(homePage.isRowValuesDisplayed("750","Aruba", "756", "1504"));

    }
   
    @Test
    public void User_04_Switch_Page() {
    	homePage.clickToRowActionByCountryName("Afghanistan", "remove");
    	homePage.clickToRowActionByCountryName("AFRICA", "remove");
    	homePage.clickToRowActionByCountryName("Albania", "remove");
    	homePage.clickToRowActionByCountryName("Algeria", "remove");
    	homePage.clickToRowActionByCountryName("Angola", "remove");
    	homePage.refreshPageCurrent(driver);
    	
    	homePage.clickToRowActionByCountryName("Afghanistan", "edit");
    	homePage.refreshPageCurrent(driver);
    	
    	homePage.clickToRowActionByCountryName("Algeria", "edit");
    	homePage.refreshPageCurrent(driver);
    	
    	homePage.clickToRowActionByCountryName("Algeria", "edit");
    	homePage.refreshPageCurrent(driver);
    }


    @AfterClass
    public void AfterClass() {
        quitBrowser();
    }


}
