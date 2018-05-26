package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.BrowserUtility;

public class FlightBookingTest {

	BrowserUtility browserUtility;
	WebDriver driver;
	public FlightBookingTest() {
		browserUtility=new BrowserUtility();
		
	}
	
	@BeforeTest
	public void beforeTestMethod(){
		browserUtility.setDriver();
		driver=browserUtility.getDriver();
	}
	
	@Test
	public void testThatResultsAppearForAOneWayJourney(){
		driver.get("http://www.google.com");
	}
	
	@AfterTest
	public void afterTestMethod(){
		browserUtility.closeDriver();
	}
	
}
