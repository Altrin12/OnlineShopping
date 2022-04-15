Feature: Hotel Booking In Adactin Application

Scenario: Login Page
Given user Launch The Application
When user Enter The User Name In User Name Field
And user Enter The Password In Password Field
Then user Click On The Login Button And It Navigates To Search Hotel Page

Scenario: Search Hotel Page
When user Select The Hotel Location
And user Select The Hotel Name
And user Select The Room Type
And user Select The Number Of Rooms
And user Select The Check In Date
And user Select The Check Out Date
And user Select The Adults Per Room
And user Select The Children Per Room
Then user Click On The Search Button And Its Navigate To Select Hotel Page

Scenario: Select Hotel Page
When user Select The Hotel Hervey
Then user Click On The Continue Button And Its Navigate To Book A Hotel Page

Scenario: Book A Hotel Page
When user Enter The First Name In First Name Field
And user Enter The Last Name In Last Name Field
And user Enter The Billing Address In Billing Address Field
And user Enter The Credit Card Number In Credit Card Number Field
And user Select The Card Type
And user Select The Expiry Month
And user Select The Expiry Year
And user Enter The CVV Number In CVV Number Field
Then user Click On The Book Now Button And Its Navigate To Booking Confirmation Page

Scenario: Booking Confirmation Page
Then user Click On The My Itinerary Button And Its Navigate To Booked Itinerary Page

Scenario: Booked Itinerary Page
Then user Click On The Logout Button And Its Navigate To You Have Successfully Logged Out Page










