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

public class ComponentsPage extends Utility {

    private static final Logger log = LogManager.getLogger(ComponentsPage.class.getName());

    public ComponentsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Components')]")
    WebElement components_Text;

    public String getTextOfComponentsPage() {

        String text = getTextFromElement(components_Text);
        log.info("Components page text :" + components_Text.toString());
        return text;
    }

}
