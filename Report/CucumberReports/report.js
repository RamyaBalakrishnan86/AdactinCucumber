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
