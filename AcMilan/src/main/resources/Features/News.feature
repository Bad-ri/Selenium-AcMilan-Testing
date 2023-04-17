Feature: open news section and browse for the news
  Background:
    #supported browsers are [edge,chrome]
    Given open browser"edge"
    When open Website
  Scenario: valid open news
    Then close browser