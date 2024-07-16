@talkModule
Feature: Default
	Background:
		Given user is on the login page
		When user logged in as "user"
		#As a user, I should be able to create a new conversation, add participant under the Talk module
	#User can create a new conversation by adding any selected participant
	@B34G11-177
	Scenario: US006_AC1_TC1_Verify Users should create conversation
		When  Users click Talk button
		Then Users click hamburger icon
		Then Users  click plus button
		Then Users should create  conversation name
		Then Users click Allow guests to join via link
		Then Users should click Add participants button
		When  Users select Employee10
		Then Users  should click Create conversation
		Then Users should see displayed message All set
		When Users click Close button
		Then Users should see new conversation in the list

	#As a user, I should be able to create a new conversation, add participant under the Talk module
	#User can delete a conversation
	@B34G11-180
	Scenario: US006_AC3_TC4_Verify Users should delete  any conversation from  the list
		When  Users click Talk button
		Then Users click hamburger icon
		Given Users on the conversation list page
		Then Users click ellipsis button
		Then Users navigate Delete conversation and click 
		Then Users should see displayed message Delete conversation
		Then Users click Yes button