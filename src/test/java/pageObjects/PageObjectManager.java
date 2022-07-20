package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class PageObjectManager {
	
public WebDriver driver;
	
	public LoginPage loginpage;
	public BrandPage brandpage;
    public Actions action;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public LoginPage getLoginPage() {
		
		loginpage = new LoginPage(driver);
		return loginpage;
	}
	
    public BrandPage getBrandPage() {
		
		brandpage = new BrandPage(driver);
		return brandpage;
	}

	
	public Actions getAction() {
		
		action = new Actions(driver);
		return action;
		
	}
	
	
	


}
