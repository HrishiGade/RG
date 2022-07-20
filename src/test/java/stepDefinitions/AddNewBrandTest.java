package stepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.utility.RandomString;
import pageObjects.BrandPage;
import pageObjects.LoginPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;


public class AddNewBrandTest {
	
	TestContextSetup testContextSetup;
	
	public PageObjectManager pageObjectManager;
	
	BrandPage brandpage;
	
	Actions action;
	
	String BrandName = "Test Brand" + RandomString.make(8);
	
	public AddNewBrandTest(TestContextSetup testContextSetup) {
		
		//this.testContextSetup = testContextSetup;
		brandpage = testContextSetup.pageObjectManager.getBrandPage();
		action = testContextSetup.pageObjectManager.getAction();
		
	}

	
	@Then("User navigates to Add New Brand screen")
	public void user_is_on_add_new_brand_screen() throws InterruptedException {
		 
		 action.moveToElement(brandpage.getHamburgerMenu()).perform();
		 Thread.sleep(5000);
		 
		 brandpage.SelectConfiguration();
		 Thread.sleep(1000);
		 
		 brandpage.selectBrand();
		 Thread.sleep(3000);
		
		 Assert.assertEquals(brandpage.getPageTitle().getText(), "Brands");
		 
		 brandpage.ClickAddNewBtn();
		 Thread.sleep(3000);
			 
	    
	}
	@And("User enters Brand Name and clicks on Save")
	public void user_enters_brand_name_and_clicks_on_save() throws InterruptedException {
		 
		brandpage.getBrandNameField().sendKeys(BrandName);
		Thread.sleep(2000);
		brandpage.ClickSaveBtn();
	    Thread.sleep(15000); 
	         
	}


	@Then("New Brand should get added and reflect on Brands List")
	public void new_brand_should_get_added_and_reflect_on_brands_list() throws InterruptedException {
		
		brandpage.getSearchBar().sendKeys(BrandName); 
	    Thread.sleep(1000);
		    	 
		    if(brandpage.getPageSource().contains(BrandName)) {
		    	 Assert.assertTrue(true);
		     }
		     else {
		    	 Assert.assertTrue(false);
		     }
		   
	    
	}
	
}
