package stepDefinitions;

import org.openqa.selenium.WebDriver;

import baseTest.BaseClass;
import cucumber.api.java.en.Given;
import pageObjects.Loginpage;

public class StepLogin extends BaseClass {

	WebDriver driver;
	
	public StepLogin()
	{
		driver = Hooks.driver;
	    login = new Loginpage(driver);
	}
	
	@Given("^User Launch Chrome browser$")
	public void user_Launch_Chrome_browser() throws Throwable {
		//navigate("appurl");
		login.setUserName("marybang");
		login.setPassword("password");
		login.clickLogin();
	    
	}

}
