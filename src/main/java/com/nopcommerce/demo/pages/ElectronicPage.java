package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicPage extends Utility {
    private static final Logger log = LogManager.getLogger(ElectronicPage.class.getName());

    public ElectronicPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(linkText = "Electronics")
    WebElement electronicPage;
    @CacheLookup
    @FindBy(linkText = "Cell phones")
    WebElement cellphonePage;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Cell phones')]")
    WebElement verifyTextCellPhone;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement clickOnList;
    @CacheLookup
    @FindBy(xpath = "//div/h2/a[contains(text(),'Nokia Lumia 1020')]")
    WebElement clickOnNokiaLumia;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Nokia Lumia 1020')]")
    WebElement verifyTextNokiaLumia;

    @CacheLookup
    @FindBy(id = "price-value-20")
    WebElement verifyPrice;
    @CacheLookup
    @FindBy(id = "product_enteredQuantity_20")
    WebElement qty;

    @CacheLookup
    @FindBy(id = "add-to-cart-button-20")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//span[@class='close']")
    WebElement closeMessageBar;

    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary']/strong")
    WebElement priceVerifyText;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement mouseHoverToShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement clickGoCart;
    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement acceptTerms;

    @CacheLookup
    @FindBy(id = "checkout")
    WebElement Checkout;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement verifyWelcomeSignIn;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement clickOnRegister;
    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement verifyRegisterComplete;


    @CacheLookup
    @FindBy(xpath = "//div[@class='buttons']/a")
    WebElement clickOnCompleteAfterRegister;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement verifyShoppingCartAfterContinue;
    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement termsConditionAccept;
    @CacheLookup
    @FindBy(id = "checkout")
    WebElement clickOnCheckOut;

    @CacheLookup
    @FindBy(id = "shippingoption_2")
    WebElement selectRadioAirShip;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement clickContinue1;
    @CacheLookup
    @FindBy(id = "paymentmethod_1")
    WebElement selectPaymentMethod;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement paymentClick;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement clickLogout;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='2nd Day Air']")
    WebElement verifyShippingMethod;

    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary' and contains(text(),'$698.00')]")
    WebElement verifyShippingTotal;
    @CacheLookup
    @FindBy(xpath = "//div/div[3]/button[contains(text(),'Checkout as Guest')]")
    WebElement clickASGuest;
    @CacheLookup
    @FindBy(xpath = "//div[@class='section ship-to-same-address']/p/input")
    WebElement clickCheckbox;

public void clickOnCheckBox(){
    clickOnElement(clickCheckbox);
}
    public void setClickASGuest() {
        clickOnElement(clickASGuest);
    }


    public String getStringElectronic() {
        log.info("get text from electronic page" + electronicPage.toString());
        return getTextFromElement(electronicPage);
    }

    public void clickOnElectronic() {
        log.info("click on electronic page" + electronicPage.toString());
        clickOnElement(electronicPage);
    }

    public void electronicToCellPhone() {
        log.info("mouse hover to electronic page" + electronicPage.toString());
        mouseHoverToElement(electronicPage);
        log.info("click on cell phone page" + cellphonePage.toString());
        clickOnElement(cellphonePage);
    }

    public String verifyTextCellPhone() {
        log.info("get text from cell phone" + verifyTextCellPhone.toString());
        return getTextFromElement(verifyTextCellPhone);
    }

    public void clickOnList() {
        log.info("click on list " + clickOnList.toString());
        clickOnElement(clickOnList);
    }

    public void clickOnNokiaLumia() {
        log.info("click o nokia lumia" + clickOnNokiaLumia.toString());
       clickOnElement(clickOnNokiaLumia);
    }

    public String verifyTextNokiaLumia() {
        log.info("verify text nokia lumia" + verifyTextNokiaLumia.toString());
        return getTextFromElement(verifyTextNokiaLumia);
    }

    public String verifyPrice() {
        log.info("get text from electronic page" + electronicPage.toString());
        return getTextFromElement(verifyPrice);
    }

    public void changeQty(String q) {
        qty.clear();
        log.info("update qty" + qty.toString());
        sendTextToElement(qty, q);
        log.info("click on add to cart" + addToCart.toString());
        clickOnElement(addToCart);
        log.info("click on close message bar" + closeMessageBar.toString());
        clickOnElement(closeMessageBar);

    }

    public String verifyTotalChangePrice() {
        mouseHoverToElement(mouseHoverToShoppingCart);
        log.info("click on go cart" + clickGoCart.toString());
        clickOnElement(clickGoCart);
        log.info("verify price" + priceVerifyText.toString());
        return getTextFromElement(priceVerifyText);
    }

    public void acceptTermsAndClick() {
        log.info("accept terms and condition" + acceptTerms.toString());
        clickOnElement(acceptTerms);
        log.info("click on Checkout" + Checkout.toString());
        clickOnElement(Checkout);
    }

    public String verifyWelcomeSignIn() {
        log.info("verify welcome sign in message" + verifyWelcomeSignIn.toString());
        return getTextFromElement(verifyWelcomeSignIn);
    }

    public void clickOnRegister() {
        log.info("click on register link" + clickOnRegister.toString());
        clickOnElement(clickOnRegister);
    }

    public String verifyRegisterComplete() {
        log.info("verify register complete" + verifyRegisterComplete.toString());
        return getTextFromElement(verifyRegisterComplete);
    }

    public void clickOnContinueAfterRegisterComplete() {
        log.info("click on continue after register complete" + clickOnCompleteAfterRegister.toString());
        clickOnElement(clickOnCompleteAfterRegister);
    }

    public String verifyShoppingCartAfterContinue() {
        log.info("verify shopping cart" + verifyShoppingCartAfterContinue.toString());
        return getTextFromElement(verifyShoppingCartAfterContinue);
    }

    public void clickOnTermsAccept() {
        log.info("click on terms and condition" + termsConditionAccept.toString());
        clickOnElement(termsConditionAccept);
        log.info("click on check out" + clickOnCheckOut.toString());
        clickOnElement(clickOnCheckOut);
    }

    public void selectShipmentType() {
        log.info("select radio airship" + selectRadioAirShip.toString());
        clickOnElement(selectRadioAirShip);
       log.info("click on conitinue button" + clickContinue1.toString());
        clickOnElement(clickContinue1);
    }

    public void selectPaymentMethod() {
        log.info("select radio airship" + selectRadioAirShip.toString());
        clickOnElement(selectPaymentMethod);
        log.info("select radio airship" + selectRadioAirShip.toString());
        clickOnElement(paymentClick);
    }

    public void clickOnLogOut() {
        log.info("click on log out" + clickLogout.toString());
        clickOnElement(clickLogout);
    }

    public String verifyShippingMethod() {
        log.info("verify shipping method" + verifyShippingMethod.toString());
        return getTextFromElement(verifyShippingMethod);
    }

    public String VerifyShippingTotal() {
        log.info("verify shipping total" + verifyShippingTotal.toString());
        return getTextFromElement(verifyShippingTotal);
    }
}
