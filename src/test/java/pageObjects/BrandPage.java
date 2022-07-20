package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.utility.RandomString;

public class BrandPage {
	
public WebDriver driver;
	
	public BrandPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
    By HamburgerMenu = By.xpath("//button[@id='header-show-menu-H2HUI']");
	
	By MainMenu = By.xpath("//*[@id=\"menu-left\"]/ul/li");
	
	By SubMenu = By.xpath("//*[@id=\"menu-left\"]/ul/li[2]/div[2]/div/div/div/a");
	
	By AddNewBtn = By.xpath("//*[@id=\"brands-add-brand-btn\"]");
	
	By BrandName = By.xpath("//*[@id=\"brand-form-name-field\"]");
	
	By SaveBtn = By.xpath("//*[@id=\"brand-form-submit-btn\"]");
	
	By SearchBar = By.xpath("//*[@id=\"search-field\"]");
	
	By PageTitle = By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[2]/div[1]/h3");
	
	By BrandTableCol1 = By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[2]/div[3]/table/tbody/tr[1]/td[1]");
	
	
	
	  public WebElement getHamburgerMenu() {
	  
	  return (driver.findElement(HamburgerMenu));
	  
	  }
	 
	
	
	public WebElement getPageTitle() {
		
		return (driver.findElement(PageTitle));
	}
	
    public void SelectConfiguration() {
    	
    //Select Menu option Configuration	
	
    List<WebElement> MainMenu1 = driver.findElements(MainMenu);
    		
   	 for(WebElement M: MainMenu1) {
   		 
   		 if(M.getText().contains("CONFIGURATION")) {
   			 
   			 M.click();
   			 break;
   			 
   		 }}}
    
    public void selectBrand() {
    	
    //Select sub menu option Brand
   	 
    List<WebElement> SubMenu1 = driver.findElements(SubMenu);
   	 
   	 for(WebElement S: SubMenu1) {
   		 
   		 if(S.getText().contains("BRANDS")) {
   			 
   			 S.click();
   			 break;
   			
   		 }}}
	
    public void ClickAddNewBtn() {
		
    	driver.findElement(AddNewBtn).click();
	}
    
    public WebElement getBrandNameField() {
		
		return (driver.findElement(BrandName));
	}
	
    public void ClickSaveBtn() {
		
    	driver.findElement(SaveBtn).click();
	}
	
    public WebElement getSearchBar() {
		
		return (driver.findElement(SearchBar));
	}
    
    public String getPageSource() {
    	
    	return (driver.getPageSource());
    }
    
    
   
}
