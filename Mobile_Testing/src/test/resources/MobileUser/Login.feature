@Loginuser
Feature: Login

  @Positive
  Scenario: As user want to Login with valid data
    Given user on the login page
    When user input valid email
    And user input valid password
    And user click login button
    Then user succes login

  @Negative1
  Scenario: As user want to login with unregistered email
    Given user on the login page
    When User input unregistered email
    And user input valid password
    And user click login button
    Then User can't login

  @Negative2
  Scenario: As user want to login with wrong password
    Given user on the login page
    When user input valid email
    And user input wrong password
    And user click login button
    Then User can't login

