package com.tutorialsninja.demo.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

public class MyAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(MyAccountPage.class.getName());

    public MyAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "(//span[@class='hidden-xs hidden-sm hidden-md'])[3]")
    WebElement myAccountBtn;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Account Logout')]")
    WebElement accountLogoutText;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Your Account Has Been Created!')]")
    WebElement accountCreatedText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueBtn;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement userRegisterLink;

    @CacheLookup
    @FindBy(xpath = "/li[@class='dropdown open']/ul/li[2]")
    WebElement userLoginLink;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//li")
    List<WebElement> listOfAccountOptions;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myAccountTxt;


    public void clickOnMyAccount() {

        clickOnElement(myAccountBtn);
        log.info("Click on My Account Link " + myAccountBtn.toString());
    }

    public String getAccountLogoutText() {

        String text = getTextFromElement(accountLogoutText);
        log.info("Logout Text : " + accountLogoutText.toString());
        return text;
    }

    public String getAccountCreatedText() {

        String text = getTextFromElement(accountCreatedText);
        log.info("Created Text : " + accountCreatedText.toString());
        return text;
    }

    public void clickContinueButtonForLogout() {

        clickOnElement(continueBtn);
        log.info("Click on Logout Button" + continueBtn.toString());
    }

    public void clickOnRegestration() {

        clickOnElement(userRegisterLink);
        log.info("Click on User Registration" + userRegisterLink.toString());
    }

    public void clickOnLoginLink() {

        clickOnElement(userLoginLink);
        log.info("Click on Login Link " + userLoginLink.toString());
    }

    public void selectMyAccountOptions(String options) {
        log.info("Select My Account Options " + listOfAccountOptions.toString());

        List<WebElement> accountOptionList = listOfAccountOptions;
        for (WebElement accountOptions : accountOptionList) {
            if (accountOptions.getText().equalsIgnoreCase(options)) {
                accountOptions.click();
                break;
            }
        }
    }

    public String getMyAccountText() {

        String text = getTextFromElement(myAccountTxt);
        log.info("My Account Text " + myAccountTxt.toString());
        return text;
    }
}
