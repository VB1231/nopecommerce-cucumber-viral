@Computer
Feature: Computer Test
  As user I want to login into nop commerce website
  @smoke @regression
  Scenario:  verifyProductArrangeInAlphaBaticalOrder
    Given I am on homepage for computer
    When I click on computer
    Then I click on desktop
     And I select position Z to A
    Then  I verify position is Z to A
