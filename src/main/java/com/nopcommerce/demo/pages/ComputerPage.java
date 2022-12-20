package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import dev.failsafe.internal.util.Assert;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    public ComputerPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(linkText = "Computers")
    WebElement computerPage;
    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopPage;
    @CacheLookup
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement selectPosition;
    @CacheLookup
    @FindBy(linkText = "Build your own computer")
    WebElement verifyTextBuild;
    @CacheLookup
    @FindBy(id="product_attribute_1")
    WebElement selectDualCore;
    @CacheLookup
    @FindBy(xpath = "(//button[@type='button'][normalize-space()='Add to cart'])[1]")
    WebElement clickAddToCart;
    @CacheLookup
    @FindBy(id="product_attribute_1")
    WebElement selectGB;
    @CacheLookup
    @FindBy(id="product_attribute_2")
    WebElement selectRAM;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement selectRadioGB;
    @CacheLookup
    @FindBy(id="product_attribute_4_9")
    WebElement selectOS;
    @CacheLookup
    @FindBy(id="product_attribute_5_12")
    WebElement selectTotalCommander;
    @CacheLookup
    @FindBy(id="add-to-cart-button-1")
    WebElement  totalPrice;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='$1,475.00']")
    WebElement verifyTotal;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement verifyAddToCartMessage;
    @CacheLookup
    @FindBy(xpath = "//span[@class='close']")
    WebElement closeVerifyMessage;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement mouseHoverShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement clickGoCart ;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement verifyShoppingCart ;
    @CacheLookup
    @FindBy(xpath = "//input[@value='1']")
    WebElement updateQty ;
    @CacheLookup
    @FindBy(id="updatecart")
    WebElement  clickUpdate;
    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary']/strong")
    WebElement verifyUpdateTotal ;
    @CacheLookup
    @FindBy(id="termsofservice")
    WebElement acceptTerm;
    @CacheLookup
    @FindBy(id="checkout")
    WebElement clickCheckOut;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement verifyWelcomeMessage ;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Checkout as Guest')]")
    WebElement checkOutGuest ;
    @CacheLookup
    @FindBy(id="BillingNewAddress_FirstName")
    WebElement mandatoryName;
    @CacheLookup
    @FindBy(id="BillingNewAddress_LastName")
    WebElement mandatoryLastName;
    @CacheLookup
    @FindBy(id="BillingNewAddress_Email")
    WebElement mandatoryEmail;
    @CacheLookup
    @FindBy(id="BillingNewAddress_CountryId")
    WebElement mandatoryCountry;
    @CacheLookup
    @FindBy(id="BillingNewAddress_StateProvinceId")
    WebElement mandatoryState;
    @CacheLookup
    @FindBy(id="BillingNewAddress_City")
    WebElement mandatoryCity;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
    WebElement mandatoryAddress ;
    @CacheLookup
    @FindBy(id="BillingNewAddress_ZipPostalCode")
    WebElement mandatoryPostalCode;
    @CacheLookup
    @FindBy(id="BillingNewAddress_PhoneNumber")
    WebElement mandatoryPhone;
    @CacheLookup
    @FindBy(name="BillingNewAddress_PhoneNumber")
    WebElement clickContinue;
    @CacheLookup
    @FindBy(id="shippingoption_1")
    WebElement selectShippingMethod;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement clickOnContinueShip ;
    @CacheLookup
    @FindBy(id="paymentmethod_1")
    WebElement clickPaymentMethod;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement clickContinue1 ;
    @CacheLookup
    @FindBy(id="CreditCardType")
    WebElement masterCard;
    @CacheLookup
    @FindBy(id="CardholderName")
    WebElement cardName;
    @CacheLookup
    @FindBy(id="CardNumber")
    WebElement cardNumber;
    @CacheLookup
    @FindBy(id="ExpireMonth")
    WebElement cardExMonth;
    @CacheLookup
    @FindBy(id="ExpireYear")
    WebElement cardExYear;
    @CacheLookup
    @FindBy(id="CardCode")
    WebElement cardCode;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement cardContinue ;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Credit Card')]")
    WebElement verifyPaymentMethod ;
    @CacheLookup
    @FindBy(xpath = "//span[@class='value' and contains(text(),'Next Day Air')]")
    WebElement verifyShippingMethod ;
    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary' and contains(text(),'$2,950.00')]")
    WebElement verifyShippingTotal ;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement confirm ;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement verifyThankYo ;
    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement verifyYourOrder ;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement orderConfirm ;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement verifyWelcomeToStore ;
    public String getStringComputer() {
       log.info("Get text from computer page"+computerPage.toString());
          return getTextFromElement(computerPage);
    }

    public void clickOnComputer() {
       log.info("click on computer page"+computerPage.toString());
      clickOnElement(computerPage);
    }

    public void clickOnDesktop() {
       log.info("click on desktop page"+desktopPage.toString());
        clickOnElement(desktopPage);
    }

    public void selectPositionZtoA() {
        log.info("click on select position"+selectPosition.toString());
       clickOnElement(selectPosition);
        log.info("select from drop down"+selectPosition.toString());
          selectByVisibleTextFromDropDown(selectPosition, "Name: Z to A");
    }

    public void verifyPositionZTOA() {
        List<WebElement> manageBookingList = driver.findElements(By.xpath("//span[contains(text(),'Sort by')]"));
        List<String> beforeSorted = new ArrayList<String>();
        for (WebElement p : manageBookingList) {
            beforeSorted.add(p.getText());
        }
        selectByVisibleTextFromDropDown(selectPosition, "Name: Z to A");
        List<WebElement> manageBookingList1 = driver.findElements(By.xpath("//span[contains(text(),'Sort by')]"));
        List<String> afterSorted = new ArrayList<String>();
        for (WebElement q : manageBookingList) {
            afterSorted.add(q.getText());
        }
        Collections.sort(beforeSorted);
        Assert.isTrue(true, String.valueOf(beforeSorted), afterSorted);
    }

    public String verifyTextBuildComputer() throws StaleElementReferenceException {
       log.info("click on add to cart"+clickAddToCart.toString());
         clickOnElement(clickAddToCart);
        return getTextFromElement(verifyTextBuild);

    }

    public void addToCart() throws StaleElementReferenceException {
        log.info("click on add to cart"+clickAddToCart.toString());
        clickOnElement(clickAddToCart);
    }

    public void selectGB() {
        log.info("click on select gb"+selectGB.toString());
        clickOnElement(selectGB);
        selectByIndexFromDropDown(selectGB, 1);
    }

    public void selectDualCore() {
      log.info("select dual core"+selectDualCore.toString());
        selectByIndexFromDropDown(selectDualCore, 1);
    }

    public void selectRAM() {
       log.info("select RAM"+selectRAM.toString());
        clickOnElement(selectRAM);
        selectByIndexFromDropDown(selectRAM, 3);
    }

    public void selectRadioGb() {
       log.info("select radio gb button"+selectRadioGB.toString());
         clickOnElement(selectRadioGB);
    }

    public void selectOS() {
       log.info("select OS"+selectOS.toString());
          clickOnElement(selectOS);
    }

    public void setSelectTotalCommander() {
       log.info("select total commander"+selectTotalCommander.toString());
         clickOnElement(selectTotalCommander);
    }

    public String verifyTotal() {
        log.info("verify total amount"+verifyTotal.toString());
        return getTextFromElement(verifyTotal);
    }

    public void addToCartT() {
       log.info("click on total price"+totalPrice.toString());
          clickOnElement(totalPrice);
    }

    public String verifyAddToCartMessage() {
       log.info("verify add to cart message"+verifyAddToCartMessage.toString());
        return getTextFromElement(verifyAddToCartMessage);
    }

    public void closeVerifyMessage() {
        log.info("close on verify message"+closeVerifyMessage.toString());
        clickOnElement(closeVerifyMessage);
    }

    public void mouseHoverShoppingCart() {
        log.info("mouse hover on shopping cart"+mouseHoverShoppingCart.toString());
          mouseHoverToElement(mouseHoverShoppingCart);
       log.info("click on go cart"+clickGoCart.toString());
         clickOnElement(clickGoCart);
    }

    public String verifyShoppingCart() {
       log.info("verify shopping cart"+verifyShoppingCart.toString());
        return getTextFromElement(verifyShoppingCart);
    }

    public void updateQty(String qty) {
        updateQty.clear();
        log.info("update qty"+updateQty.toString());
        sendTextToElement(updateQty, qty);
       log.info("click on update"+clickUpdate.toString());
         clickOnElement(clickUpdate);
    }

    public String updateTotalVerify() {
        log.info("click on update"+clickUpdate.toString());
         clickOnElement(clickUpdate);
        log.info("verify update total"+verifyUpdateTotal.toString());
       return getTextFromElement(verifyUpdateTotal);
    }

    public void clickOnCheckOut() {
        log.info("accept terms and condition"+acceptTerm.toString());
         clickOnElement(acceptTerm);
      log.info("click on Check Out"+clickCheckOut.toString());
         clickOnElement(clickCheckOut);
    }

    public void checkOutGuest() {
        log.info("check out as  guest"+checkOutGuest.toString());
        clickOnElement(checkOutGuest);
    }

    public String verifyWelcomeMessage() {
        log.info("verify welcome message"+verifyWelcomeMessage.toString());
          return getTextFromElement(verifyWelcomeMessage);
    }

    public void fillAllMandatoryField() {
        mandatoryName.clear();
        log.info("Mandatory name "+mandatoryName.toString());
         sendTextToElement(mandatoryName, "viral");
        log.info("Mandatory  LAst name "+mandatoryLastName.toString());
           sendTextToElement(mandatoryLastName, "brahmbhatt");
        mandatoryEmail.clear();
       log.info("Mandatory Email "+mandatoryEmail.toString());
          sendTextToElement(mandatoryEmail, randomEmail());
        log.info("Mandatory Country"+mandatoryCountry.toString());
          selectByIndexFromDropDown(mandatoryCountry, 1);
        log.info("Mandatory State "+mandatoryState.toString());
          selectByVisibleTextFromDropDown(mandatoryState, "AA (Armed Forces Americas)");
        log.info("Mandatory City "+mandatoryCity.toString());
         sendTextToElement(mandatoryCity, "London");
        log.info("Mandatory Address"+mandatoryAddress.toString());
         sendTextToElement(mandatoryAddress, "14 The Avenue");
        log.info("Mandatory Postal Code"+mandatoryPostalCode.toString());
           sendTextToElement(mandatoryPostalCode, "WD23 7AB");
        log.info("Mandatory Phone number "+mandatoryPhone.toString());
        sendTextToElement(mandatoryPhone, "01245666");
        log.info("Click on continue "+clickContinue.toString());
          clickOnElement(clickContinue);
    }

    public void clickOnShippingMethod() {
        log.info("select shipping method"+selectShippingMethod.toString());
          clickOnElement(selectShippingMethod);
        log.info("click on continue ship"+clickOnContinueShip.toString());
         clickOnElement(clickOnContinueShip);
    }

    public void clickPaymentMethod() {
        log.info("click on payment method"+clickPaymentMethod.toString());
        clickOnElement(clickPaymentMethod);
        log.info("click on continue"+clickContinue1.toString());
        clickOnElement(clickContinue1);
    }

    public void fillCardDetail(String s) {
        log.info("select mastercard"+masterCard.toString());
       selectByVisibleTextFromDropDown(masterCard, s);
        log.info("enter card holder"+cardName.toString());
         sendTextToElement(cardName, "Viral Brahm");
        log.info("enter card number"+cardNumber.toString());
          sendTextToElement(cardNumber, "1234 4564 2521 123");
        log.info("enter card exp month"+cardExMonth.toString());
        selectByIndexFromDropDown(cardExMonth, 3);
        log.info("enter card exp year"+cardExYear.toString());
        selectByIndexFromDropDown(cardExYear, 3);
        log.info("enter card code"+cardCode.toString());
           sendTextToElement(cardCode, "123");
        log.info("click on continue"+cardContinue.toString());
         clickOnElement(cardContinue);

    }

    public String VerifyShippingMethod() {
        log.info("verify shipping method"+verifyShippingMethod.toString());
         return getTextFromElement(verifyShippingMethod);
    }

    public String verifyPaymentMethod() {
        log.info("verify payment method"+verifyPaymentMethod.toString());
          return getTextFromElement(verifyPaymentMethod);
    }

    public String verifyTotalShipping() {
        log.info("verify Shipping total"+verifyShippingTotal.toString());
          return getTextFromElement(verifyShippingTotal);
    }

    public void clickOnConfirm() {
        log.info("click on confirm "+confirm.toString());
         clickOnElement(confirm);
    }

    public String verifyThankYou() {
        log.info("verify thank you message"+verifyThankYo.toString());
           return getTextFromElement(verifyThankYo);
    }

    public String VerifyYourOrderConfirm() {
        log.info("verify your order"+verifyYourOrder.toString());
          return getTextFromElement(verifyYourOrder);
    }

    public void clickCompleteConfirm() {
        log.info("click on order confirm"+orderConfirm.toString());
          clickOnElement(orderConfirm);
    }

    public String verifyWelcomeToStore() {
        log.info("verify welcome to store text"+verifyWelcomeToStore.toString());
          return getTextFromElement(verifyWelcomeToStore);
    }

}
