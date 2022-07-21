Feature: Register

  @Negative
  Scenario: As user want to register with registered data
    Given user on the login page
    When User click daftar
    And User input registered email
    And user input registered phone number
    And User input registered username
    And user input gender
    And user input registerd account number
    And User input registered date of birth
    And User input registered password
    And user click sign up button
    Then user can't registered

  @Positive
  Scenario: As user want to register with valid data
    Given user on the login page
    When User click daftar
    And User input valid email
    And User input valid phone number
    And User input valid username
    And user input gender
    And user input valid account number
    And User input valid date of birth
    And User input valid password
    And user click sign up button
    Then user succes registered