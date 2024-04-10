Feature: Validate the hover function over New bikes

  @smokeTests @regressionTests
  Scenario: Validate the hover function over New bikes
    Given I open the website Zigwheels.com
    When I select upcoming bikes
    Then Redirected to upcoming bikes page
    When Clicking on manufacturers dropdown and check for Honda
    And selecting Honda brand
    Then ViewMore button is visible or not

  @RegressionTests
  Scenario: Validate bike details display
    Given I am on the bikes page
    Then I should see the names of the bikes
    And I should see the prices of the bikes
    And I should see the expected dates of the bikes
    Then Display bike details
