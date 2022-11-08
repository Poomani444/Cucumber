Feature: Hotel Booking In Adactin Application 

Scenario: User Login In Adactin Application 

	Given user Launch The Web Application 
	When user Enter The Username In Username Field 
	And user Enter The Password In Password Field 
	Then user Click The Login Button And Navigates To Search Hotel Page 
	
Scenario: New User Registration Form 

	When user Select Location In The Location Dropdown 
	And user Select Hotel In The Hotels Dropdown
	And user Select Room Type In The Room Type Dropdown
	And user Select Number Of Rooms In The Number Of Rooms Dropdown
	And user Select Check In Date In The Check In Date Field
	And user Select Check Out Date In The Check Out Date Field
	And user Select Adults Per Room In The Adults Per Room Dropdown
	And user Select Children Per Room In The Children Per Room Dropdown
	Then user Click The Search Button 
	