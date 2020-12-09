package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	public static WebDriver driver;
	@FindBy(xpath = "//select[@name='location']")
	private WebElement Location;

	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement Hotels;

	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement RoomType;

	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement NoOfRooms;

	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement CheckIn;

	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement CheckOut;

	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement Adults;

	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement Children;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement Search;

	public SearchHotel(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(ldriver, this);
	}

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoomType() {
		return RoomType;
	}

	public WebElement getNoOfRooms() {
		return NoOfRooms;
	}

	public WebElement getCheckIn() {
		return CheckIn;
	}

	public WebElement getCheckOut() {
		return CheckOut;
	}

	public WebElement getAdults() {
		return Adults;
	}

	public WebElement getChildren() {
		return Children;
	}

	public WebElement getSearch() {
		return Search;
	}

}
