Feature: Contact Carguruji Test

 Scenario Outline: As a user I would like to contact customer service

   Given user is on the homepage
   And I click on the sign in button
   And I enter the email "<email>" address
   And I enter the password "<password>"
   And I click on the login button
   Then I click the Contact us button
   And I click in the Subject Heading tab to select Customer service from the drop down menu
   And I click on the Order reference tab to select my latest order from the list
   And I click on the Product tab to select the item size and colour
   When I wrote inside the message box provide
   Then I verify that the account name "<actual_name>" is displayed
   Then I click on the Send button

  Examples:
   | email                 | password           |actual_name     |
   |lyricalwhiz@mail.com   |Automation_Testing  |Daniel Adebayo  |
