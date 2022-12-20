package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.pages.LaptopsAndNotebooksPage;
import com.tutorialsninja.demo.utility.Utility;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class LaptopsandnotebooksPageSortingProduct extends Utility {

    LaptopsAndNotebooksPage laptopsAndNotebooksPage = new LaptopsAndNotebooksPage();
    HomePage homePage = new HomePage();
    @When("^I mouse hover “Laptops & Notebooks” Tab and click$")
    public void iMouseHoverLaptopsNotebooksTabAndClick() {
        homePage.selectMenu("Laptops & Notebooks");


    }

    @And("^I click on “Show All Laptops & Notebooks”$")
    public void iClickOnShowAllLaptopsNotebooks() {
        homePage.selectMenu("Show All Laptops & Notebooks");

    }

    @And("^I sortout product with selecting position \"([^\"]*)\"$")
    public void iSortoutProductWithSelectingPosition(String arg0) {

        laptopsAndNotebooksPage.sortByPriceHigToLow();

    }

}
