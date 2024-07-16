@B34G11-198
Feature: Default

	
	@B34G11-159
	Scenario: User can see at least following titles inside “Personal Info” under Profile Settings page;     => Full name/Email/Phone Number
		Given the user is logged in
		    When the user navigates to the Profile Settings page
		    Then the user should see Personal Info section
		    And the user should see Full name title in the Personal Info section
		    And the user should see Email title in the Personal Info section
		    And the user should see Phone Number title in the Personal Info section

	
	@B34G11-160
	Scenario: Name of the user in the Settings field should be the same with Full Name input box
		Given the user is logged in
		    When the user navigates to the Profile Settings page
		    Then the user should see the Full Name input box
		    And the user should see the Settings field with the user's name
		    And the name in the Settings field should match the Full Name input box	

	
	@B34G11-161
	Scenario: User cannot pass any characters except numbers into the "Phone Number" input box.
		Given the user is logged in
		    When the user navigates to the Profile Settings page
		    Then the user should see the Phone Number input box
		    When the user enters "1234567890" into the Phone Number input box
		    Then the Phone Number input box should contain "1234567890"
		    When the user enters "abc!@#456" into the Phone Number input box
		    Then the Phone Number input box should contain "456"