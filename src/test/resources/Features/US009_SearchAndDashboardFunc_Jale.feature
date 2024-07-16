@B34G11-158
Feature: Default

	Background:
		Given user is on the login page
		When user logged in as "user"
		

	
	@B34G11-150
	Scenario Outline: US009 Verify user can search file typing its name through the magnifying glass icon.
		When user clicks "<module>" module
		  And user sees search button and click it
		  And user types the file's name and click
		  And user open the file on the files module
		 Then user sees the details side page of the file
		  Examples:
			  | module   |
			  | files    |
			  | photos   |
			  | activity |
			  | spreed   |
			  | contacts |
			  | circles  |
			  | calendar |
			  | deck     |

	
	@B34G11-151
	Scenario Outline: US009 Verify user navigate to the Dashboard page whenever clicking the App icon 
		When user clicks "<module>" module
		  And user navigate to the Dashboard page and click it.
		  Then user sees the Dashboard page
		  Examples:
		  |module|
		  |files|
		  |photos|
		  |activity|
		  |spreed|
		  |contacts|
		  |circles|
		  |calendar|
		  |deck|