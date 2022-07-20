package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
public WebDriver driver;
	
	public WebDriver WebDriverManager(){
		
		if(driver == null) {
		System.setProperty("webdriver.chrome.driver", "/home/excellarate/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://invue-live-admin-qa.web.app"); 
		driver.manage().window().maximize();
		
		}
		
		return driver;
	}

}
