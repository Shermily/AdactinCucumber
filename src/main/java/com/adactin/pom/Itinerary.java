package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itinerary {
	public static WebDriver driver;

	@FindBy(xpath = "//input[@name='my_itinerary']")
	private WebElement MyItinerary;

	public Itinerary(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(ldriver, this);
	}

	

	public WebElement getMyItinerary() {
		return MyItinerary;
	}
}
