@Smoke
Feature: login functionality
  Background: open website
  Scenario Outline: valid browse news
    Given open login page
    And Enter the Username "<username>" and Password "<password>"
    And click login button
    And verify login
    Examples:
      | username | password |
      | mohamed  | badri    |
