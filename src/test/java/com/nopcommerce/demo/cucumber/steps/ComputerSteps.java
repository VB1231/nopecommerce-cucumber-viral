package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.ComputerPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ComputerSteps {
    @Given("^I am on homepage for computer$")
    public void iAmOnHomepageForComputer() {
    }

    @When("^I click on computer$")
    public void iClickOnComputer() {
        new ComputerPage().clickOnComputer();
    }

    @Then("^I click on desktop$")
    public void iClickOnDesktop() {
        new ComputerPage().clickOnDesktop();
    }

    @And("^I select position Z to A$")
    public void iSelectPositionZToA() {
        new ComputerPage().selectPositionZtoA();
    }

    @Then("^I verify position is Z to A$")
    public void iVerifyPositionIsZToA() {
        new ComputerPage().verifyPositionZTOA();
    }
}
