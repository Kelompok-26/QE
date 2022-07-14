@TCP
Feature: Poin

  @TCP1
  Scenario: As a user want to exchange points for pulse
    Given user on the point page
    When user click change to pulse menu
    And user click one pulse exchange options
    And user on the details option page
    And user click button point exchange confirmation
    And user on the form exchange page
    And user input phone number
    And user choose provider
    And user click button submit
    Then User on the successful page

  @TCP2
  Scenario: As a user want to exchange points for data plan
    Given user on the point page
    When user click change to data plan menu
    And user click one data plan exchange options
    And user on the details option page
    And user click button point exchange confirmation
    And user on the form exchange page
    And user input phone number
    And user choose provider
    And user click button submit
    Then User on the successful page

  @TCP3
  Scenario: As a user want to exchange points for E-money
    Given user on the point page
    When user click change to E-money menu
    And user on the details option page
    And user click button point exchange confirmation
    And user on the form exchange page
    And user input phone number
    And user choose electronic money options
    And user click button submit
    Then User on the successful page

  @TCP4
  Scenario: As a user want to exchange points for cashout
    Given user on the point page
    When user click change to castout menu
    And user click one castout exchange options
    And user on the details castout option page
    And user click button point exchange confirmation
    And user on the form exchange page
    And user input account number
    And user choose bank options
    And user click button submit
    Then User on the successful page

  @TCP5
  Scenario: As a user want to see the benefits of exchanging points
    Given user on the point page
    When user click check point exchange benefits menu
    Then user on the details benefit page
