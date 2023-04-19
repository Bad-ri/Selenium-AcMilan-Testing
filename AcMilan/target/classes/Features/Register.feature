Feature: Test registration functionality
  Background:
    Given open browser"chrome"
    When open Website
    Scenario: invalid registration
      Given open login page
      Given open registration page
      And user enters email "black@black.com"
      And user enters first name "mohamed"
      And user enters last name "mohamed"
      And user enables the privacy check box
      And click on register button
      And verify registration
      Then close browser