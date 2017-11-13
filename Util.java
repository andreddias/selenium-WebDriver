package system;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util implements Mapping{
	
	private WebDriver driver;
	private WebDriverWait wait;
	private JavascriptExecutor jsExecutor;
	
	public Util(WebDriver driver){
		this.driver = driver;
		this.wait = new WebDriverWait(this.driver, 20);
		this.jsExecutor = (JavascriptExecutor)driver;
	}
	
	public static void login(WebDriver driver, String url, String login, String senha) throws InterruptedException{
		driver.get(url);
		driver.findElement(By.xpath(MENU)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(BTNLOGIN)).click();
		Thread.sleep(2000);

		driver.switchTo().frame(driver.findElement(By.className("iframe")));
		driver.findElement(By.xpath(FIELDLOGIN)).sendKeys(login);
		driver.findElement(By.xpath(FIELDPASSWORD)).sendKeys(senha);
		driver.findElement(By.xpath(BTNENTER)).click();
		driver.findElement(By.xpath(MENU)).click();
	}
	
	public void acessarMenuSegundaVia() throws IOException, InterruptedException{
		driver.findElement(By.xpath(MENU2)).click();
		WebElement elemLink = driver.findElement(By.partialLinkText("Solicitar segunda via de"));		
		jsExecutor.executeScript("arguments[0].click();", elemLink);		
	}
	
}
