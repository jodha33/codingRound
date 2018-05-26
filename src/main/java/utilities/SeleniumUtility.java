package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtility {
	
	
	public void waitForElementToPresent(WebDriver driver,By elt,int time){
		WebDriverWait wait=new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.presenceOfElementLocated(elt));
	}
	
	public void waitForElementVisibility(WebDriver driver,By elt,int time){
		WebDriverWait wait=new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(elt));
	}
	
	public void shortWait() throws InterruptedException{
		Thread.sleep(2000);
	}
	
}
