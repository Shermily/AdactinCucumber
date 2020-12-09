package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public static WebDriver driver;
	@FindBy(xpath="//input[@type='text']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@type='Submit']")
	private WebElement logIn;
	
	public LoginPage(WebDriver ldriver) {
	this.driver=ldriver;
	PageFactory.initElements(ldriver, this);
	}
	
	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogIn() {
		return logIn;
	}


	
}
