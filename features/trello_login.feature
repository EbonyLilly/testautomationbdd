Feature: Trello login functionality

  Scenario: User can login to Trello with vaild credentials
    Given User goes to the Trello home page
    And User clicks on login link
    When User is on login page
    And User logins with valid credentials
    Then User should be able to see Trello boards page
