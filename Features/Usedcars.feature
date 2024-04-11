Feature: Validate the used cars details

  @RegressionTests @SmokeTests
  Scenario: Validate the used cars details
    Given I am on the homepage
    When I check if the Zigwheels logo is visible
    Then I verify that the used cars option is visible
    When I hover over the used cars option and select it
    Then I verify that the Chennai option is visible
    When I select Chennai used cars
    Then I verify that the popular models are displayed
