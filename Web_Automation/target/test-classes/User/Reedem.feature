@TCRD
Feature: Reedem

  @TCRD1
  Scenario: As user want to reedem cashout
    Given user on the reedem page
    When user input name
    And user choose the type of cash-out
    And user input nominal cash-out
    And user click button submit reedem
    Then user on the process page

  @TCRD2
  Scenario: As user want to reedem E-money
    Given user on the reedem page
    When user input name
    And user choose the type of E-money
    And user input nominal E-money
    And user click button submit reedem
    Then user on the process page

  @TCRD3
  Scenario: As a user want to redeem an anonymous cashout
    Given user on the reedem page
    When user choose the type of cashout
    And user input nominal cashout
    And user click button submit reedem
    Then user on the process page

  @TCRD4
  Scenario: As a user want to redeem the cast-out without selecting the redemption type
    Given user on the reedem page
    When user input nominal cashout
    And user click button submit reedem
    Then user on the process page




