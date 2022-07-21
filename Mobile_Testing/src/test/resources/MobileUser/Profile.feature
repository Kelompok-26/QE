Feature: Profile

  Scenario: As user want to see service terms
    Given user on the home page
    When user click account menu
    And user click service terms
    Then user  on the service terms page

  Scenario: As user want to logout my account
    Given user on the home page
    When user click account menu
    And user click button logout
    Then user  on the login page

  Scenario: As user want to see privacy police
    Given user on the home page
    When user click account menu
    And user click privacy police
    Then user  on the privacy police page