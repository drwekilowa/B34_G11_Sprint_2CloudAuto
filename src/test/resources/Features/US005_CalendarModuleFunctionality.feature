Feature: Default

  Background:
		#@B34G11-170
    Given user is on the login page
    When user logged in as "user"


  @B34G11-181 @calendar
  Scenario: US005_TC1_Verify user can display daily calendar view
    When user clicks on the Calendar module
    And user clicks on the Calendar Menu button
    Then user can display Daily calendar view


  @B34G11-182 @calendar
  Scenario: US005_TC2_Verify user can display weekly calendar view
    When user is on Daily calendar view
    And user clicks on the Weekly button
    Then user can see displayed Weekly calendar view


  @B34G11-183 @calendar
  Scenario: US005_TC3_Verify user can display monthly calendar view
    When user is on Weekly calendar view
    And user clicks on the Monthly button
    Then user can see displayed Monthly calendar view


  @B34G11-184 @calendar
  Scenario: US005_TC4_Verify user can create a new event under the Calendar module
    When user is on the Calendar page
    Then user clicks on the New event button
    Then user passes event name in Event title input
    And user selects from event date and time
    And user selects to event date and time
    And user clicks to the Save button
    Then user should be able to create a new event under the Calendar module and see it on the related day through the Monthly Calendar view
