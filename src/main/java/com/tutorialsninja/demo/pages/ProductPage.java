package com.tutorialsninja.demo.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

public class ProductPage extends Utility {

    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "(//div[@id = 'content']//h1")
    WebElement productText;

    @CacheLookup
    @FindBy(id = "input-option225")
    WebElement dateField;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'input-group date']//button")
    WebElement calendarButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")
    WebElement monthAndYearText;


    @CacheLookup
    @FindBy(xpath = "//div[@class = 'datepicker']/div[1]//th[@class='next']")
    WebElement nextButton;


    @CacheLookup
    @FindBy(xpath = "//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']")
    List<WebElement> dateList;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-quantity']")
    WebElement qtyField;

    @CacheLookup
    @FindBy(id = "button-cart")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement successMessage;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCartLinkInSuccessMessage;

    public String getSelectedProductName() {

        String message = getTextFromElement(productText);
        log.info(" Product Name :" + productText.toString());
        return message;
    }

    public void shoppingCartQtyUpdate(){

        clearTextFromField(qtyField);
        log.info(" Clear Qauntity field " + qtyField.toString());

        sendTextToElement(qtyField, "2");
        log.info("Enter dirrefent Qauntity " + qtyField.toString());
    }

    //This method will select date and yea

    public void dataEnterManually(){
        clearTextFromField(dateField);
        sendTextToElement(dateField,  "2022-11-30");
        log.info("Clicking on delivery date option " + dateField.toString());

    }
    public void selectDateAndYearOnCalendar(String month, String year) {

        clickOnElement(calendarButton);
        log.info("Clicking on Calender Button " + calendarButton.toString());

        while (true) {
            String monthYear = getTextFromElement(monthAndYearText);
            String arr[] = monthYear.split(" ");
            String mon = arr[0];
            String yr = arr[1];

            if (mon.equalsIgnoreCase(month) && yr.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(nextButton);
            }

        }
    }

    public void selectDateOnCalendar(String date) {

        List<WebElement> allDates = dateList;
        for (WebElement dt : allDates) {
            if (dt.getText().equalsIgnoreCase(date)) {
                clickOnElement(dt);
                break;

            }
        }
    }

//    public void pickUpDate() {
//        String year = "2022";
//        String month = "November";
//        String date = "30";
//        clickOnElement(By.xpath("//div[@class = 'input-group date']//button"));
//        while (true) {
//            String monthyear = driver.findElement(monthYearTab).getText();
//            //nov 2022
//            String[] arr = monthyear.split(" ");
//            String mon = arr[0];
//            String year1 = arr[1];
//            if (mon.equalsIgnoreCase(month) && year1.equalsIgnoreCase(year)) {
//                break;
//            } else {
//                clickOnElement(By.xpath("//body[1]/div[4]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[3]"));
//            }
//
//        }
//        clickOnElement(By.xpath("//div[@class='datepicker']/div[1]//table//td[text()='30']"));
//        List<WebElement> alldates = driver.findElements(pickDate);
//        for (WebElement date1 : alldates) {
//            if (date1.getText().equalsIgnoreCase(date)) {
//                date1.click();
//                break;
//            }
//        }
//    }


    public void enterQuantityRequired(String quantity) {

        //wipe old data(quantity)
        clearTextFromField(qtyField);
        log.info("Clear text " + qtyField.toString());

        //input again quantity
        sendTextToElement(qtyField, quantity);
        log.info("Send quantity " + quantity + " to firstname field " + qtyField.toString());
    }

    public void clickAddToCartButton() {

        clickOnElement(addToCartButton);
        log.info("Click on Add To Cart Button " + addToCartButton.toString());
    }

    public String getSuccessMessageAfterAddingInCart() {

        String message = getTextFromElement(successMessage);
        log.info("Success Message : " + successMessage.toString());
        return message;
    }

    public void clickOnShoppingCartLinkInSuccess() {

        clickOnElement(shoppingCartLinkInSuccessMessage);
        log.info("Clicking on Shopping Cart Button " + shoppingCartLinkInSuccessMessage.toString());
    }
}
