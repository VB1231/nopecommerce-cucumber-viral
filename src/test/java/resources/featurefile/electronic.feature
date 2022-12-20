@Electronic
Feature: Electronic Test
  As user I want to login into nop commerce website
  @smoke @regression
  Scenario:verifyUserShouldNavigateToCellPhonesPageSuccessfully
    Given I am on homepage for electronic
    When I click on electronic page
     And I click on electronic cell phone
    Then I naviage to electronic cell phone
    @sanity @regression
    Scenario: verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully
      Given I am on homepage for electronic
      When I click on electronic page
      And I click on electronic cell phone
      And I naviage to electronic cell phone
      And I click on list of view
      And I click on nokia lumia
      And  I Verify nokia lumia selected
      And I verify price
      And I change quantity
      And I verify total price
      And I click on accept terms
      And I navigate to welcome page
      And I click on Register page using electronic page
      And I fill all mandatory field for electronic register
      And I verify registration completed
      And I click on continue after registration complete
      Then  I verify shopping cart after continue
      @regression
      Scenario: verify as guest check out
       Given I am on homepage for electronic
        When I click on electronic cell phone
        And I naviage to electronic cell phone
        And I click on list of view
        And I click on nokia lumia
        And  I Verify nokia lumia selected
        And I verify price
        And I change quantity
        And I verify total price
        And I click on accept terms
        And I navigate to welcome page
        And I click on check out as guest on electronic page
        And I click on check box
        And I fill all mandatory field for electronic register
       And I click on accept term after continue shopping cart
      And I add all mandatory field for shopping cart
      And I select shipment method
      And I select payment method
      And I fill all Card Detail "Visa"
      And I verify Payment method
      And I verify shipping method
      And I verify shipping total
      And I click on confirm button
      And I verify thank you message
      And I verify your order confirm
      And I click on complete confirm
      And I verify welcome to your store
      And I click on log out
      Then I check current url
