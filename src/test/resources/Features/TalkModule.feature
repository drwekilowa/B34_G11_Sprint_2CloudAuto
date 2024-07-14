@talkModule
Feature: Default

  Background:
		#@B34G11-171
  Scenario: Login functionality
    Given user is on the login page
    When user logged in as "user"
		

	#*User Story:*
	#As a user, I should be able to create a new conversation, add participant under the Talk module
	#
	#*Acceptance Criteria:* 
	#User can create a new conversation by adding any selected participant
  @B34G11-177
  Scenario: US006_AC1_TC1_Verify Users should create conversation

  Scenario: Verify Users should create conversation
    When  Users click Talk button
    Then Users click hamburger icon
    Then Users  click plus button
    Then Users should create  conversation name
    Then Users click Allow guests to join via link
    Then Users should click Add participants button
