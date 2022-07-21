Feature: History

  @TCH1
  Scenario: As user want to see point usage history details
    Given user  on the home page
    When user click history menu
    And user click one point redemption history
    Then user  on the detail point usage page

  @THC2
  Scenario:As user want to see point usage history  but not doing the exchange
    Given user on the home page
    When user click history menu
    And user click menu transaction
    Then User on the  transaction page

  @THC3
  Scenario: As user want to see  point usage history
    Given user on the home page
    When user click history menu
    Then user  on the  point usage page
