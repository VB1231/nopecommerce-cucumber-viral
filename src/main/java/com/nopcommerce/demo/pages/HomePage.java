package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;
    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;
    @CacheLookup
    @FindBy(id = "small-searchterms")
    WebElement searchField;
    @CacheLookup
    @FindBy(className = "header-menu")
    WebElement topMenu;

    public void clickOnLoginLink() {
        Reporter.log("click on login link"+loginLink.toString());

        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {
       log.info("click on register link"+registerLink.toString());
        clickOnElement(registerLink);
    }

    public void enterTextToSearchField(String product) {
        Reporter.log("verify search text"+product.toString());
        sendTextToElement(searchField, product);
    }
}
