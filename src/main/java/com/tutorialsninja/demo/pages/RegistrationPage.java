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

public class RegistrationPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegistrationPage.class.getName());

    public RegistrationPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register Account')]")
    WebElement registerText;
    @CacheLookup
    @FindBy(name = "firstname")
    WebElement firstName;
    @CacheLookup
    @FindBy(id = "input-lastname")
    WebElement lastName;
    @CacheLookup
    @FindBy(id = "input-email")
    WebElement email;
    @CacheLookup
    @FindBy(id = "input-telephone")
    WebElement telephoneNumber;

    @CacheLookup
    @FindBy(id = "input-password")
    WebElement password;
    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement confirm_Password;
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/form/fieldset[3]/div/div//label[1]/input")
    WebElement subscribe_Y;
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/form/fieldset[3]/div/div//label[2]/input")
    WebElement subscribe_N;
    @CacheLookup
    @FindBy(name = "agree")
    WebElement privacy;
    @CacheLookup
    @FindBy(xpath = "//input[@class='btn btn-primary']")
    WebElement continue1;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Your Account Has Been Created!')]")
    WebElement accountCreationText;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueFurtherAccountCreation;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueFinal;

    public String getRegisterAccountText() {

        String text = getTextFromElement(registerText);
        log.info("Register Account Text : " + registerText.toString());
        return text;
    }

    public void sendTextFirstIntoNameField(String frstName) {

        sendTextToElement(firstName, frstName);
        log.info("Input User's first name : " + frstName + " into the first Name field " + firstName.toString());
    }

    public void lastContinuebutton(){

        clickOnElement(continueFinal);
        log.info("continue Last time " + continueFinal.toString());

    }

    public void sendTextIntoLastNameField(String lstName) {

        sendTextToElement(lastName, lstName);
        log.info("Enter user last name : " + lstName + " to Last Name field " + lastName.toString());

    }

    public void sendTextIntoEmailField(String email1) {

        sendTextToElement(email, email1 );
        log.info("Enter user email " + email1 + " to Email field " + email.toString());
    }

    public void sendTexIntoTelephoneNumberField(String number) {

        sendTextToElement(telephoneNumber, number);
        log.info("Telephone number : " + number + " in Telephone Number Line " + telephoneNumber.toString());
    }

    public void enteredPasswordIntoPasswordField(String password1) {

        sendTextToElement(password, password1);
        log.info("Enter password " + password1 + " in Password Line " + password.toString());
    }

    public void enteredConfirmPasswordIntoPasswordField(String confrmpassword1) {

        sendTextToElement(confirm_Password, confrmpassword1);
        log.info("Enter password again " + confrmpassword1 + " to Confirm Password field " + confirm_Password.toString());
    }

    public void selectSubscribtionButtons(String subcrb) {

        if (subcrb.equalsIgnoreCase("Yes")) {
            clickOnElement(subscribe_Y);
        } else if (subcrb.equalsIgnoreCase("No")) {
            clickOnElement(subscribe_N);
        }

        log.info("Select Subscribe Option" + password.toString());
    }


    public void clickOnPrivacyButton() {

        clickOnElement(privacy);
        log.info("Clicking on privacy button " + privacy.toString());
    }

    public void clickOnContinueButton() {

        clickOnElement(continue1);
        log.info("Clicking on continue Button " + continue1.toString());

    }

    public String toGetAccountCreatedText() {

        String message = getTextFromElement(accountCreationText);
        log.info("Account Created Text : " + accountCreationText.toString());
        return message;
    }

    public void clickOnContinueButtonAfterAccountCreated() {

        clickOnElement(continueFurtherAccountCreation);
        log.info("Clicking on continue Button " + continueFurtherAccountCreation.toString());
    }

    public void registerAsGuestOnCheckout(String frstName, String lstName, String email1, String number, String password1, String confrmpassword1, String subcrb){

        sendTextFirstIntoNameField(frstName);
        sendTextIntoLastNameField(lstName);
        sendTextIntoEmailField(email1);
        sendTexIntoTelephoneNumberField(number);
        enteredPasswordIntoPasswordField(password1);
        enteredConfirmPasswordIntoPasswordField(confrmpassword1);
        selectSubscribtionButtons(subcrb);
        clickOnPrivacyButton();
        clickOnContinueButton();
    }


}
