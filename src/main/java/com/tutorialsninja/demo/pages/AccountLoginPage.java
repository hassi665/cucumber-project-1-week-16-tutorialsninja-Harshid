package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountLoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(AccountLoginPage.class.getName());

    public AccountLoginPage(){
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div/div[2]//h2")
    WebElement returningCustomerText;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div/div[1]//h2")
    WebElement newCustomerText;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myAccountLink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Login')]")
    WebElement loginlink;

    @CacheLookup
    @FindBy(id = "input-email")
    WebElement emailAddressField;

    @CacheLookup
    @FindBy(id = "input-password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//form[contains(@action,'login')]//input[@type='submit']")
    WebElement loginBtn;

    public String getTextOfReturningCustomer() {
        String text = getTextFromElement(returningCustomerText);
        log.info("Returning Customer Text : " + returningCustomerText.toString());
        return text;
    }

    public String getTextOfNewCustomer() {
        String text = getTextFromElement(newCustomerText);
        log.info("New Customer Text : " + newCustomerText.toString());
        return text;
    }

    public void clickOnMyLoginLink() {
        clickOnElement(myAccountLink);
        log.info("Clicking on My Login Link : " + myAccountLink.toString());
    }

    public void clickOnLoginLink(){

        mouseHoverToElementAndClick(loginlink);
        log.info("Clicking on Login Link : " + loginlink.toString());
    }

    public void sendTextToEmailAddressLine(String emailAdd) {
        sendTextToElement(emailAddressField, emailAdd);
    }

    public void sendTextToPasswordLine(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
       mouseHoverToElementAndClick(loginBtn);
        log.info("Clicking on login Button : " + loginBtn.toString());
    }

    public void loginToApplication(String emailAdd, String password) {
        clickOnMyLoginLink();
        sendTextToEmailAddressLine(emailAdd);
        sendTextToPasswordLine(password);
        clickOnLoginButton();
    }

}
