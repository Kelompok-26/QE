@TCH
Feature: Transaction history

  @TCH1
  Scenario: As user want to see transaction history
    Given user on the home page
    When user click history menu
    And user click button transaction
    Then user  on the transaction page

  @TCH2
  Scenario: As user want to see reedem point history
    Given user on the home page
    When user click history menu
    And user click menu point
    Then User on the points history page

