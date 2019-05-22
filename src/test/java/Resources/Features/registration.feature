
@tag2
Feature: User should able to register successfully,
  so that he can use all user feature from our website

  Scenario: User should able to register
    Given user is on register page
    When user enters all registration details
    Then user should able to register successfully

    Scenario: User should able to change the currency dollar to euro
      Given user is on home page
      When user click on apparel
      And user select clothing
      Then user click on change currency

