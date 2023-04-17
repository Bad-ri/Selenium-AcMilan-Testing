Feature: open news section and browse for the news
  Background:
    #supported browsers are [edge,chrome]
    Given open browser"edge"
    When open Website
  Scenario: valid browse news
    Given : open login page
    And : enter username and password
    And : click login button
    And : verfiy login
    Then close browser
