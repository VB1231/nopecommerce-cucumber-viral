package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.ElectronicPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.pages.TopMenuPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static com.nopcommerce.demo.browserfactory.ManageBrowser.driver;

public class ElectronicSteps {
    @Given("^I am on homepage for electronic$")
    public void iAmOnHomepageForElectronic() {
    }

    @When("^I click on electronic page$")
    public void iClickOnElectronicPage() {
        new TopMenuPage().topMenu("Electronics");
    }

    @And("^I click on electronic cell phone$")
    public void iClickOnElectronicCellPhone() {
        new ElectronicPage().electronicToCellPhone();
    }

    @Then("^I naviage to electronic cell phone$")
    public void iNaviageToElectronicCellPhone() {
        Assert.assertEquals("Not verify",new ElectronicPage().verifyTextCellPhone(),"Cell phones");
    }

    @And("^I click on list of view$")
    public void iClickOnListOfView()throws InterruptedException {
        new ElectronicPage().clickOnList();
        Thread.sleep(200);
    }

    @And("^I click on nokia lumia$")
    public void iClickOnNokiaLumia() {

        new ElectronicPage().clickOnNokiaLumia();
    }

    @And("^I Verify nokia lumia selected$")
    public void iVerifyNokiaLumiaSelected() {
        Assert.assertEquals("Not verify",new ElectronicPage().verifyTextNokiaLumia(),"Nokia Lumia 1020");
           }

    @And("^I verify price$")
    public void iVerifyPrice() {
        Assert.assertEquals("not verify",new ElectronicPage().verifyPrice(),"$349.00");
    }

    @And("^I change quantity$")
    public void iChangeQuantity() {
     new ElectronicPage().changeQty("2");
    }

    @And("^I verify total price$")
    public void iVerifyTotalPrice() {
        Assert.assertEquals("Not verify",new ElectronicPage().verifyTotalChangePrice(),"$698.00");
    }

    @And("^I click on accept terms$")
    public void iClickOnAcceptTerms() {
        new ElectronicPage().acceptTermsAndClick();
    }

    @And("^I navigate to welcome page$")
    public void iNavigateToWelcomePage() {
       Assert.assertEquals("Not verify",new ElectronicPage().verifyWelcomeSignIn(),"Welcome, Please Sign In!");
    }

    @And("^I click on Register page using electronic page$")
    public void iClickOnRegisterPageUsingElectronicPage() {
new ElectronicPage().clickOnRegister();
    }

    @And("^I fill all mandatory field for electronic register$")
    public void iFillAllMandatoryFieldForElectronicRegister() {
   new RegisterPage().fillAllMandatoryField();
    }

    @And("^I verify registration completed$")
    public void iVerifyRegistrationCompleted() {
        Assert.assertEquals("Not verify",new ElectronicPage().verifyRegisterComplete(),"Your registration completed");
    }

    @And("^I click on continue after registration complete$")
    public void iClickOnContinueAfterRegistrationComplete() {
     new ElectronicPage().clickOnContinueAfterRegisterComplete();
    }

    @And("^I verify shopping cart after continue$")
    public void iVerifyShoppingCartAfterContinue() {
       Assert.assertEquals("Not verify",new ElectronicPage().verifyShoppingCartAfterContinue(),"Shopping cart");
    }

    @And("^I click on accept term after continue shopping cart$")
    public void iClickOnAcceptTermAfterContinueShoppingCart() {
        new ElectronicPage().clickOnTermsAccept();

    }
    @And("^I click on check out as guest on electronic page$")
    public void iClickOnCheckOutAsGuestOnElectronicPage() {
        new ElectronicPage().setClickASGuest();
    }
    @And("^I click on check box$")
    public void iClickOnCheckBox() {
        new ElectronicPage().clickOnCheckBox();
    }

    @And("^I add all mandatory field for shopping cart$")
    public void iAddAllMandatoryFieldForShoppingCart() {
        new ComputerPage().fillAllMandatoryField();

    }

    @And("^I select shipment method$")
    public void iSelectShipmentMethod() {
   new ElectronicPage().selectShipmentType();

    }

    @And("^I select payment method$")
    public void iSelectPaymentMethod() {
new ElectronicPage().selectPaymentMethod();
    }

    @And("^I fill all Card Detail \"([^\"]*)\"$")
    public void iFillAllCardDetail(String cardType)  {
new ComputerPage().fillCardDetail(cardType);

    }

    @And("^I verify Payment method$")
    public void iVerifyPaymentMethod() {
     Assert.assertEquals("Not verify",new ComputerPage().verifyPaymentMethod(),"Credit Card");
    }

    @And("^I verify shipping method$")
    public void iVerifyShippingMethod() {
        Assert.assertEquals(new ElectronicPage().verifyShippingMethod(),"2nd Day Air");

    }

    @And("^I verify shipping total$")
    public void iVerifyShippingTotal() {
        Assert.assertEquals(new ElectronicPage().VerifyShippingTotal(),"$698.00");
    }

    @And("^I click on confirm button$")
    public void iClickOnConfirmButton() {
  new ComputerPage().clickOnConfirm();
    }

    @And("^I verify thank you message$")
    public void iVerifyThankYouMessage() {
       Assert.assertEquals(new ComputerPage().verifyThankYou(),"Thank you");
    }

    @And("^I verify your order confirm$")
    public void iVerifyYourOrderConfirm() {
        Assert.assertEquals(new ComputerPage().VerifyYourOrderConfirm(),"Your order has been successfully processed!");
    }

    @And("^I click on complete confirm$")
    public void iClickOnCompleteConfirm() {
new ComputerPage().clickCompleteConfirm();
    }

    @And("^I verify welcome to your store$")
    public void iVerifyWelcomeToYourStore() {
        Assert.assertEquals(new ComputerPage().verifyWelcomeToStore(),"Welcome to our store");
    }

    @And("^I click on log out$")
    public void iClickOnLogOut() {
new ElectronicPage().clickOnLogOut();
    }

    @Then("^I check current url$")
    public void iCheckCurrentUrl() {
        Assert.assertEquals("not verify",driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
    }



}
