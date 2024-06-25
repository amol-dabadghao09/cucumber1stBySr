package qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	
	static WebDriver driver;
	
	public WebDriver initBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amol\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver ;
	}
	
	public static WebDriver getDriver() {
		
		return driver ; 
	}
	
	
	

}
