package com.adactin.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.runner.TestRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass{
	public static WebDriver driver=TestRunner.driver;
	PageObjectManager pom=new PageObjectManager(driver);
	
	
	@Given("^User launch the Adactin Applicatin$")
	public void user_launch_the_Adactin_Applicatin() throws Throwable {
    System.out.println("         User Launch The Application          ");

	}

	@When("^User Log into the Application$")
	public void user_Log_into_the_Application() throws Throwable {

		 System.out.println("         User Log into The Application          ");
	}

	
	@Given("^User launch the application$")
	public void user_launch_the_application() throws Throwable {
//driver=getBrowse("chrome");
//getUrl("http://adactinhotelapp.com/");
		String url = FileReaderManager.getInstance().getCrInstance().getUrl();
		getUrl(url);

	}

	/*@When("^User enters the valid Username in Username filed$")
	public void user_enters_the_valid_Username_in_Username_filed() throws Throwable {
//HomePage hp = new HomePage(driver);
inputToElement(pom.getHp().getUsername(),"RamyaBalakrishnan");

	}

	@When("^User enters the valid passord in password field$")
	public void user_enters_the_valid_passord_in_password_field() throws Throwable {
		//HomePage hp = new HomePage(driver);
		inputToElement(pom.getHp().getPassword(),"neharithikha");

	}*/
	
	@When("^User enters the valid \"([^\"]*)\" in Username filed$")
	public void user_enters_the_valid_in_Username_filed(String username) throws Throwable {

		inputToElement(pom.getHp().getUsername(),username);
		
	}

	@When("^User enters the valid \"([^\"]*)\" in password field$")
	public void user_enters_the_valid_in_password_field(String password) throws Throwable {
		inputToElement(pom.getHp().getPassword(),password);
		

	}


	@When("^User click on the Login Button$")
	public void user_click_on_the_Login_Button() throws Throwable {
		//HomePage hp = new HomePage(driver);
		clickOnElement(pom.getHp().getLogin());
		

	}

	@Then("^User verify the Homepage navigate to Search Hotel Page$")
	public void user_verify_the_Homepage_navigate_to_Search_Hotel_Page() throws Throwable {
		//Assert.assertEquals("A", "a");

	}
	
	/*@When("^User Select the Loaction in Location Field$")
	public void user_Select_the_Loaction_in_Location_Field() throws Throwable {
    // SearchHotel sh = new SearchHotel(driver);
     selectDropDown(pom.getSh().getLocation(),"New York","value");

	}

	@When("^User select the Hotel in Hotel Field$")
	public void user_select_the_Hotel_in_Hotel_Field() throws Throwable {
		//SearchHotel sh = new SearchHotel(driver);
	     selectDropDown(pom.getSh().getHotel(),"Hotel Sunshine","visibletext");


	}

	@When("^User select Type of room in RoomType Field$")
	public void user_select_Type_of_room_in_RoomType_Field() throws Throwable {
		//SearchHotel sh = new SearchHotel(driver);
	     selectDropDown(pom.getSh().getrType(),"Super Deluxe","value");


	}

	@When("^User select  number of  rooms to booked in NumberofRooms field$")
	public void user_select_number_of_rooms_to_booked_in_NumberofRooms_field() throws Throwable {
		//SearchHotel sh = new SearchHotel(driver);
	     selectDropDown(pom.getSh().getnRooms(),"1","value");

	}*/
	@When("^User Select the location \"([^\"]*)\" as \"([^\"]*)\" in Location Field$")
	public void user_Select_the_location_as_in_Location_Field(String location, String option) throws Throwable {
		 selectDropDown(pom.getSh().getLocation(),location,option);


	}

	@When("^User select the Hotel \"([^\"]*)\" as \"([^\"]*)\" in Hotel Field$")
	public void user_select_the_Hotel_as_in_Hotel_Field(String shotel, String option) throws Throwable {
		selectDropDown(pom.getSh().getHotel(),shotel,option);

	}

	@When("^User select Type of room \"([^\"]*)\" as \"([^\"]*)\" in RoomType Field$")
	public void user_select_Type_of_room_as_in_RoomType_Field(String roomType, String option) throws Throwable {
		 selectDropDown(pom.getSh().getrType(),roomType,option);

	}

	@When("^User select  number of  rooms \"([^\"]*)\" as \"([^\"]*)\" to booked in NumberofRooms field$")
	public void user_select_number_of_rooms_as_to_booked_in_NumberofRooms_field(String noOfRooms, String option) throws Throwable {

		 selectDropDown(pom.getSh().getnRooms(),noOfRooms,option);
	}


	

	@When("^User enters the check in date in the checkInDate Field$")
	public void user_enters_the_check_in_date_in_the_checkInDate_Field() throws Throwable {
		//SearchHotel sh = new SearchHotel(driver);
	    inputToElement(pom.getSh().getcInDate(), "11/08/2020");

	}

	@When("^User enters the check out date in the CheckOutDate Field$")
	public void user_enters_the_check_out_date_in_the_CheckOutDate_Field() throws Throwable {

		//SearchHotel sh = new SearchHotel(driver);
		inputToElement(pom.getSh().getcOutDate(), "12/08/2020");

	}

	@When("^User select the number of Adults staying in the AdultPerRoom field$")
	public void user_select_the_number_of_Adults_staying_in_the_AdultPerRoom_field() throws Throwable {
		//SearchHotel sh = new SearchHotel(driver);
	     selectDropDown(pom.getSh().getAdultRoom(),"2","value");

	}

	@When("^User select the number of Children staying in the ChildrenPerRoomField$")
	public void user_select_the_number_of_Children_staying_in_the_ChildrenPerRoomField() throws Throwable {

		//SearchHotel sh = new SearchHotel(driver);
	     selectDropDown(pom.getSh().getChildRoom(),"2","value");
	}

	@When("^User click on the Search Button$")
	public void user_click_on_the_Search_Button() throws Throwable {
		//SearchHotel sh = new SearchHotel(driver);
		clickOnElement(pom.getSh().getBtnSearch());

	}

	@Then("^User verify the SearchHotelpage navigate to SelectHotelPage$")
	public void user_verify_the_SearchHotelpage_navigate_to_SelectHotelPage() throws Throwable {

//Assert.assertEquals("A", "a");
	}
	@When("^User select the hotel in the select option Field$")
	public void user_select_the_hotel_in_the_select_option_Field() throws Throwable {
//SelectHotel s1 = new SelectHotel(driver);
clickOnElement(pom.getS1().getBtnRadio());

	}

	@When("^User click on Continue Button$")
	public void user_click_on_Continue_Button() throws Throwable {

		//SelectHotel s1 = new SelectHotel(driver);
		clickOnElement(pom.getS1().getBtnContinue());
	}

	@Then("^User verify the SelectHotelPage Navigte to Book A Hotel page$")
	public void user_verify_the_SelectHotelPage_Navigte_to_Book_A_Hotel_page() throws Throwable {


	}

	@When("^User enters the valid first name in FirstName Field$")
	public void user_enters_the_valid_first_name_in_FirstName_Field() throws Throwable {
 // BookAHotel bh = new BookAHotel(driver);
inputToElement(pom.getBh().getfName(),"Will");
	}

	@When("^User enters the valid last name in LastName Field$")
	public void user_enters_the_valid_last_name_in_LastName_Field() throws Throwable {
		//BookAHotel bh = new BookAHotel(driver);
		inputToElement(pom.getBh().getlName(),"Smith");

	}

	@When("^User enters the valid Billing address in Billing Address Field$")
	public void user_enters_the_valid_Billing_address_in_Billing_Address_Field() throws Throwable {
		//BookAHotel bh = new BookAHotel(driver);
		inputToElement(pom.getBh().getbAddress(),"Los Angels");

	}

	@When("^User enters the valid credit card number in the CreditCardNumber Field$")
	public void user_enters_the_valid_credit_card_number_in_the_CreditCardNumber_Field() throws Throwable {
		//BookAHotel bh = new BookAHotel(driver);
		inputToElement(pom.getBh().getcCardNumber(),"0000000000000000");

	}

	@When("^User select  the type of credit in CreditCardType Field$")
	public void user_select_the_type_of_credit_in_CreditCardType_Field() throws Throwable {
		//BookAHotel bh = new BookAHotel(driver);
		selectDropDown(pom.getBh().getcCardType(),"VISA","value");

	}
	@When("^User select Expiry month of credit card in ExpiryDate Field$")
	public void user_select_Expiry_month_of_credit_card_in_ExpiryDate_Field() throws Throwable {

		//BookAHotel bh = new BookAHotel(driver);
		selectDropDown(pom.getBh().getCcExpMonth(),"December","visibletext");
	}

	@When("^User select Expiry month and year of credit card in ExpiryDate Field$")
	public void user_select_Expiry_month_and_year_of_credit_card_in_ExpiryDate_Field() throws Throwable {
		

	}
	@When("^User select Expiry year of credit card in ExpiryDate Field$")
	public void user_select_Expiry_year_of_credit_card_in_ExpiryDate_Field() throws Throwable {
		//BookAHotel bh = new BookAHotel(driver);
		selectDropDown(pom.getBh().getCcExpYear(),"2022","value");

	}
	@When("^User enters the valid CVV number in the CVVNumber Field$")
	public void user_enters_the_valid_CVV_number_in_the_CVVNumber_Field() throws Throwable {

		//BookAHotel bh = new BookAHotel(driver);
		inputToElement(pom.getBh().getCvvNumber(),"9898");
	}

	@When("^User click on the BookNow Button$")
	public void user_click_on_the_BookNow_Button() throws Throwable {
		//BookAHotel bh = new BookAHotel(driver);
		clickOnElement(pom.getBh().getBookNow());

	}

	@Then("^User verify the Book A Hotel Page navigate to Booking Confirmation Page$")
	public void user_verify_the_Book_A_Hotel_Page_navigate_to_Booking_Confirmation_Page() throws Throwable {


	}

	@When("^User click on the Book Itinerary Button$")
	public void user_click_on_the_Book_Itinerary_Button() throws Throwable {

//BookItinerary bi = new BookItinerary(driver);
clickOnElement(pom.getBi().getBookItinerary());
	}

	@When("^User click on LogOut button$")
	public void user_click_on_LogOut_button() throws Throwable {
		//BookItinerary bi = new BookItinerary(driver);
		clickOnElement(pom.getBi().getLogout());

	}

	@Then("^User verify Book Itinerary page navigate to sucessfully Logged Out page$")
	public void user_verify_Book_Itinerary_page_navigate_to_sucessfully_Logged_Out_page() throws Throwable {


	}



}
