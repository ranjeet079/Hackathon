Feature: Validate the used cars details

  @RegressionTests @SmokeTests 
  Scenario: Validate the used cars details
    Given I am on the homepage
    When Zigwheels logo is visible or not
    Then used cars option is visible or not
    When I hover over and select used cars
    Then Chennai option is visible or not
    And I select Chennai used cars
    Then The popular models should be displayed
