Feature: Hotel Booking In Adactin Application

Scenario: User Login In Adactin Application

Given user Launch The Web Application
When user Enter The Username In Username Field
And user Enter The Password In Password Field
Then user Click The Login Button And Navigates To Search Hotel Page

Scenario: User Fill The Details In Required Field To Book The Hotel

When user Will Select The Location In Location Dropdown Field
And user Will Select The Hotel In Hotels Dropdown Field
And user Will Select The Room Type In Room Type Dropdown Field
And user Will Select The Numbe Of Rooms In Number OF Room Dropdown Field
And user Will Put The Check In Date In  Check In Date Field
And user Will Put The Check Out Date In Check Out Date Field
And user Will Select The Adults Per Room In Adults Per Room Dropdown Field
And user Will Select The Children Per Room In Children Per Room Dropdown Field
Then user Click The Search Button And Navigates To Select Hotel

Scenario: User Choose the hotel to book the room 

When user Will Select The Particular Hotel In Select Field
Then user Click The Continue Button And Navigate To Book A Hotel

Scenario: User book a hotel

When user Will Enter The First Name In First Name Field
And user Will Enter The Last Name In Last Name Field
And user Will Enter The Billing Address In Billing Address Field
And user Will Enter The Credit Card Number In Credit Number Field
And user Will Select The Credit Card Type In Credit Card Type Dropdown Filed
And user Will Select The Month And Year In Expiry Date Dropdown Field
And user Will Enter The CCV Number In CCV Number Field
Then user Click The Book Now Button And Navigates To Booking Confirmation Page

Scenario: User logout the adactin page after book the hotel

Then user Click The Logout Button