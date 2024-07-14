@B34G11-176
Feature: Upload/Edit/Delete File Module Functionality
  User Story:
  As a user, I should be able to upload a file, move or delete any selected file under the Files
  module


  Background: Login function
    Given user is on the login page
    When user logged in as "user"
    Then user navigates file module

  @B34G11-172
  Scenario: User can upload a file
    And  user sees plus icon to upload file
    Then  user chooses a file from local computer and click open button
    Then user sees uploaded file in list of files


  @B34G11-173
  Scenario: User can create a new folder
    When user navigate plus icon and clicks
    Then user clicks plus icon and sees New folder option
    Then user types folder name and clicks arrow
    Then user sees a new folder in list


  @B34G11-175
  Scenario: User can see the total number of files and folders under the files list table
    When user is in all files table
    And user sees the total number of files and folders under the files list


  @B34G11-174
  Scenario: User can delete any selected item from its three dots menu
    When user clicks three dots menu
    And user sees delete option and clicks on it