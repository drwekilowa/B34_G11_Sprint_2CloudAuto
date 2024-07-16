@B34G11-165
Feature: Default
	Background:
		Given user is on the login page
		When user logged in as "user"
	
	@B34G11-162
	Scenario: Full name and username should be the same.
		When the user clicks the Profile module
		And the user clicks the profile settings
		Then the full name displayed in the Full name input box should be the same as "username"

	
	@B34G11-163
	Scenario: User can enter a proper e-mail to Email input box.
		When the user clicks the Profile module
		And the user clicks the profile settings
		And the user enters "validEmail@example.com" in the Email input box and hit the enter
		Then the Email input box should display "validEmail@example.com"


	@B34G11-164
	Scenario Outline: User can change Language.

		When the user clicks the Profile module
		And the user clicks the profile settings
		And User selects a different language "<new_language>"
		Then Language should be changed to "<new_language>" successfully

		Examples:
			| new_language |
			| Italiano     |
			| Nederlands   |
			| Dansk        |
			| Svenska      |
			| English (US) |
