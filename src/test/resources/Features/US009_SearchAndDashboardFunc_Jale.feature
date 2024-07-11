@B34G11-158
Feature: Default

	
	@B34G11-150
	Scenario Outline: US009 Verify user can search file typing its name through the magnifying glass icon.
		When user clicks "<module>" module
		  And user sees search button and click it
		  And user types the file's name and click
		  And user open the file on the files module
		 Then user sees the details side page of the file
		  Examples:
		  |module|
		  |Files|
		  |Photos|
		  |Activity|
		  |Talk|
		  |Contacts|
		  |Circles|
		  |Calendar|
		  |Deck|	

	
	@B34G11-151
	Scenario Outline: US009 Verify user navigate to the Dashboard page whenever clicking the App icon 
		When user clicks "<module>" module
		  And user navigate to the Dashboard page and click it.
		  Examples:
		  |module|
		  |Files|
		  |Photos|
		  |Activity|
		  |Talk|
		  |Contacts|
		  |Circles|
		  |Calendar|
		  |Deck|