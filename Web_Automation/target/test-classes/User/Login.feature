@TCL
Feature: Login

  @TCLP1
  Scenario: As user want to login with valid email and password
    Given user on login page
    When user input valid email
    And user input valid password
    And user click login button
    Then user succes login

  @TCLP2
  Scenario:  As user want to login with valid phone number and password
    Given user on login page
    When user input valid phone number
    And user input valid password
    And user click login button
    Then user succes login

  @TCLN3
  Scenario: As user want to login with unregistered email
    Given user on the login page
    When User input invalid email
    And User input password
    And user click login button
    Then User can't login

  @TCLN4
  Scenario: As user want to login with invalid data
    Given user on the login page
    When User input invalid email
    And User input invalid password
    And user click login button
    Then User can't login
