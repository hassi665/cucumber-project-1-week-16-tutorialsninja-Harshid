package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.DesktopPage;
import com.tutorialsninja.demo.utility.Utility;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class DesktopPageSortingProduct extends Utility {

    DesktopPage desktopPage = new DesktopPage();

    @And("^I sorting product with selecting position \"([^\"]*)\"$")
    public void iSortingProductWithSelectingPosition(String arg0)  {

        desktopPage.sortByZtoA();
    }


    @Then("^I can see all the product sort it out as per the requirement$")
    public void iCanSeeAllTheProductSortItOutAsPerTheRequirement() {

    }
}
