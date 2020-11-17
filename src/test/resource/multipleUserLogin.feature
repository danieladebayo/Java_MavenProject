Feature: Multiple User Login Test

  Scenario Outline: I would like to sign in using multiple users


    Given user is on the homepage
    And I click on the sign in button
    And I enter the email "<email>" address
    And I enter the password "<password>"
    And I click on the login button
    Then I verify that the account name "<actual_name>" is displayed
    And I sign out user
#    Then I close down the browser


    Examples:
      | email                   | password              |actual_name     |
      |lyricalwhiz@mail.com	    |Automation_Testing     |Daniel Adebayo  |
#      |mathewbible@mail.com     |InteliJ1               |Mathew Bible    |
#      |markbible@mail.com	    |InteliJ2	            |Mark Bible      |
#      |lukebible@mail.com	    |InteliJ3	            |Luke Bible      |
#      |johnbible@mail.com	    |InteliJ4               |John Bible      |
