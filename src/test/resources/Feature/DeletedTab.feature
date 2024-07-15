@B34G11-169
Feature: Deleted File Tab

  User Story :
  As a user, I should be able to see all deleted files and delete/restore them permanently under the Deleted Files tab.

  Background:
    Given user is on the login page
    When user logged in as "user"

  @B34G11-166
  Scenario: US007_TC1 Verify user can order deleted files by newest to oldest or vice versa
    When user click on the File module
    Then user click on the Deleted files tab
    And user click on the triangled icon deleted
    Then user see the list of files sorted


  @B34G11-167
  Scenario: US007_TC2 Verify user can delete any deleted file permanently
    When user click on the File module
    Then user click on the Deleted files tab
    Then user click on the three dots icon in the file line
    And user click on the Delete permanently button
    Then user should no longer see the file that was deleted


  @B34G11-168
  Scenario: US007_TC3 Verify user can restore any deleted file and see it again under the All Files tab
    When user click on the File module
    Then user click on the Deleted files tab
    Then user click on the Restore button in the file line
    #And user click on the All files tab
    Then user do not see the restored file in the page


