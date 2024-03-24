Feature: Login functionality for SauceDemo
  Scenario: Valid login with credentials from Excel
    Given User is on the login page
    When User enters valid username and password from Excel
    And  Clicks on login button
    Then User should be logged in successfully



