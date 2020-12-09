package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {
	
	public static WebDriver driver;
	@FindBy(xpath = "//input[@value='Logout']")
	private WebElement Logout;

	public LogOut(WebDriver ldriver) {

		this.driver = ldriver;
		PageFactory.initElements(ldriver, this);
	}

	public WebElement getLogout() {
		return Logout;
	}
}
