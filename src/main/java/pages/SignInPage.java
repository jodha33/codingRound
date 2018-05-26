package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.BrowserUtility;
import utilities.SeleniumUtility;

public class SignInPage extends SeleniumUtility {

	WebDriver driver;

    By signInButton=By.id("signInButton");
    By errorMessage=By.id("errors1");
	
	public SignInPage() {
		driver = BrowserUtility.getDriver();
	}
	
	public void clickOnSignInButton(){
		driver.switchTo().frame("modal_window");
		waitForElementToPresent(driver, signInButton, 10);
		driver.findElement(signInButton).click();
	}
	
	public String getErrorMessageAfterClickingSignInButton(){
		String str=driver.findElement(errorMessage).getText();
		return str;
	}
}
