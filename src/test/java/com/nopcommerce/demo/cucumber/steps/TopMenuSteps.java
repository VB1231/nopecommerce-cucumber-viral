package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class TopMenuSteps {
    @Given("^I am on homepage for topmenu$")
    public void iAmOnHomepageForTopmenu() {

    }

    @When("^I click on computer for tompemu$")
    public void iClickOnComputerForTompemu() {
        new TopMenuPage().topMenu("Computers");
       //  new ComputerPage().clickOnComputer();
    }

    @Then("^I navigate to computer page using topmenu$")
    public void iNavigateToComputerPageUsingTopmenu() {
        Assert.assertEquals("verified", new ComputerPage().getStringComputer(), "Computers");
    }

    @When("^I click on electronic page from top menu$")
    public void iClickOnElectronicPageFromTopMenu() {
        new TopMenuPage().topMenu("Electronics");
        //  new ElectronicPage().clickOnElectronic();
    }

    @Then("^I navigate to electronic page using top menu$")
    public void iNavigateToElectronicPageUsingTopMenu() {
        Assert.assertEquals("not verified", new ElectronicPage().getStringElectronic(), "Electronics");


    }

    @When("^I click on  Apparel page from top menu$")
    public void iClickOnApparelPageFromTopMenu() {
        new TopMenuPage().topMenu("Apparel");
    }

    @Then("^I navigate to Apparel page using top  menu$")
    public void iNavigateToApparelPageUsingTopMenu() {
        Assert.assertEquals("Not verify", new ApparelPage().getStringApparelPage(), "Apparel");


    }

    @When("^I click on Digital Download page from top menu$")
    public void iClickOnDigitalDownloadPageFromTopMenu() {
        new TopMenuPage().topMenu("Digital downloads");
    }

    @Then("^I navigate to Digital Download page using top menu$")
    public void iNavigateToDigitalDownloadPageUsingTopMenu() {
        Assert.assertEquals("Not verify", new DigitalDownLoadPage().getStringDigitalDownloadPage(), "Digital downloads");
    }

    @When("^I click on Books Page from top menu$")
    public void iClickOnBooksPageFromTopMenu() {
        new TopMenuPage().topMenu("Books");
    }

    @Then("^I navigate to Books Page using top menu$")
    public void iNavigateToBooksPageUsingTopMenu() {
        Assert.assertEquals("not Verified",new BooksPage().getStringBooksPage(),"Books");
    }

    @When("^I click on Jewelry Page from top menu$")
    public void iClickOnJewelryPageFromTopMenu() {
        new TopMenuPage().topMenu("Jewelry");
    }

    @Then("^I navigate to Jewelry page using top menu$")
    public void iNavigateToJewelryPageUsingTopMenu() {
       Assert.assertEquals("not verified",new JewelryPage().getStringJeweleryPage(),"Jewelry");
    }

    @When("^I click on gift card page from top menu$")
    public void iClickOnGiftCardPageFromTopMenu() {
        new TopMenuPage().topMenu("Gift Cards");
    }

    @Then("^I navigate to gift card page using top menu$")
    public void iNavigateToGiftCardPageUsingTopMenu() {
        Assert.assertEquals("Not verify",new GiftCardPage().getStringGiftCardPage(),"Gift Cards");
    }
}
