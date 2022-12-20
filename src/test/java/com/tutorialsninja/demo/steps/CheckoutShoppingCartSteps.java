package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.*;
import com.tutorialsninja.demo.utility.Utility;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckoutShoppingCartSteps extends Utility {

    HomePage homePage = new HomePage();
    CheckoutPage checkoutPage = new CheckoutPage();
    ProductPage productPage = new ProductPage();
    DesktopPage desktopPage = new DesktopPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    LaptopsAndNotebooksPage laptopsAndNotebooksPage = new LaptopsAndNotebooksPage();



    @And("^I sort by position \"Name: A to Z$")
    public void iSortByPositionNameAToZ() {
        desktopPage.sortByAtoZ();

    }


    @And("^I select product “HP LP(\\d+)”$")
    public void iSelectProductHPLP(int arg0) {
        desktopPage.clickOnHpDesktop();

    }

    @And("^I select Delivery Date \"([^\"]*)\"$")
    public void iSelectDeliveryDate(String arg0) throws InterruptedException {

        Thread.sleep(500);
        productPage.dataEnterManually();
    }

    @And("^I select Qty (\\d+)$")
    public void iSelectQty(int arg0) throws InterruptedException {

        productPage.enterQuantityRequired("1");
    }

    @And("^I click on Add cart button$")
    public void iClickOnAddCartButton() throws InterruptedException {

        Thread.sleep(500);
        productPage.clickAddToCartButton();
    }

    @And("^I click on link “shopping cart” display into success message$")
    public void iClickOnLinkShoppingCartDisplayIntoSuccessMessage() {

        productPage.clickOnShoppingCartLinkInSuccess();
    }



    @And("^I change the currency to \"([^\"]*)\" from \"([^\"]*)\"$")
    public void iChangeTheCurrencyToFrom(String arg0, String arg1) {

        homePage.chooseYourCurrency();
    }

    @Then("^I redirected to shopping cart page$")
    public void iRedirectedToShoppingCartPage() {
    }



    @When("^I mouse hover on “Laptops & Notebooks”$")
    public void iMouseHoverOnLaptopsNotebooks() {
        homePage.mousehooverOverLaptopsAndNotebooksMenu();

    }

    @And("^I click on “Show All Laptops & Notebooks\"$")
    public void iClickOnShowAllLaptopsNotebooks()  {
        homePage.selectMenu("Show All Laptops & Notebooks");

    }

    @And("^I sort by \"([^\"]*)\"$")
    public void iSortBy(String arg0) {
        laptopsAndNotebooksPage.sortByPriceHigToLow();

    }


    @And("^I select product “MacBook”$")
    public void iSelectProductMacBook() {
        laptopsAndNotebooksPage.selectAnyProductFromList("MacBook");
    }

    @And("^I click on 'Add To cart' button$")
    public void iClickOnAddToCartButton() {

        productPage.clickAddToCartButton();
    }

    @And("^I click on “shopping cart” display into success message$")
    public void iClickOnShoppingCartDisplayIntoSuccessMessage() {
        productPage.clickOnShoppingCartLinkInSuccess();
    }

    @And("^I Change Quantity From \"([^\"]*)\" to \"([^\"]*)\"$")
    public void iChangeQuantityFromTo(String arg0, String arg1) {

        shoppingCartPage.quantityUpdate("2");

    }

    @And("^I Click on update$")
    public void iClickOnUpdate() {

       shoppingCartPage.clickOnQtyUpdate();
    }

    @And("^I Click on checkout button$")
    public void iClickOnCheckoutButton() {
        shoppingCartPage.clickOnCheckOutBtn();
    }

    @And("^I Click on “Guest Checkout” radio button$")
    public void iClickOnGuestCheckoutRadioButton() throws InterruptedException {
        Thread.sleep(2000);
        checkoutPage.clickOnGuestChckout();

    }

    @And("^I Click on “continue” tab$")
    public void iClickOnContinueTab() throws InterruptedException {
        checkoutPage.clickOnContinue();
        Thread.sleep(1000);
    }

    @And("^I filled the required information$")
    public void iFilledTheRequiredInformation() throws InterruptedException {
        checkoutPage.registerToApplicationAsGuest("Harshid", "Patel", "harshid12345@gmail.com", "07896549514", "1 street London road", "London", "En12rj", "United Kingdom", "Bristol");
        Thread.sleep(1000);
    }

    @And("^I Click on “continue” button in reg form$")
    public void iClickOnContinueButtonInRegForm() throws InterruptedException {
        checkoutPage.clickOnContinueGuestBttn();
        Thread.sleep(1000);

    }

    @And("^I Add Comments About your order into text area$")
    public void iAddCommentsAboutYourOrderIntoTextArea() throws InterruptedException {

        checkoutPage.clickOnMessageSection();
        Thread.sleep(2000);
        checkoutPage.sendTextToCommentField("very good service");
        Thread.sleep(800);
    }

    @And("^I Check the Terms & Conditions check box$")
    public void iCheckTheTermsConditionsCheckBox() throws InterruptedException {
        checkoutPage.clickOnTerms();
        Thread.sleep(1000);
    }

    @And("^I Click on “Continue” button after comment$")
    public void iClickOnContinueButtonAfterComment() throws InterruptedException {
        checkoutPage.clickOnContinueToCommentSection();
        Thread.sleep(1000);
    }

    @Then("^I will get some error message$")
    public void iWillGetSomeErrorMessage() {
        checkoutPage.getPaymentError();
    }





}
