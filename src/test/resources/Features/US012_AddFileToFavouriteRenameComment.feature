
Feature: Add file to Favorite,Rename and Comment

  User Story: As a user, I should be able to add a file to favorites, rename any file and give some comments on any file.

  Background
  Given user is on the login page
  When user logged in as "user"

  @B34G11-206
  Scenario: AC1 User should be able to add file to favorite

    Given The user navigates to the files page
    And User clicks 3 dots menu
    Then User adds his file to favorite
    Then User should be able to see the file under the Favorites tab

  @B34G11-208
  Scenario: AC2 Users can rename any file from its own three dots menu
    Given The user navigates to the files page
    And User clicks 3 dots menu
    And User clicks on rename the file

  @B34G11-209
  Scenario: AC3 User can put some comments on any file from the file details menu opened right side.
    Given The user navigates to the files page
    And User clicks 3 dots menu
    And Click on "Details"




