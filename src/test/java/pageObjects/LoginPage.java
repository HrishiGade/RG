package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	}

    By login = By.xpath("//*[@id=\"userName\"]");
	
	By password = By.xpath("//*[@id=\"password\"]");
	
	By loginBtn = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/form/button/span[1]");
	
	By LandingPageTitle = By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/img[2]"); 
	
	By DashboardPageTitle = By.className("page-title");
	
	
	public WebElement getTitle() {
		   
		   return driver.findElement(LandingPageTitle);
	    }
    
	public void setUsername(String name) {
		
	  driver.findElement(login).sendKeys(name);
	}
	
	public void setPassword(String pwd) {
		
	  driver.findElement(password).sendKeys(pwd);
		  
	}
	
	public void clickLoginBtn(){
		
		driver.findElement(loginBtn).click();
	}	
	
	public WebElement getDashboardPageTitle(){
		
		return driver.findElement(DashboardPageTitle);
	}
	
	
	
	
	

}
