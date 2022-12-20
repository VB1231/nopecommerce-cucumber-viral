package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerPage;
    @CacheLookup
    @FindBy(id="gender-male")
    WebElement genderMale;
    @CacheLookup
    @FindBy(id="FirstName")
    WebElement firstName;
    @CacheLookup
    @FindBy(id="LastName")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement birthDay;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement birthMonth;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement birthYear;
    @CacheLookup
    @FindBy(id="Email")
    WebElement emailField;
    @CacheLookup
    @FindBy(id="Company")
    WebElement companyField;
    @CacheLookup
    @FindBy(id="Password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(id="ConfirmPassword")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(id="register-button")
    WebElement clickRegister;
    public void clickOnRegisterPage() {
       log.info("Click on register page"+registerPage.toString());
        clickOnElement(registerPage);
    }
    public String verifyText(){
        return getTextFromElement(registerPage);
    }

    public void fillAllMandatoryField() {
        log.info("Click on gender"+genderMale.toString());
        clickOnElement(genderMale);
        log.info("enter first name"+firstName.toString());
        sendTextToElement(firstName, "viral");
        log.info("enter last Name"+lastName.toString());
        sendTextToElement(lastName, "Brahm");
        log.info("select birth day"+birthDay.toString());
        selectByIndexFromDropDown(birthDay, 3);
        log.info("select birth month"+birthMonth.toString());
        selectByIndexFromDropDown(birthMonth, 3);
        log.info("select birth Year"+birthYear.toString());
        selectByIndexFromDropDown(birthYear, 6);
        log.info("enter email id"+emailField.toString());
        sendTextToElement(emailField, randomEmail());
        log.info("enter company name"+companyField.toString());
        sendTextToElement(companyField, "Prime Testing");
        log.info("enter password"+passwordField.toString());
        sendTextToElement(passwordField, "Welcome123");
        log.info("enter confirm password"+confirmPassword.toString());
        sendTextToElement(confirmPassword, "Welcome123");
       log.info("click on register link"+clickRegister.toString());
        clickOnElement(clickRegister);
    }
}
