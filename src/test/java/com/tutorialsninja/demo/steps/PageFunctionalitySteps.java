package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.DesktopPage;
import com.tutorialsninja.demo.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PageFunctionalitySteps {

    DesktopPage desktopPage = new DesktopPage();
    HomePage homePage = new HomePage();

    @When("^I mouse hover “Desktops” Tab and click$")
    public void iMouseHoverDesktopsTabAndClick() {
        homePage.selectMenu("Desktops");
    }

    @And("^I click on “Show All Desktops” submenu$")
    public void iClickOnShowAllDesktopsSubmenu() {
        homePage.selectMenu("Show All Desktops");
    }

    @And("^I Mouse hover on “Laptops & Notebooks”$")
    public void iMouseHoverOnLaptopsNotebooks() {
        homePage.mousehooverOverLaptopsAndNotebooksMenu();
    }

    @And("^I click on “Show All Laptops & Notebooks” submenu$")
    public void iClickOnShowAllLaptopsNotebooksSubmenu() {
        homePage.selectMenu("Show All Laptops & Notebooks");
    }

    @And("^I click on “Components” submenu$")
    public void iClickOnComponentsSubmenu() {
        homePage.selectMenu("Components");

    }

    @And("^I click on “Show All Components” submenu$")
    public void iClickOnShowAllComponentsSubmenu() {
        homePage.selectMenu("Show All Components");
    }


    @Then("^I able to see on respective page$")
    public void iAbleToSeeOnRespectivePage() {
    }
}
