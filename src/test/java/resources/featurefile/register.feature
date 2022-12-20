#@Register
Feature: Register Test
  As user I want to login into nop commerce website
@smoke @regression
  Scenario:UserShouldNavigateToRegisterPageSuccessfully
   Given I am on homepage for register
    When I click on register link
    Then I navigate to register page
@sanity @regression
    Scenario: verifyUserShouldRegister
      Given I am on homepage for register
      When  I click on register link
      Then I fill all mandatory field
