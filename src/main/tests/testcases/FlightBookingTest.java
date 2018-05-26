package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FlightBookingPage;
import utilities.BrowserUtility;

public class FlightBookingTest {


	FlightBookingPage flightBookingPage;

	@BeforeTest
	public void setFirstTimeBrowser(){
		BrowserUtility.setDriver();
	}

	
	
	public void testThatResultsAppearForAOneWayJourney(){
		flightBookingPage=new FlightBookingPage();
		flightBookingPage.LoadUrl("http://www.cleartrip.com");
		flightBookingPage.clickOneWayButton();
		flightBookingPage.enterFromLocationTextBox("Bangalore");
		flightBookingPage.enterToLocationTextBox("Delhi");
		flightBookingPage.selectDate();
		flightBookingPage.clickOnSearchButton();
		Assert.assertTrue(flightBookingPage.searchSummaryIsPresent());
	}
	
	
	@AfterTest
	public void afterTestMethod(){
		BrowserUtility.closeDriver();
	}
	

	
}
