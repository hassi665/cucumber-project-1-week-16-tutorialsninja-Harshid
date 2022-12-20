package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.AccountLoginPage;
import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.utility.Utility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends Utility {
    AccountLoginPage accountLoginPage = new AccountLoginPage();
    HomePage homePage = new HomePage();

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }


    @When("^I click on myaccount link$")
    public void iClickOnMyaccountLink() {

        accountLoginPage.clickOnMyLoginLink();

    }

    @And("^I Call the method “selectMyAccountOptions” method and pass the parameter “Login”$")
    public void iCallTheMethodSelectMyAccountOptionsMethodAndPassTheParameterLogin() {
        homePage.selectAnyOptionFromMyAccountOptions("Login");

    }

    @And("^I enter email$")
    public void iEnterEmail() {
        accountLoginPage.sendTextToEmailAddressLine("Harshid.Prime123@gmail.com");
    }

    @And("^I enter password$")
    public void iEnterPassword() {
        accountLoginPage.sendTextToPasswordLine("Harshid123");
    }

    @Then("^I able to click on login button successfully$")
    public void iAbleToClickOnLoginButtonSuccessfully() {
        accountLoginPage.clickOnLoginButton();
    }
}
