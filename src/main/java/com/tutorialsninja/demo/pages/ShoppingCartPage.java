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

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/h1")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='table-responsive']/table/tbody/tr/td[2]/a")
    WebElement productName;

    @CacheLookup
    @FindBy(xpath = "//div[@class='table-responsive']/table/tbody/tr/td[2]/small[1]")
    WebElement deliveryDate;

    @CacheLookup
    @FindBy(xpath = "//div[@class='table-responsive']/table/tbody/tr/td[3]")
    WebElement model;

    @CacheLookup
    @FindBy(xpath = "//div[@class='table-responsive']/table/tbody/tr/td[6]")
    WebElement total;

    @CacheLookup
    @FindBy(xpath = "//input[contains(@name, 'quantity')]")
    WebElement qtyField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(@data-original-title, 'Update')]")
    WebElement qtyUpdateBtn;

    @CacheLookup
    @FindBy(xpath = "//div[@id='checkout-cart']/div[1]")
    WebElement successModifiedMessage;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Checkout')]")
    WebElement checkOutLink;

    public String getShoppingCartText() {

        String text = getTextFromElement(shoppingCartText);
        log.info("Shopping Cart Text : " + shoppingCartText.toString());
        return text;
    }

    public String getProductName() {
        String text = getTextFromElement(productName);
        log.info("Product name in Cart : " + productName.toString());
        return text;
    }

    //This method will get delivery date
    public String getDeliveryDate() {

        String text = getTextFromElement(deliveryDate);
        log.info("Delivery Date : " + deliveryDate.toString());
        return text;
    }

    public String getModelName() {

        String text = getTextFromElement(model);
        log.info("Model Name : " + model.toString());
        return text;
    }

    public String getTotalPrice() {

        String text = getTextFromElement(total);
        log.info("Total Price : " + total.toString());
        return text;
    }

    public void quantityUpdate(String quantity) {


        clearTextFromField(qtyField);
        log.info("clear old Quantity : " + qtyField.toString());

        sendTextToElement(qtyField, quantity);
        log.info("Enter new Quantity : " + qtyField.toString());

    }

    public void clickOnQtyUpdate(){
        clickOnElement(qtyUpdateBtn);
        log.info("Click on qauntity button for updte " + qtyField.toString());

    }

    public String getMessageForShoppingCartUpdated() {

        String message = getTextFromElement(successModifiedMessage);
        log.info("Shopping Cart Updated : " +successModifiedMessage.toString());
        return message;
    }

    public void clickOnCheckOutBtn() {

        clickOnElement(checkOutLink);
        log.info("Click on checkout  Button " + checkOutLink.toString());
    }
}
