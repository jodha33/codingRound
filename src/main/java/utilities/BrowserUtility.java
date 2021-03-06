package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.javafx.PlatformUtil;

public class BrowserUtility {

	private static WebDriver driver;
		
	public static void setDriver(){
		setDriverPath();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static WebDriver getDriver(){
		return driver;
	}
	
    private static void setDriverPath() {
        if (PlatformUtil.isMac()) {
            System.setProperty("webdriver.chrome.driver", "./lib/chromedriver");
        }
        if (PlatformUtil.isWindows()) {
            System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
        }
        if (PlatformUtil.isLinux()) {
            System.setProperty("webdriver.chrome.driver", "./lib/chromedriver_linux");
        }
    }
    
    public static void closeDriver(){
    	driver.close();
    }
}
