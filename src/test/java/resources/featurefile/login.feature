@Login
Feature: Login Test
  As user I want to login into nop commerce website

  @smoke @regression
  Scenario: User should navigate to login page successfully
    Given I am on homepage for login
    When I click on login link from homepage
    Then I should see welcome sign in

#  @sanity @regression
  Scenario: User should login successfully with valid credentials
    Given I am on homepage for login
    When I click on login link from homepage
    And I enter email "Viral@gmail.com"
    And I enter password "Welcome"
   Then  click on login button


 @regression
  Scenario:verifyErrorMessageWithInvalidCredential
  Given I am on homepage for login
  When I click on login link from homepage
  And  I enter email "abc@gmail.com"
  And I enter password "Welcome1"
  And  I click on login link from homepage
  Then I get error message

