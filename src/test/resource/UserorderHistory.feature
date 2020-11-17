Feature: Order History Test

  Scenario Outline: As a user I want to check all my order history
    Given user is on the homepage
    And I click on the sign in button
    And I enter the email "<email>" address
    And I enter the password "<password>"
    And I click on the login button
    Then I click on my ORDER HISTORY AND DETAILS
    And I assert text on all orders placed since account creation
    And I take a screenshot
    And I click on my first order to see the details
    And I confirm the order refference and date placed
   # And I click on my latest order to see the details
   # And I affirm the order refference and date it was placed
    And I click on the Product tab so as to select the item size and colour
    When I Added a message into the info box provided
    Then I verify that the account name "<actual_name>" is displayed
    Then I click Send

    Examples:
      | email                   | password              |actual_name     |
      |lyricalwhiz@mail.com	    |Automation_Testing     |Daniel Adebayo  |