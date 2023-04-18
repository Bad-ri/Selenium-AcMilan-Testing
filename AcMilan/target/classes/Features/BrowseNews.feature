Feature: open news section and browse for the news
  Background:
    #supported browsers are [edge,chrome]
    Given open browser"chrome"
    When open Website
  Scenario: valid browse news
    Given open news menu
    And  browse page
    And verify page
    Then close browser
