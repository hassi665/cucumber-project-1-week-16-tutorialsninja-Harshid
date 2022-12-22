package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.pages.MyAccountPage;
import com.tutorialsninja.demo.pages.RegistrationPage;
import com.tutorialsninja.demo.utility.Utility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class RegisterStep extends Utility {

   RegistrationPage registrationPage = new RegistrationPage();
    HomePage homePage = new HomePage();
    MyAccountPage myAccountPage = new MyAccountPage();

    @And("^I Call the method “selectMyAccountOptions” method and pass the parameter “Register”$")
    public void iCallTheMethodSelectMyAccountOptionsMethodAndPassTheParameterRegister() {

        homePage.selectAnyOptionFromMyAccountOptions("Register");

    }

    @And("^I fill all the required details for registration$")
    public void iFillAllTheRequiredDetailsForRegistration() {

        registrationPage.registerAsGuestOnCheckout();
    }

    @And("^I again click on \"([^\"]*)\" link$")
    public void iAgainClickOnLink(String arg0){
        registrationPage.clickOnContinueButtonAfterAccountCreated();

    }

    @And("^I Call the method “selectMyAccountOptions” method and pass the parameter “Logout”$")
    public void iCallTheMethodSelectMyAccountOptionsMethodAndPassTheParameterLogout() throws InterruptedException {
        Thread.sleep(1000);
        homePage.clickOnMyAccountLogout();
       // homePage.clickOnMyAccountTab();


    }

    @And("^I can see successfully logout$")
    public void iCanSeeSuccessfullyLogout() throws InterruptedException {
        Thread.sleep(1000);
        myAccountPage.getAccountLogoutText();
    }

    @Then("^I Click on “continue” button$")
    public void iClickOnContinueButton() throws InterruptedException {
        Thread.sleep(1000);
        registrationPage.lastContinuebutton();

    }


}
