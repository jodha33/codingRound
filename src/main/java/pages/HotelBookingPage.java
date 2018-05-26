package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.BrowserUtility;
import utilities.SeleniumUtility;

public class HotelBookingPage extends SeleniumUtility{
	
	@FindBy(xpath="//ul[@id='ui-id-1']/li[2]/a")
	public WebElement whereUiList;
	
	@FindBy(id="CheckInDate")
	public WebElement checkInDateTxt;
	
	@FindBy(xpath="(//table[@class='calendar'])[2]//tbody/tr[2]/td[5]")
	public WebElement checkInDateCalendarLink;
	
	@FindBy(id="CheckOutDate")
	public WebElement CheckOutDateTxt;
	
	@FindBy(xpath="(//table[@class='calendar'])[2]//tbody/tr[4]/td[1]")
	public WebElement checkOutDateCalendarLink;
	
	
    @FindBy(linkText = "Hotels")
    private WebElement hotelLink;

    @FindBy(id = "Tags")
    private WebElement localityTextBox;

    @FindBy(id = "SearchHotelsButton")
    private WebElement searchButton;

    @FindBy(id = "travellersOnhome")
    private WebElement travellerSelection;
	
	
	WebDriver driver;

	public HotelBookingPage() {
		driver = BrowserUtility.getDriver();
		PageFactory.initElements(driver, this);
	}

	public void LoadUrl(String url) {
		driver.get(url);
	}
	
	public void clickOnHotelLink() throws InterruptedException{
		hotelLink.click();
	}
	
	public void checkInDate(){
		checkInDateTxt.click();
		checkInDateCalendarLink.click();
	}
	
	public void checkOutDate(){
		CheckOutDateTxt.click();
		checkOutDateCalendarLink.click();
	}
	
	public void enterLocality(String localityText){
		  localityTextBox.sendKeys(localityText);
		  waitForElementVisibility(driver, whereUiList, 10);
		  whereUiList.click();
	}
	
	public void selectTravellerSection(String travellerTxt){
		 new Select(travellerSelection).selectByVisibleText(travellerTxt);
	}
	
	public void clickOnSerachButton(){
		searchButton.click();
	}
}
