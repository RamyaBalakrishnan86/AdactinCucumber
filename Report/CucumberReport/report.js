$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Testing of Booking functionality in Adactin Application",
  "description": "",
  "id": "testing-of-booking-functionality-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify the User is able to login the Application",
  "description": "",
  "id": "testing-of-booking-functionality-in-adactin-application;verify-the-user-is-able-to-login-the-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters the valid Username in Username filed",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters the valid passord in password field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User click on the Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User verify the Homepage navigate to Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launch_the_application()"
});
formatter.result({
  "duration": 8033276700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_valid_Username_in_Username_filed()"
});
formatter.result({
  "duration": 297146800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_valid_passord_in_password_field()"
});
formatter.result({
  "duration": 179849500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_the_Login_Button()"
});
formatter.result({
  "duration": 3532281100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verify_the_Homepage_navigate_to_Search_Hotel_Page()"
});
formatter.result({
  "duration": 34700,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Verify the User able to Search Hotel in the Application",
  "description": "",
  "id": "testing-of-booking-functionality-in-adactin-application;verify-the-user-able-to-search-hotel-in-the-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "User Select the Loaction in Location Field",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User select the Hotel in Hotel Field",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User select Type of room in RoomType Field",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User select  number of  rooms to booked in NumberofRooms field",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User enters the check in date in the checkInDate Field",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User enters the check out date in the CheckOutDate Field",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User select the number of Adults staying in the AdultPerRoom field",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User select the number of Children staying in the ChildrenPerRoomField",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User click on the Search Button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User verify the SearchHotelpage navigate to SelectHotelPage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Select_the_Loaction_in_Location_Field()"
});
formatter.result({
  "duration": 182904900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_the_Hotel_in_Hotel_Field()"
});
formatter.result({
  "duration": 157231400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_Type_of_room_in_RoomType_Field()"
});
formatter.result({
  "duration": 152997700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_number_of_rooms_to_booked_in_NumberofRooms_field()"
});
formatter.result({
  "duration": 111439600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_check_in_date_in_the_checkInDate_Field()"
});
formatter.result({
  "duration": 132305000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_check_out_date_in_the_CheckOutDate_Field()"
});
formatter.result({
  "duration": 114821700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_the_number_of_Adults_staying_in_the_AdultPerRoom_field()"
});
formatter.result({
  "duration": 149804100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_the_number_of_Children_staying_in_the_ChildrenPerRoomField()"
});
formatter.result({
  "duration": 143255500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_the_Search_Button()"
});
formatter.result({
  "duration": 999767100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verify_the_SearchHotelpage_navigate_to_SelectHotelPage()"
});
formatter.result({
  "duration": 68300,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Verify the User select right choice and check for price",
  "description": "",
  "id": "testing-of-booking-functionality-in-adactin-application;verify-the-user-select-right-choice-and-check-for-price",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "User select the hotel in the select option Field",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "User click on Continue Button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User verify the SelectHotelPage Navigte to Book A Hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_select_the_hotel_in_the_select_option_Field()"
});
formatter.result({
  "duration": 141211500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_Continue_Button()"
});
formatter.result({
  "duration": 865481600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verify_the_SelectHotelPage_Navigte_to_Book_A_Hotel_page()"
});
formatter.result({
  "duration": 30700,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Verify the User is able to Book a hotel room in selected Hotel",
  "description": "",
  "id": "testing-of-booking-functionality-in-adactin-application;verify-the-user-is-able-to-book-a-hotel-room-in-selected-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 30,
  "name": "User enters the valid first name in FirstName Field",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "User enters the valid last name in LastName Field",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User enters the valid Billing address in Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User enters the valid credit card number in the CreditCardNumber Field",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User select  the type of credit in CreditCardType Field",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "User select Expiry month of credit card in ExpiryDate Field",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User select Expiry year of credit card in ExpiryDate Field",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "User enters the valid CVV number in the CVVNumber Field",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "User click on the BookNow Button",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "User verify the Book A Hotel Page navigate to Booking Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_enters_the_valid_first_name_in_FirstName_Field()"
});
formatter.result({
  "duration": 288211800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_valid_last_name_in_LastName_Field()"
});
formatter.result({
  "duration": 115961000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_valid_Billing_address_in_Billing_Address_Field()"
});
formatter.result({
  "duration": 140607200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_valid_credit_card_number_in_the_CreditCardNumber_Field()"
});
formatter.result({
  "duration": 130205500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_the_type_of_credit_in_CreditCardType_Field()"
});
formatter.result({
  "duration": 148951700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_Expiry_month_of_credit_card_in_ExpiryDate_Field()"
});
formatter.result({
  "duration": 141090700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_Expiry_year_of_credit_card_in_ExpiryDate_Field()"
});
formatter.result({
  "duration": 141593700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_valid_CVV_number_in_the_CVVNumber_Field()"
});
formatter.result({
  "duration": 108290900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_the_BookNow_Button()"
});
formatter.result({
  "duration": 93246300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verify_the_Book_A_Hotel_Page_navigate_to_Booking_Confirmation_Page()"
});
formatter.result({
  "duration": 23600,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "Verify the User Booked the Hotel",
  "description": "",
  "id": "testing-of-booking-functionality-in-adactin-application;verify-the-user-booked-the-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 42,
  "name": "User click on the Book Itinerary Button",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "User click on LogOut button",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "User verify Book Itinerary page navigate to sucessfully Logged Out page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_click_on_the_Book_Itinerary_Button()"
});
formatter.result({
  "duration": 7084997500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_LogOut_button()"
});
formatter.result({
  "duration": 653340800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verify_Book_Itinerary_page_navigate_to_sucessfully_Logged_Out_page()"
});
formatter.result({
  "duration": 42400,
  "status": "passed"
});
});