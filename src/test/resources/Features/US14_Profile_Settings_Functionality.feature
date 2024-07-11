@B34G11-165
Feature: Default

	
	@B34G11-162
	Scenario: Full name and username should be the same.
		Given the user is logged in as "User"    
		    When the user navigates to the Profile module
		    And the user opens the profile settings
		    Then the full name displayed in the Full name input box should be the same as "username"	

	
	@B34G11-163
	Scenario: User can enter a proper e-mail to Email input box.
		Given the user is logged in as "User"    
		    When the user navigates to the Profile module
		    And the user opens the profile settings 
		    And the user enters "valid email" in the Email input box
		    Then the Email input box should display "valid email"	

	
	@B34G11-164
	Scenario: User can change Language.
		Given the user is logged in as "User"    
		    When the user navigates to the Profile module
		    And the user opens the profile settings
		    And the user selects a “language” from the Language dropdown 
		    Then the language should be changed to the selected “language”