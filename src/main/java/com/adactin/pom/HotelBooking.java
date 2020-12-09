package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelBooking {
	public static WebDriver driver;

	@FindBy(xpath="//input[@class='reg_input'][1]")
	private WebElement FirstName;
	
	@FindBy(xpath="(//input[@class='reg_input'])[2]")
	private WebElement LastNAme;
	
	@FindBy(xpath="(//textarea[@name='address'])")	
	private WebElement BillingAdd;
	
	@FindBy(xpath="(//input[@class='reg_input'])[3]")
	private WebElement CreditCardNo;
	
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement CardType;
	
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement SelectMonth;
	
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement SelectYear;

	@FindBy(xpath="//input[@id='cc_cvv']")
	private WebElement CVVNumber;

	@FindBy(xpath="//input[@class='reg_button']")
	private WebElement BookNow;
	
	public HotelBooking(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(ldriver, this);
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastNAme() {
		return LastNAme;
	}

	public WebElement getBillingAdd() {
		return BillingAdd;
	}

	public WebElement getCreditCardNo() {
		return CreditCardNo;
	}

	public WebElement getCardType() {
		return CardType;
	}

	public WebElement getSelectMonth() {
		return SelectMonth;
	}

	public WebElement getSelectYear() {
		return SelectYear;
	}

	public WebElement getCVVNumber() {
		return CVVNumber;
	}

	public WebElement getBookNow() {
		return BookNow;
	}
	
	
}
