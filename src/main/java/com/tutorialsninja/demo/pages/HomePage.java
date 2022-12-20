package com.tutorialsninja.demo.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//nav[@id='menu']//ul//li//a")
    List<WebElement> topMenu;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[1]")
    WebElement desktopLink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
    WebElement showAllDesktop;

    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement laptopsAndNotebooksLink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Show All Laptops & Notebooks')]")
    WebElement showAllLaptopsAndNotebooks;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Currency')]")
    WebElement currencyTab;

    @CacheLookup
    @FindBy(xpath = "//ul[@class = 'dropdown-menu']/li")
    List<WebElement> currencyList1;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myAccountTab;

    @CacheLookup
    @FindBy(xpath = "//div[@class='nav pull-right']/ul[1]/li[2]/ul[1]/li[5]/a[1]")
    WebElement myAccountLogoutTab;

    @CacheLookup
    @FindBy(xpath = "//div[@id='top-links']//li[contains(@class,'open')]/ul/li")
    List<WebElement> myAccountOptions;

    public void selectMenu(String menu) {
        Reporter.log("The Top Menu Options are  " + topMenu.toString());
        List<WebElement> menuList = topMenu;
        try {
            for (WebElement list : menuList) {
                if (list.getText().equalsIgnoreCase(menu)) {
                    list.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            menuList = topMenu;
        }

    }

    public void clickOnMyAccountLogout(){
       clickOnMyAccountTab();
       clickOnElement(myAccountLogoutTab);

    }

    public void clickOnShowAllDesktops() {

        clickOnElement(showAllDesktop);
        log.info("Click on Show All Desktops " + showAllDesktop.toString());
    }

    public void mouseHooverOverDesktopMenu() {

        mouseHoverToElement(desktopLink);
        log.info("MouseHoover over Desktops Menu " + desktopLink.toString());
    }

    public void mousehooverOverLaptopsAndNotebooksMenu() {

        clickOnElement(laptopsAndNotebooksLink);
        log.info("Mousehoover Over Laptops & Notebooks Menu " + laptopsAndNotebooksLink.toString());
    }

    public void clickOnShowAllLaptopAndNotebooks() {

        clickOnElement(showAllLaptopsAndNotebooks);
        log.info("Click on Show All Laptops And NoteBooks" + showAllLaptopsAndNotebooks.toString());

    }
    public void chooseYourCurrency() {
        clickOnElement(currencyTab);
        List<WebElement> currencyList = currencyList1;
        for (WebElement currency : currencyList) {
            if (currency.getText().equalsIgnoreCase("£ Pound Sterling")) {
                currency.click();
                break;
            }
        }
    }

    public void clickOnMyAccountTab() {

        clickOnElement(myAccountTab);
        log.info("Click on My Account Tab" + myAccountTab.toString());

    }

    public void selectAnyOptionFromMyAccountOptions(String options) {
        Reporter.log("Select Any Option From My Account Options" + myAccountOptions.toString());

        List<WebElement> accountOptionList = myAccountOptions;
        for (WebElement accountOptions : accountOptionList) {
            if (accountOptions.getText().equalsIgnoreCase(options)) {
                accountOptions.click();
                break;
            }
        }
    }

    public void mouseHooverOverMainMenuBar(String mainMenu) {
        Reporter.log("The Top Menu Options are " + topMenu.toString());
        Actions actions = new Actions(driver);
        List<WebElement> menuList = topMenu;
        try {
            for (WebElement list : menuList) {
                if (list.getText().equalsIgnoreCase(mainMenu)) {
                    actions.moveToElement(list).build().perform();
                }
            }
        } catch (StaleElementReferenceException e) {
            menuList = topMenu;
        }
    }
}
