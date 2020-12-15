Feature: Booking Functionality of Adactin Application 

Background: 
	Given User launches the application 
	When User login to application 
	
@SmokeTest 
Scenario Outline: Verify the user is able to login the application 
	When User login the page
	And User enter the valid "<userName>" in the user name field 
	And User enter the valid "<password>" in the password field 
	And User clicks on the login button 
	Then User verifies whether Home Page navigates to search Hotel page 
	
	Examples: 
		|userName|password|
		|AAA|111|
		|BBB|222|
		|ShermilyU|Newdayma@123|

	
		Scenario: Verify the user is able to search for hotel 
		
			When User enters the "Sydney" as "text" 
			And User selects the "Hotel Hervey" as "text" 
			And User selects the room "Double" as "text" 
			And User enters the number of  "2 - Two" as "text" 
			And User enters the "3 - Three" as "text" per room 
			And User enters the "1 - One" as "text" in one room 
			And User clicks the search button 
			Then User verifies whether Search Hotel page navigates to select Hotel page 
			

		Scenario: Verify the user selects the hotel 
			When User selects the hotel available 
			And User clicks the continue button 
			Then User verifies whether Select Hotel page navigates to Book Hotel 
			
		Scenario: Verify the user is able to Books A Hotel 
			When User enters a "Shermily" name 
			And User enters a last "Uma" name 
			And User enters a "ECR" address 
			And User enters a "1234567890123456" card no. 
			And User selects a "VISA" as "text" type 
			And User selects a "January" as "text" date of month 
			And User selects a expiry "2014" as "text" of year 
			And user enters a "765" number 
			And User clicks a book now button 
			Then User verifies whether Book Hotel navigates to Booking confirmation page 
			
		Scenario: Verify the user is able to confirm a booking 
		
			Wheh User click a itinerary button 
			Then User verifies whether Booking confirmation page navigates to itinerary page 
			
		Scenario: Verify the user able to logout the account 
			When User click a logout button 
			
			
			
			
			
        