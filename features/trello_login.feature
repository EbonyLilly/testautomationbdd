@Smoke
Feature: Trello login functionality

Background: 
 Given User goes to the Trello home page
 And User clicks on login link



  Scenario: User can login to Trello with vaild credentials
    When User is on login page
    And User logins with valid credentials
    Then User should be able to see Trello boards page

  @dev
  Scenario: User cannot login to Trello with invalid credentials
    When User is on login page
    And User logins with invalid credentials
    Then User should be able to see error message
