package com.adactin.stepdefinition;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;


import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.HotelBooking;
import com.adactin.pom.Itinerary;
import com.adactin.pom.LogOut;
import com.adactin.pom.LoginPage;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;
import com.adactin.runner.TestRunner;

import cucumber.api.Scenario;
import cucumber.api.java.*;
import cucumber.api.java.en.*;

public class StepDefinition extends BaseClass {
	public static WebDriver driver = TestRunner.driver;
	PageObjectManager pom = new PageObjectManager(driver);
	
	@Before
	public void beforeHooks(Scenario scenario) {
		String name = scenario.getName();
		
		System.out.println("Scenarioname:   "+name);
		
	}
	
	@After
	public void afterHooks(Scenario scenario) throws IOException {
		String status = scenario.getStatus();
		System.out.println("    Scenariostatus:   "+status);
		if (scenario.isFailed()) {
			getScreenshot(scenario.getName());
			
		}
	}
	
	
	@Given("^User launches the application$")
	public void user_launches_the_application() throws Throwable {
		System.out.println("User Launches the application");

	}
	
	@When("^User login to application$")
	public void user_login_to_application() throws Throwable {
		System.out.println("User Login the application");
	}
	
	


	@When("^User login the page$")
	public void user_login_the_page() throws Throwable {
		// driver = getBrowser("chrome");
				// getUrl("https://adactinhotelapp.com/");
				String url = FileReaderManager.getInstance().getCrInstance().getUrl();
				getUrl(url);
	}
	
	@When("^User enter the valid \"([^\"]*)\" in the user name field$")
	public void user_enter_the_valid_in_the_user_name_field(String username) throws Throwable {

		inputValuetoElement(pom.getLp().getUserName(), username);
	}

	@When("^User enter the valid \"([^\"]*)\" in the password field$")
	public void user_enter_the_valid_in_the_password_field(String password) throws Throwable {
		inputValuetoElement(pom.getLp().getPassword(), password);
	}

	@When("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		clickOnElement(pom.getLp().getLogIn());
	}

	@Then("^User verifies whether Home Page navigates to search Hotel page$")
	public void user_verifies_whether_Home_Page_navigates_to_search_Hotel_page() throws Throwable {
		//validation
		//Assert.assertEquals("A", "a");
	}

	@When("^User enters the \"([^\"]*)\" as \"([^\"]*)\"$")
	public void user_enters_the_as(String location, String option) throws Throwable {
		selectDropDown(pom.getSh().getLocation(), location, option);
	}

	@When("^User selects the \"([^\"]*)\" as \"([^\"]*)\"$")
	public void user_selects_the_as(String hotel, String option) throws Throwable {
		selectDropDown(pom.getSh().getHotels(), hotel, option);
	}

	@When("^User selects the room \"([^\"]*)\" as \"([^\"]*)\"$")
	public void user_selects_the_room_as(String room, String option) throws Throwable {
		selectDropDown(pom.getSh().getRoomType(), room, option);
	}

	/*
	 * @When("^User selects the room type$") public void
	 * user_selects_the_room_type() throws Throwable { SearchHotel sh = new
	 * SearchHotel(driver); selectDropDown(sh.getRoomType(), "Double", "text"); }
	 */

	@When("^User enters the number of  \"([^\"]*)\" as \"([^\"]*)\"$")
	public void user_enters_the_number_of_as(String rooms, String option) throws Throwable {
		selectDropDown(pom.getSh().getNoOfRooms(), rooms, option);

	}

//adults per room
	@When("^User enters the \"([^\"]*)\" as \"([^\"]*)\" per room$")
	public void user_enters_the_as_per_room(String adult, String option) throws Throwable {
		selectDropDown(pom.getSh().getAdults(), adult, option);

	}

	// children per room
	@When("^User enters the \"([^\"]*)\" as \"([^\"]*)\" in one room$")
	public void user_enters_the_as_in_one_room(String children, String option) throws Throwable {
		selectDropDown(pom.getSh().getChildren(), children, option);

	}

	@When("^User clicks the search button$")
	public void user_clicks_the_search_button() throws Throwable {
		clickOnElement(pom.getSh().getSearch());
	}

	@Then("^User verifies whether Search Hotel page navigates to select Hotel page$")
	public void user_verifies_whether_Search_Hotel_page_navigates_to_select_Hotel_page() throws Throwable {

	}

	@When("^User selects the hotel available$")
	public void user_selects_the_hotel_available() throws Throwable {
		clickOnElement(pom.getSel().getSelect());
	}

	@When("^User clicks the continue button$")
	public void user_clicks_the_continue_button() throws Throwable {
		clickOnElement(pom.getSel().getContinue());

	}

	@Then("^User verifies whether Select Hotel page navigates to Book Hotel$")
	public void user_verifies_whether_Select_Hotel_page_navigates_to_Book_Hotel() throws Throwable {
		//Assert.assertEquals("D", "d");
	}

	@When("^User enters a \"([^\"]*)\" name$")
	public void user_enters_a_name(String first) throws Throwable {
		inputValuetoElement(pom.getHb().getFirstName(), first);
	}

	@When("^User enters a last \"([^\"]*)\" name$")
	public void user_enters_a_last_name(String last) throws Throwable {
		inputValuetoElement(pom.getHb().getLastNAme(), last);
	}

	@When("^User enters a \"([^\"]*)\" address$")
	public void user_enters_a_address(String address) throws Throwable {
		inputValuetoElement(pom.getHb().getBillingAdd(), address);
	}

	@When("^User enters a \"([^\"]*)\" card no\\.$")
	public void user_enters_a_card_no(String card) throws Throwable {
		inputValuetoElement(pom.getHb().getCreditCardNo(), card);
	}

	@When("^User selects a \"([^\"]*)\" as \"([^\"]*)\" type$")
	public void user_selects_a_as_type(String type, String option) throws Throwable {
		selectDropDown(pom.getHb().getCardType(), type, option);
	}

	@When("^User selects a \"([^\"]*)\" as \"([^\"]*)\" date of month$")
	public void user_selects_a_as_date_of_month(String month, String option) throws Throwable {
		selectDropDown(pom.getHb().getSelectMonth(), month, option);
	}

	@When("^User selects a expiry \"([^\"]*)\" as \"([^\"]*)\" of year$")
	public void user_selects_a_expiry_as_of_year(String year, String option) throws Throwable {
		selectDropDown(pom.getHb().getSelectYear(), year, option);
	}

	@When("^user enters a \"([^\"]*)\" number$")
	public void user_enters_a_number(String cvv) throws Throwable {
		inputValuetoElement(pom.getHb().getCVVNumber(), cvv);
	}

	@When("^User clicks a book now button$")
	public void user_clicks_a_book_now_button() throws Throwable {
		clickOnElement(pom.getHb().getBookNow());
	}

	@Then("^User verifies whether Book Hotel navigates to Booking confirmation page$")
	public void user_verifies_whether_Book_Hotel_navigates_to_Booking_confirmation_page() throws Throwable {
		//Assert.assertEquals("C", "c");
	}

	@When("^User click a itinerary button$")
	public void user_click_a_itinerary_button() throws Throwable {
		clickOnElement(pom.getIt().getMyItinerary());
	}

	@Then("^User verifies whether Booking confirmation page navigates to itinerary page$")
	public void user_verifies_whether_Booking_confirmation_page_navigates_to_itinerary_page() throws Throwable {
		//Assert.assertEquals("B", "b");
	}

	@When("^User click a logout button$")
	public void user_click_a_logout_button() throws Throwable {
		clickOnElement(pom.getLg().getLogout());

	}

	/*
	 * @When("^User enter the valid user name in the user name field$") public void
	 * user_enter_the_valid_user_name_in_the_user_name_field() throws Throwable {
	 * LoginPage lp= new LoginPage(driver); inputValuetoElement(lp.getUserName(),
	 * "ShermilyU"); }
	 * 
	 * @When("^User enter the valid password in the password field$") public void
	 * user_enter_the_valid_password_in_the_password_field() throws Throwable {
	 * LoginPage lp= new LoginPage(driver); inputValuetoElement(lp.getPassword(),
	 * "Newdayma@123"); }
	 * 
	 * @When("^User selects the hotel type$") public void
	 * user_selects_the_hotel_type() throws Throwable { SearchHotel sh = new
	 * SearchHotel(driver); selectDropDown(sh.getHotels(), "Hotel Sunshine",
	 * "text");
	 * 
	 * }
	 * 
	 * @When("^User selects the room type$") public void
	 * user_selects_the_room_type() throws Throwable { SearchHotel sh = new
	 * SearchHotel(driver); selectDropDown(sh.getRoomType(), "Double", "text"); }
	 * 
	 * 
	 * @When("^User enters the no\\.of rooms$") public void
	 * user_enters_the_no_of_rooms() throws Throwable { SearchHotel sh = new
	 * SearchHotel(driver); selectDropDown(sh.getNoOfRooms(), "2 - Two", "text"); }
	 * 
	 * @When("^User enters the check in date$") public void
	 * user_enters_the_check_in_date() throws Throwable { SearchHotel sh = new
	 * SearchHotel(driver); inputValuetoElement(sh.getCheckIn(), "02/12/2020"); }
	 * 
	 * @When("^User enters the check out date$") public void
	 * user_enters_the_check_out_date() throws Throwable { SearchHotel sh = new
	 * SearchHotel(driver); inputValuetoElement(sh.getCheckOut(), "03/12/2020"); }
	 * 
	 * @When("^User enters the adults per room$") public void
	 * user_enters_the_adults_per_room() throws Throwable {
	 * 
	 * SearchHotel sh = new SearchHotel(driver); selectDropDown(sh.getAdults(),
	 * "3 - Three", "text"); }
	 * 
	 * @When("^User enters the children per room$") public void
	 * user_enters_the_children_per_room() throws Throwable { SearchHotel sh = new
	 * SearchHotel(driver); selectDropDown(sh.getChildren(), "1 - One", "text"); }
	 * 
	 * @When("^User clicks the search button$") public void
	 * user_clicks_the_search_button() throws Throwable { SearchHotel sh = new
	 * SearchHotel(driver); clickOnElement(sh.getSearch()); }
	 * 
	 * @When("^User enters a first name$") public void user_enters_a_first_name()
	 * throws Throwable { HotelBooking hb= new HotelBooking(driver);
	 * inputValuetoElement(hb.getFirstName(), "Shermily"); }
	 * 
	 * 
	 * @When("^User enters a last name$") public void user_enters_a_last_name()
	 * throws Throwable { HotelBooking hb= new HotelBooking(driver);
	 * inputValuetoElement(hb.getLastNAme(), "Uma"); }
	 * 
	 * @When("^User enters a billing address$") public void
	 * user_enters_a_billing_address() throws Throwable { HotelBooking hb= new
	 * HotelBooking(driver); inputValuetoElement(hb.getBillingAdd(), "sdfghjk"); }
	 * 
	 * @When("^User enters a credit card no\\.$") public void
	 * user_enters_a_credit_card_no() throws Throwable { HotelBooking hb= new
	 * HotelBooking(driver); inputValuetoElement(hb.getCreditCardNo(),
	 * "1234567890123456"); }
	 * 
	 * @When("^User selects a card type$") public void user_selects_a_card_type()
	 * throws Throwable { HotelBooking hb= new HotelBooking(driver);
	 * selectDropDown(hb.getCardType(), "VISA", "text"); }
	 * 
	 * @When("^User selects a expiry date of month$") public void
	 * user_selects_a_expiry_date_of_month() throws Throwable { HotelBooking hb =
	 * new HotelBooking(driver); selectDropDown(hb.getSelectMonth(), "February",
	 * "text"); }
	 * 
	 * @When("^User selects a expiry date of year$") public void
	 * user_selects_a_expiry_date_of_year() throws Throwable { HotelBooking hb = new
	 * HotelBooking(driver); selectDropDown(hb.getSelectYear(), "2014", "text");
	 * 
	 * }
	 * 
	 * @When("^user enters a cvv number$") public void user_enters_a_cvv_number()
	 * throws Throwable { HotelBooking hb = new HotelBooking(driver);
	 * inputValuetoElement(hb.getCVVNumber(), "765"); }
	 */

}
