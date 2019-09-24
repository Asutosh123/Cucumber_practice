package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browserbot {

	
	public static WebDriver driver;
	
	public Browserbot(WebDriver driver)
	{
	    this.driver=driver;
	}
	
	
	public static void Wait(int timeOutSec) throws Exception {
		Thread.sleep(timeOutSec*1000);
}
	
	public static void click(WebElement element) throws Exception{
		
		 element.click();	 
		
	}
	
	public void clear(WebElement element){
		element.clear();
	}
	
	public static void type(WebElement element,String value){
		
		element.sendKeys(value);
		
	}
	
   public void clickByJS(WebElement element) throws Exception {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",element);
	}
   public static void waitForVisible(WebElement element){
	
	new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(element));
}
  public void waitForVisible(WebElement element,long timeOutInSeconds){
	new WebDriverWait(driver, timeOutInSeconds).until(ExpectedConditions.visibilityOf(element));
}

}
