@currency

Feature: Change currency
  As user is registered and able to change currency

  Scenario: User should able to change the currency to dollar
    Given user is on home page
    When user hover on Apparels
    And user click on clothing
    And user click on change currency
    Then All product should show in Dollar value
