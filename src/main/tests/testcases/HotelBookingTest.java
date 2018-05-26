package testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HotelBookingPage;
import utilities.BrowserUtility;

public class HotelBookingTest {

	HotelBookingPage hotelBookingPage;
	

	@Test
	 public void shouldBeAbleToSearchForHotels() throws InterruptedException{
		hotelBookingPage=new HotelBookingPage();
		hotelBookingPage.LoadUrl("http://www.cleartrip.com");
		hotelBookingPage.clickOnHotelLink();
		hotelBookingPage.enterLocality("Indiranagar, Bangalore");
		hotelBookingPage.checkInDate();
		hotelBookingPage.checkOutDate();
		hotelBookingPage.selectTravellerSection("1 room, 1 adult");
		hotelBookingPage.clickOnSerachButton();
	}
	
	

}
