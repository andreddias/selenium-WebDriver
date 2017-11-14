import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

public class Marionette {		
/*
After the Firefox 47 version you have use a driver Gekco, the Marionette.
Do you need follow nexts steps
Download the Marionette Driver (gecko driver)
https://github.com/mozilla/geckodriver/releases
If you use Linux our Mac do you have allows the driver (system administrator root)
chmod +x <nome_driver>
Upload your test scripts
*/
  @BeforeMethod
	public void beforeTest() {	
		System.setProperty("webdriver.gecko.driver", "/home/andredias/Download/geckodriver"); //Download Patch
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		dc.setCapability("marionette", true);
		driver = new FirefoxDriver(dc);		
		driver.get("https://www.google.com.br/");
	}
	
	@Test				
	public void yourClass() {	
		yourCode;
	}
	
	@AfterMethod
	public void afterTest() {
		driver.quit();			
	}		
}	
