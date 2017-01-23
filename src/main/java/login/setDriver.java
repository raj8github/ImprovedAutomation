package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setDriver {
	
	public static WebDriver Set(){
		System.setProperty("webdriver.chrome.driver", "/Users/rajshashi/Desktop/Prospect/Automation/src/main/java/chromedriver");
		WebDriver driver = new ChromeDriver();
		return driver;
		
	}

}
