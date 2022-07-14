@TCAC
Feature: Account

  @TCAC1
  Scenario: As user want to see my account
    Given user on the home page3
    When user click account menu
    Then user on the profile page

  @TCAC2
  Scenario: As user want to see service terms
    Given user on the home page3
    When user click account menu
    And user click service terms
    Then user  on the service terms page

  @TCAC3
  Scenario: As user want to see privacy police
    Given user on the home page3
    When user click account menu
    And user click privacy police
    Then user  on the privacy police page

  @TCAC4
  Scenario: As user want to see my profile details
    Given user on the account  page
    When user click edit profile
    Then user  on the edit profile page