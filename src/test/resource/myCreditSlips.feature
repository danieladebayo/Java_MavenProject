Feature: My Credit Slips Test

  Scenario Outline: As a user I want to check if i have credit slips
    Given user is on the homepage
    And I click on the sign in button
    And I enter the email "<email>" address
    And I enter the password "<password>"
    And I click on the login button
    When I click on the MY CREDIT SLIPS button
    Then I verify the message within and take a screen shot
    Then I verify that the account name "<actual_name>" is displayed
    And I sign out user
    Then I close down the browser

    Examples:
      | email                   | password              |actual_name     |
      |markbible@mail.com	    |InteliJ2	            |Mark Bible      |