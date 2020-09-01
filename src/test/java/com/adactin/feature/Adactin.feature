Feature: Testing of Booking functionality in Adactin Application

Background:
  Given User launch the Adactin Applicatin 
  When User Log into the Application

@SmokeTest
Scenario Outline: Verify the User is able to login the Application
    Given User launch the application
    When User enters the valid "<userName>" in Username filed
    And User enters the valid "<password>" in password field
    And User click on the Login Button
    Then User verify the Homepage navigate to Search Hotel Page
  Examples:
          |userName|password|
          |AAAA|1111|
          |BBBB|2222|
          |RamyaBalakrishnan|neharithikha|
   
Scenario: Verify the User able to Search Hotel in the Application   
    
     When User Select the location "New York" as "value" in Location Field
     And User select the Hotel "Hotel Sunshine" as "visibletext" in Hotel Field
     And User select Type of room "Super Deluxe" as "value" in RoomType Field
     And User select  number of  rooms "1" as "value" to booked in NumberofRooms field
     And User enters the check in date in the checkInDate Field
     And User enters the check out date in the CheckOutDate Field
     And User select the number of Adults staying in the AdultPerRoom field
     And User select the number of Children staying in the ChildrenPerRoomField
     And User click on the Search Button
     Then User verify the SearchHotelpage navigate to SelectHotelPage
   
   Scenario: Verify the User select right choice and check for price
   
       When User select the hotel in the select option Field
       And User click on Continue Button
       Then  User verify the SelectHotelPage Navigte to Book A Hotel page
       
   Scenario: Verify the User is able to Book a hotel room in selected Hotel
       When User enters the valid first name in FirstName Field
       And User enters the valid last name in LastName Field
       And User enters the valid Billing address in Billing Address Field
       And User enters the valid credit card number in the CreditCardNumber Field
       And User select  the type of credit in CreditCardType Field  
       And User select Expiry month of credit card in ExpiryDate Field
        And User select Expiry year of credit card in ExpiryDate Field
       And User enters the valid CVV number in the CVVNumber Field
       And User click on the BookNow Button
       Then User verify the Book A Hotel Page navigate to Booking Confirmation Page  
       
       Scenario: Verify the User Booked the Hotel
       When User click on the Book Itinerary Button
       And User click on LogOut button
       Then User verify Book Itinerary page navigate to sucessfully Logged Out page
       
      
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
      