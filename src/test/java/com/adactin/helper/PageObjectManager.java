package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.BookedItinarey;
import com.adactin.pom.HotelBooking;
import com.adactin.pom.Itinerary;
import com.adactin.pom.LogOut;
import com.adactin.pom.LoginPage;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;

public class PageObjectManager {
	
    public static WebDriver driver;
    
    private LoginPage lp;
	private SearchHotel sh;
	private SelectHotel sel;
	private HotelBooking hb;
	private Itinerary it;
	//private BookedItinarey bitin;

	private LogOut lg;
	
	public PageObjectManager(WebDriver ldriver) {
		this.driver=ldriver;
	}

	
	public LoginPage getLp() {
		lp=new LoginPage(driver);	
		return lp;
	}

	public SearchHotel getSh() {
		sh=new SearchHotel(driver);
		return sh;
	}

	public SelectHotel getSel() {
		sel=new SelectHotel(driver);
		return sel;
	}

	public HotelBooking getHb() {
		hb=new HotelBooking(driver);
		return hb;
	}

	public Itinerary getIt() {
		it=new Itinerary(driver);
		return it;
	}
	


	public LogOut getLg() {
		lg=new LogOut(driver);
		return lg;
	}
	
	
	
	
	
}
