Feature: User Checkout Test

  Scenario Outline: As a user I want to login, search for dress, pay and confirm my order
    Given user is on the homepage
    And I click on the sign in button
    And I enter the email "<email>" address
    And I enter the password "<password>"
    And I click on the login button
    And I search for dress
    And I select dress from the list
    And I chose quantity, size and color required
    And I add items to cart
    And I click proceed to checkout
    And I viewed items summary and click proceed to checkout
    And I viewed billing, shipping adresses and click proceed to checkout
    And I checked box to accept terms of services and click proceed to checkout
    When I chose Check as mode of payment
    When I click confirm order
    Then I verify that the account name "<actual_name>" is displayed
    And I sign out user
    Then I close down the browser

    Examples:
      | email                   | password              |actual_name     |
      |lyricalwhiz@mail.com	    |Automation_Testing     |Daniel Adebayo  |