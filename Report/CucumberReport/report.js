$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin/feature/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Booking Functionality of Adactin Application",
  "description": "",
  "id": "booking-functionality-of-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify the user is able to login the application",
  "description": "",
  "id": "booking-functionality-of-adactin-application;verify-the-user-is-able-to-login-the-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enter the valid user name in the user name field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enter the valid password in the password field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User verifies whether Home Page navigates to search Hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launches_the_application()"
});
formatter.result({
  "duration": 17524056700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_the_valid_user_name_in_the_user_name_field()"
});
formatter.result({
  "duration": 240242800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_the_valid_password_in_the_password_field()"
});
formatter.result({
  "duration": 154372800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 1274342900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_whether_Home_Page_navigates_to_search_Hotel_page()"
});
formatter.result({
  "duration": 19400,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Verify the user is able to search for hotel",
  "description": "",
  "id": "booking-functionality-of-adactin-application;verify-the-user-is-able-to-search-for-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "User enters the location",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User selects the hotel type",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User selects the room type",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User enters the no.of rooms",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User enters the check in date",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User enters the check out date",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User enters the adults per room",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User enters the children per room",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User clicks the search button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User verifies whether Search Hotel page navigates to select Hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_enters_the_location()"
});
formatter.result({
  "duration": 150400400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selects_the_hotel_type()"
});
formatter.result({
  "duration": 118069900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selects_the_room_type()"
});
formatter.result({
  "duration": 133183300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_no_of_rooms()"
});
formatter.result({
  "duration": 135371300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_check_in_date()"
});
formatter.result({
  "duration": 133477300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_check_out_date()"
});
formatter.result({
  "duration": 134438100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_adults_per_room()"
});
formatter.result({
  "duration": 123916700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_children_per_room()"
});
formatter.result({
  "duration": 138686000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_the_search_button()"
});
formatter.result({
  "duration": 912762700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_whether_Search_Hotel_page_navigates_to_select_Hotel_page()"
});
formatter.result({
  "duration": 23200,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Verify the user selects the hotel",
  "description": "",
  "id": "booking-functionality-of-adactin-application;verify-the-user-selects-the-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "User selects the hotel available",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "User clicks the continue button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User verifies whether Select Hotel page navigates to Book Hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_selects_the_hotel_available()"
});
formatter.result({
  "duration": 86642800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_the_continue_button()"
});
formatter.result({
  "duration": 872568500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_whether_Select_Hotel_page_navigates_to_Book_Hotel()"
});
formatter.result({
  "duration": 22300,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Verify the user is able to Books A Hotel",
  "description": "",
  "id": "booking-functionality-of-adactin-application;verify-the-user-is-able-to-books-a-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 29,
  "name": "User enters a first name",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "User enters a last name",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User enters a billing address",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User enters a credit card no.",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User selects a card type",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User selects a expiry date of month",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "User selects a expiry date of year",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user enters a cvv number",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "User clicks a book now button",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "User verifies whether Book Hotel navigates to Booking confirmation page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_enters_a_first_name()"
});
formatter.result({
  "duration": 207568600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_a_last_name()"
});
formatter.result({
  "duration": 169321700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_a_billing_address()"
});
formatter.result({
  "duration": 136508000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_a_credit_card_no()"
});
formatter.result({
  "duration": 158247900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selects_a_card_type()"
});
formatter.result({
  "duration": 125567200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selects_a_expiry_date_of_month()"
});
formatter.result({
  "duration": 121766500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selects_a_expiry_date_of_year()"
});
formatter.result({
  "duration": 123692300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_a_cvv_number()"
});
formatter.result({
  "duration": 136110800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_a_book_now_button()"
});
formatter.result({
  "duration": 93503600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_whether_Book_Hotel_navigates_to_Booking_confirmation_page()"
});
formatter.result({
  "duration": 23000,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "Verify the user is able to confirm a booking",
  "description": "",
  "id": "booking-functionality-of-adactin-application;verify-the-user-is-able-to-confirm-a-booking",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 41,
  "name": "User verifies hotel name",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "User verifies location",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "User verifies room type",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "User verifies arrival date",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "User verifies departure date",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "User verifies total rooms",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "User verifies adults per room",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "User verifies children per room",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "User verifies price per night",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "User verifies total price",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "User verifies GST",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "User verifies final billed price",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "User verifies order no.",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "User click a itinerary button",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "User verifies whether Booking confirmation page navigates to itinerary page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_verifies_hotel_name()"
});
formatter.result({
  "duration": 33800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_location()"
});
formatter.result({
  "duration": 25900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_room_type()"
});
formatter.result({
  "duration": 31400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_arrival_date()"
});
formatter.result({
  "duration": 26100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_departure_date()"
});
formatter.result({
  "duration": 20300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_total_rooms()"
});
formatter.result({
  "duration": 22700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_adults_per_room()"
});
formatter.result({
  "duration": 24300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_children_per_room()"
});
formatter.result({
  "duration": 18900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_price_per_night()"
});
formatter.result({
  "duration": 23400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_total_price()"
});
formatter.result({
  "duration": 25800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_GST()"
});
formatter.result({
  "duration": 28200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_final_billed_price()"
});
formatter.result({
  "duration": 22800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_order_no()"
});
formatter.result({
  "duration": 21600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_a_itinerary_button()"
});
formatter.result({
  "duration": 6743757300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_whether_Booking_confirmation_page_navigates_to_itinerary_page()"
});
formatter.result({
  "duration": 25900,
  "status": "passed"
});
});