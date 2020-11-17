 Feature: Forgot Password Test

   Scenario Outline: As a user I would like to retrieve my password
     Given user is on the homepage
     And I click on the sign in button
     When I click on forgot password link
     And I enter the email "<email>" address
     And I click on Retrieve Password button
     Then I Verify the given message

     Examples:
       | email                   | password              |actual_name    |
       |lukebible@mail.com	     |InteliJ3	            |Luke Bible      |