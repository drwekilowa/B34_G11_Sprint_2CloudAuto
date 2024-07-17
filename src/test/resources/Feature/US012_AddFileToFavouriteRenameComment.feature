Feature: Add file to Favorite,Rename and Comment

  User Story: As a user, I should be able to add a file to favorites, rename any file and give some comments on any file.
@Test
  Scenario: AC1 User should be able to add file to favorite

  Given User is logged in and on main page
  When The user navigates to the files page
  And User clicks 3 dots menu
  Then User adds his file to favorite

