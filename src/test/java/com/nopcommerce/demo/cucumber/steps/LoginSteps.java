package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginSteps {  @Given("^I am on homepage for login$")
public void iAmOnHomepageForLogin() {
}

    @When("^I click on login link from homepage$")
    public void iClickOnLoginLinkFromHomepage() {
    new HomePage().clickOnLoginLink();
    }
    @Then("^I should see welcome sign in$")
    public void iShouldSeeWelcomeSignIn() {
        String expectedText = "Welcome, Please Sign In!";
        String actualText = new LoginPage().getWelcomeText();
        Assert.assertEquals(new LoginPage().getWelcomeText(),"Welcome, Please Sign In!","error login page not displayed");
    }
    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) {
    new LoginPage().enterEmailId(email);
    }
    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
    new LoginPage().enterPassword(password);
    }
    @Then("^click on login button$")
    public void clickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I get error message$")
    public void iGetErrorMessage() {
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"+
                "No customer account found";
        Assert.assertEquals(new LoginPage().getErrorMessage(),expectedErrorMessage,"Page verify");
    }
}
