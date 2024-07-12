@FolderView
Feature: Folder View Functionality

  User Story: As a user, I should be able to change folder view order by using Name/Size/Modified buttons

  Background:
    Given user is on the login page
    When user logged in as "user"


  @OrderByName
  Scenario: User can change folder view order by name
    And User clicks on the folder icon
    And User clicks Name above the files.
    Then User should be able to see the list in alphabetical order A-Z or Z-A

  @OrderBySize
  Scenario: User can change folder view order by size
    And User clicks on the folder icon
    And User clicks Size above the files.
    Then User should be able to see the list in order on the sizes

  @OrderByModified
  Scenario: User can change folder view order by Modified
    And User clicks on the folder icon
    And User clicks Modified above the files.
    Then User should be able to see the list based on modified dates

  @VerifyAllFiles
  Scenario:User can select all the files at once and see the total values of all files
    And User clicks on the folder icon
    And User can select select all checkbox at the left top corner of the list
    And User should be able to see all files checkboxes are selected
    Then User should be able to see the total values of all files in the first line