@login

Feature: LoginPage

  Scenario Outline: user should not be able to login with invalid credential

    Given user is on login page
      When user enters invalid "<Email>" or "<password>"
      Then user should able to see the "<error message>"
      Examples:
        |Email |password |error message|
        |rosie1@gmail.com |aum1234   |Login was unsuccessful.Please correct the errors and try again. The credential provided are incorrect|
        |rosie12@gmail.com|aum1234   |Login was unsuccessful.Please correct the errors and try again.No customer account found|
        |rosie2@gmail.com |          |Login was unsuccessful.Please correct the errors and try again.No customer account found|
        |                 |aum1234   |Login was unsuccessful.Please correct the errors and try again.No customer account found|