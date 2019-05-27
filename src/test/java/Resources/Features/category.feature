@category
  Feature: User should able to navigate to all
    category page successfully

    Scenario Outline: User can navigate to correct category page,
So that he can use all products features from categories
      Given user is on home page
      When user clicks on "<category>" link from top menu
      Then user should able to navigate to "<related category page>" successfully
Examples:
|category               |related category page|
|Computers              |https://demo.nopcommerce.com/computers     |
|Electronics            |https://demo.nopcommerce.com/electronics   |
|Apparel                |https://demo.nopcommerce.com/apparel       |
|Books                  |https://demo.nopcommerce.com/books         |
