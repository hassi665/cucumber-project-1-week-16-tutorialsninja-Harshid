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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {

    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());

    public DesktopPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Desktops')]")
    WebElement desktopsText;

    @CacheLookup
    @FindBy(xpath = "//h4/a")
    List<WebElement> productsList;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-sort']")
    WebElement sortBy;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'HP LP3065')]")
    WebElement hpLp2065;

    public String getDesktopPageText() {

        String text = getTextFromElement(desktopsText);
        log.info("Desktop page Text : " + desktopsText.toString());
        return text;
    }


    public ArrayList beforeSortingTheProducts() {
        List<WebElement> products = productsList;
        ArrayList<String> originalProductList = new ArrayList<>();
        for (WebElement list : products) {
            originalProductList.add(list.getText());
        }
        return originalProductList;
    }

    public ArrayList afterSortingTheProducts() {
        Collections.reverse(beforeSortingTheProducts());
        System.out.println(beforeSortingTheProducts());
        List<WebElement> products = productsList;
        ArrayList<String> afterSortList = new ArrayList<>();
        for (WebElement newList : products) {
            afterSortList.add(newList.getText());
        }
        return afterSortList;
    }

    public void sortByZtoA() {

        selectByVisibleTextFromDropDown(sortBy, "Name (Z - A)");
        log.info("Sort By Z to A : " + sortBy.toString());
    }

    public void sortByAtoZ() {

        selectByVisibleTextFromDropDown(sortBy, "Name (A - Z)");
        log.info("Sort By A to Z : " + sortBy.toString());
    }

    public void clickOnHpDesktop() {

        clickOnElement(hpLp2065);
        log.info("Click on Product " + hpLp2065.toString());
    }

}
