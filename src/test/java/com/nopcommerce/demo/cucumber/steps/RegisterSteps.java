package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class RegisterSteps { @Given("^I am on homepage for register$")
public void iAmOnHomepageForRegister() {
}

    @When("^I click on register link$")
    public void iClickOnRegisterLink() {
    new HomePage().clickOnRegisterLink();
    }

    @Then("^I navigate to register page$")
    public void iNavigateToRegisterPage() {
        Assert.assertEquals("Register", new RegisterPage().verifyText(), "Register page not displayed");
    }

    @Then("^I fill all mandatory field$")
    public void iFillAllMandatoryField() {
    new RegisterPage().fillAllMandatoryField();
    }
}
