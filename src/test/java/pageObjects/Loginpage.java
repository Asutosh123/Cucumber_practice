package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends Browserbot {

	public Loginpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	WebElement txtEmail;
 
	@FindBy(id = "password")
	WebElement txtPassword;

	@FindBy(xpath = "//input[@type='submit'][@value='Login']")
	WebElement btnLogin;

	@FindBy(xpath = "//a[text()='Logout']")
	WebElement lnkLogout;
	
	
	public void setUserName(String uname) {
		
		clear(txtEmail);
		type(txtEmail, uname);	
	}
	
	public void setPassword(String pwd) {
		waitForVisible(txtPassword);
		clear(txtPassword);
		type(txtPassword, pwd);
	}

	public void clickLogin() throws Exception {
		click(btnLogin);
	}
	
	public void clickLogout() throws Exception {
		waitForVisible(lnkLogout);
		clickByJS(lnkLogout);
		
	}
	
	
	
	
}
