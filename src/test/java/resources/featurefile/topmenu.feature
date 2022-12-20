@TopMenu Test
Feature: TopMenu Test
  As user I want to login into nop commerce website
  @smoke @regression
  Scenario: userShouldNavigateToComputerPageSuccessfully
    Given I am on homepage for topmenu
    When I click on computer for tompemu
    Then I navigate to computer page using topmenu

    @sanity @regression
  Scenario: userShouldNavigateToElectronicsPageSuccessfully
    Given I am on homepage for topmenu
    When I click on electronic page from top menu
    Then I navigate to electronic page using top menu
  @regression
  Scenario: userShouldNavigateToApparelPageSuccessfully
    Given I am on homepage for topmenu
    When I click on  Apparel page from top menu
    Then I navigate to Apparel page using top  menu

  @regression
  Scenario: userShouldNavigateToDigitalDownloadsPageSuccessfully
    Given I am on homepage for topmenu
    When I click on Digital Download page from top menu
    Then I navigate to Digital Download page using top menu
  @regression
  Scenario: userShouldNavigateToBooksPageSuccessfully
    Given I am on homepage for topmenu
    When I click on Books Page from top menu
    Then I navigate to Books Page using top menu
  @regression
  Scenario:userShouldNavigateToJewelryPageSuccessfully
    Given I am on homepage for topmenu
    When I click on Jewelry Page from top menu
    Then I navigate to Jewelry page using top menu
    Scenario:userShouldNavigateToGiftCardsPageSuccessfully
      Given I am on homepage for topmenu
      When I click on gift card page from top menu
      Then I navigate to gift card page using top menu

