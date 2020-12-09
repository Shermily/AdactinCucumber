package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	public static WebDriver driver;
	@FindBy(xpath="//input[@type='radio']")
	private WebElement Select;
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement Continue;
	
	public SelectHotel(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(ldriver, this);

	}

	public WebElement getSelect() {
		return Select;
	}

	public WebElement getContinue() {
		return Continue;
	}
	
}
