@B34G11-205
Feature: Contacts Module Functionality

  Background:
    Given user is on the login page
    When user logged in as "user"


  @B34G11-202
  Scenario: User can create a new contact
    When user clicks on Contacts module icon
    And user clicks on Create contact button
    And user enters "Cukes Skywalker" into New Contact text area
    And user enters "CukesSprinter" into Company text area
    And user enters "SDET" into Title text area
    And user enters "0123456789" into Home Phone number text box
    And user enters "cukesmaster@cukessprinter.org" into Home email text box
    And user enters "123 Cukes Way" into Address text box
    And user enters "12345" into Postal code
    And user enters "CukesTown" into City text box
    And user enters "Cukesifornia" into State or province text box
    And user enters "United Nation of Cukes" into Country text box
    And user clicks on the Contacts module icon again
    Then user should see "Cukes Skywalker" is displayed


  @B34G11-203
  Scenario: User can see all the contacts as a list inside the middle column and total number of the contacts near the “All Contacts” tab
    When user clicks on Contacts module icon
    Then user sees "Cukes Skywalker" displayed in a list in middle column
    Then user sees total number of contacts near All contacts tab

  @B34G11-204
  Scenario: User can delete any selected contact
    When user clicks on Contacts module icon
    And user clicks on the new existing contact
    And user is navigated back to the new existing contact's info page and clicks the ellipsis icon
    And user clicks delete button
    Then user's new contact "Cukes Skywalker" is deleted