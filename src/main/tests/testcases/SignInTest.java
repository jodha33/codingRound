package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.FlightBookingPage;
import pages.SignInPage;

public class SignInTest {

	SignInPage signInPage;
	FlightBookingPage flightBookingPage;
	
	@Test
	public void shouldThrowAnErrorIfSignInDetailsAreMissing(){
		signInPage= new SignInPage();
		flightBookingPage=new FlightBookingPage();
		flightBookingPage.LoadUrl("http://www.cleartrip.com");
		flightBookingPage.clickOnYourTripLink();
		flightBookingPage.clickOnSignInButton();
		signInPage.clickOnSignInButton();
		Assert.assertTrue(signInPage.getErrorMessageAfterClickingSignInButton().contains("There were errors in your submission" ));
	
	}
	
}
