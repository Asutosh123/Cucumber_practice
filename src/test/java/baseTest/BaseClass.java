package baseTest;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.Loginpage;

public class BaseClass {
	
	public static WebDriver driver;
	public Loginpage login;
	
	  public void openBrowser(String bType)
	  {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
	  }

		public void takeScreenShotFail() {
			// fileName of the screenshot
			Date d = new Date();
			String screenshotFile = d.toString().replace(":", "_").replace(" ", "_") + ".png";
			// store screenshot in that file
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(scrFile,
						new File(System.getProperty("user.dir") + "//screenshots//FailedScreenshot//" + screenshotFile));
			} catch (IOException e) {
				// TODO Auto-generated catcsh block
				e.printStackTrace();
			}
			// put screenshot file in reports
		}
	  
	  
}
