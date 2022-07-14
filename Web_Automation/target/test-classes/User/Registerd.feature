@TCR
Feature: Register

  @TCRP1
  Scenario: As user want to register with valid data
    Given user on the register page
    When User input valid email
    And User input username
    And User input valid phone number
    And user input valid account number
    And User input date of birth
    And User input password
    And user click sign up button
    Then user succes register

  @TCRN2
  Scenario: As user want to registered with valid data registered
    Given user on the register page
    When  User input registerd email
    And User input registered username
    And User input registered phone number
    And user input registered account number
    And User input registered date of birth
    And User input registered password
    And user click sign up button
    Then user notsuccesful register