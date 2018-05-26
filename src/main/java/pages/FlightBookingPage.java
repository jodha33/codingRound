package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.BrowserUtility;
import utilities.SeleniumUtility;

public class FlightBookingPage extends SeleniumUtility {

	// Locators
	By oneWayRadioBtn = By.id("OneWay");
	By fromTxt = By.id("FromTag");
	By originUIList = By.id("ui-id-1");
	By originList = By.tagName("li");
	By toText = By.id("ToTag");
	By destUIList = By.id("ui-id-2");
	By destList = By.tagName("li");
	By dateTxt=By.id("DepartDate");
	By datePicker = By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[4]");
	By serachBtn = By.id("SearchBtn");
	By searchSummary=By.className("searchSummary");

	WebDriver driver;

	public FlightBookingPage() {
		driver = BrowserUtility.getDriver();
	}

	public void LoadUrl(String url) {

		driver.get(url);
	}

	public void clickOneWayButton() {
		driver.findElement(oneWayRadioBtn).click();
	}

	public void enterFromLocationTextBox(String location) {
		driver.findElement(fromTxt).sendKeys(location);
		waitForElementVisibility(driver, originUIList, 10);
		List<WebElement> originOptions = driver.findElement(originUIList).findElements(originList);
		originOptions.get(0).click();
	}

	public void enterToLocationTextBox(String location) {
		waitForElementToPresent(driver, toText, 10);
		driver.findElement(toText).sendKeys(location);
		waitForElementVisibility(driver, destUIList, 10);
		List<WebElement> destOptions = driver.findElement(destUIList).findElements(destList);
		destOptions.get(0).click();
	}

	public void selectDate(){
		driver.findElement(dateTxt).click();
		driver.findElement(datePicker).click();
	}
	
	public void clickOnSearchButton(){
		driver.findElement(serachBtn).click();
	}
	
	public boolean searchSummaryIsPresent(){
		
		 try {
			 waitForElementToPresent(driver, searchSummary, 10);
	            driver.findElement(searchSummary);
	            return true;
	        } catch (NoSuchElementException e) {
	            return false;
	        }
	}
}
