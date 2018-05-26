package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.javafx.PlatformUtil;

public class BrowserUtility {

	private WebDriver driver;
		
	public void setDriver(){
		setDriverPath();
		driver=new ChromeDriver();
	}
	
	public WebDriver getDriver(){
		return driver;
	}
	
    private void setDriverPath() {
        if (PlatformUtil.isMac()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver");
        }
        if (PlatformUtil.isWindows()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        }
        if (PlatformUtil.isLinux()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver_linux");
        }
    }
    
    public void closeDriver(){
    	driver.close();
    }
}
