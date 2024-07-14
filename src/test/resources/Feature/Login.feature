Feature:Users should be able to login
  User Story:
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: user, employee

  US005_CalendarModuleFunctionality_Sevinj
  Background:  Given user is on the login page


  Scenario: Login as user
  # Given user is on the login page
    When user enters the user information
    Then user should be able to login

  Scenario: Login as employee
 #   Given user is on the login page
    When user enters the employee information
    Then user should be able to log
