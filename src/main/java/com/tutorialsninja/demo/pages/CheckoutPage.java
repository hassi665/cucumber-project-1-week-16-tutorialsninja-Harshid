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

public class CheckoutPage extends Utility {

    private static final Logger log = LogManager.getLogger(CheckoutPage.class.getName());

    public CheckoutPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Checkout')]")
    WebElement checkoutTxt;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'New Customer')]")
    WebElement newCustomerTxt;

    @CacheLookup
    @FindBy(xpath = "//div[@class='panel-group']/div[1]/div[2]/div/div/div[1]/div[2]/label/input")
    WebElement guestCheck;

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-account']")
    WebElement continueBttn;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-firstname']")
    WebElement fName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-lastname']")
    WebElement lName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-email']")
    WebElement email;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-telephone']")
    WebElement phone;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-address-1']")
    WebElement address;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-city']")
    WebElement city;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-postcode']")
    WebElement postcode;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-country']")
    WebElement country;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-zone']")
    WebElement region;

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-guest']")
    WebElement guestButton;

    @CacheLookup
    @FindBy(id = "button-account")
    WebElement guestButtonCheckout;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/p[2]/textarea[1]")
    WebElement commentField;

    @CacheLookup
    @FindBy(name = "agree")
    WebElement terms;
    @CacheLookup
    @FindBy(xpath = "//input[@id='button-payment-method']")
    WebElement continueToComment;

    @CacheLookup
    @FindBy(xpath = "//div[@class='panel-group']/div[3]/div[2]/div/div[1]")
    WebElement paymentError;

    public String getTextFromCheckOutPage() {

        String text = getTextFromElement(checkoutTxt);
        log.info(" Checkout Text : " + checkoutTxt.toString());
        return text;
    }

    public String getNewCustomer() {

        String text = getTextFromElement(newCustomerTxt);
        log.info(" New Customer Text : " + newCustomerTxt.toString());
        return text;
    }

    public void clickOnGuestChckout() {

        clickOnElement(guestCheck);
        log.info("Clicking on guest checkout button : " + guestCheck.toString());
    }

    public void clickOnContinue() {

        clickOnElement(continueBttn);
        log.info("Clicking on continue button : " + continueBttn.toString());
    }

    public void sendTextToFirstNameLine(String frstName) {

        sendTextToElement(fName, frstName );
        log.info("Enter user first name : " + frstName + "In appropriate line " + fName.toString());
    }

    public void sendTextToLastNameLine(String lstname) {

        sendTextToElement(lName, lstname );
        log.info("Enter user last name : " + lstname + "In appropriate line " + lName.toString());
    }

    public void sendTextToEmailLine(String uEmail) {

        sendTextToElement(email, uEmail );
        log.info("Enter email address : " + uEmail + "In appropriate line " + email.toString());
    }

    public void sendTextToTelephoneLine(String num) {

        sendTextToElement(phone, num );
        log.info("Enter phone number : " + num + "In appropriate line " + phone.toString());
    }

    public void sendTextToAddressLine(String adrs) {

        sendTextToElement(address, adrs);
        log.info("Enter Address : " + adrs + "In appropriate line " + address.toString());
    }

    public void sendTextToCityLine(String cty) {

        sendTextToElement(city, cty);
        log.info("Enter city name : " + cty + "In appropriate line " + cty.toString());

    }

    public void sendTextToPostCodeLine(String pCode) {

        sendTextToElement(postcode, pCode);
        log.info("Enter postcode : " + pCode + "In appropriate line " + postcode.toString());
    }

    public void selectCountryLine(String ctry) {

        selectByVisibleTextFromDropDown(country, ctry);
        log.info("Select country : " + ctry + "In appropriate line " + country.toString());
    }

    public void selectRegionLine(String regn) {

        selectByVisibleTextFromDropDown(region, regn);
        log.info("Select region : " + regn + "In appropriate line " + region.toString());
    }

    public void clickOnContinueGuestBttn() {

        clickOnElement(guestButton);
        log.info("Clicking on continue Button in guest section " + guestButton.toString());

    }


    public void sendTextToCommentField(String comment) {

        sendTextToElement(commentField, comment);
        log.info("Input comments : " + comment + "In appropriate line " + comment.toString());
    }

    public void clickOnTerms() {

        clickOnElement(terms);
        log.info("Click on term and conditions " + terms.toString());
    }

    public void clickOnContinueToCommentSection() {

        clickOnElement(continueToComment);
        log.info("Clicking on continue Button in comment section " + continueToComment.toString());
    }

    public String getPaymentError() {

        String text = getTextFromElement(paymentError);
        log.info("payment error : " + paymentError.toString());
        return text;
    }

    public void registerToApplicationAsGuest(String frstName, String lstname,String uEmail, String num, String adrs, String cty, String pCode, String ctry, String regn) throws InterruptedException {

        sendTextToFirstNameLine(frstName);
        sendTextToLastNameLine(lstname);
        sendTextToEmailLine(uEmail);
        sendTextToTelephoneLine(num);
        sendTextToAddressLine(adrs);
        sendTextToCityLine(cty);
        sendTextToPostCodeLine(pCode);
        selectCountryLine(ctry);
        Thread.sleep(1000);
        selectRegionLine(regn);
        Thread.sleep(1000);
        clickOnContinueGuestBttn();
        Thread.sleep(2000);

    }
}
