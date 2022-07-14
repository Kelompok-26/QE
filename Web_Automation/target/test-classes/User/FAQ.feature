@FAQ
Feature: FAQ

  @TCFAQ1
  Scenario: As user want to see details FAQ
    Given user on the home page1
    When user click FAQ menu
    And user click one of the FAQ
    Then user on the detail FAQ page