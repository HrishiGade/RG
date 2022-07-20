package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class LoginTest {
	
TestContextSetup testContextSetup;
	
	LoginPage loginPage;
	
	public PageObjectManager pageObjectManager;

	public LoginTest(TestContextSetup testContextSetup) {
		
		this.testContextSetup = testContextSetup;
		this.loginPage = testContextSetup.pageObjectManager.getLoginPage();
		
	}
	
	@Given("User is on Login Page")
	public void user_is_on_login_page() throws InterruptedException {
		
		Assert.assertEquals(loginPage.getTitle().getDomAttribute("alt"), "Live Display");
		Thread.sleep(5000);
		
	}
	
	@When("User enters valid username {string} and password {string}")
	public void user_enters_valid_username_and_password(String uname, String pwd) throws InterruptedException {
		
		loginPage.setUsername(uname);
		loginPage.setPassword(pwd);
		loginPage.clickLoginBtn();
		Thread.sleep(40000);
		 
	}
	@Then("Login should work and User should land on Dashboard")
	public void login_should_work_and_user_should_land_on_dashboard() {
		
		Assert.assertEquals(loginPage.getDashboardPageTitle().getText(), "Dashboard");
	}

}

	
	


