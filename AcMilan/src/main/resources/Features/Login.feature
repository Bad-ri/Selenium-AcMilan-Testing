Feature: login functionality
  Background:
    #supported browsers are [edge,chrome]
    Given open browser"edge"
    When open Website
  Scenario Outline: valid browse news
    Given open login page
    And Enter the Username "<username>" and Password "<password>"
    And click login button
    And verify login
    Then close browser
    Examples:
      | username | password |
      | mohamed  | badri    |
