package exemplo;

import java.awt.AWTException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Viagem {
	private static WebDriver driver;
	static WebDriverWait wait;

	@BeforeMethod
	public void beforeTest() {	
		System.setProperty("webdriver.gecko.driver", "/home/andredias/eclipse-workspace/geckodriver");
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		dc.setCapability("marionette", true);
		driver = new FirefoxDriver(dc);		
		wait = new WebDriverWait(driver, 10);
	}

	@Test
	public void ViajaNet() throws InterruptedException, SQLException, FileNotFoundException, IOException, AWTException{
		driver.get("https://www.viajanet.com.br/busca/voos-resultados#/RIO/POA/RT/15-07-2018/21-07-2018/-/-/-/2/1/0/-/-/-/-");
		String idResultado = "vn-best-cost_wrapper";
		String site = "Viaja Net";
		BestPrice(site, idResultado);
	}		

	@Test
	public void Decolar() throws InterruptedException, SQLException, FileNotFoundException, IOException, AWTException{ 
		driver.get("https://www.decolar.com/shop/flights/results/roundtrip/RIO/POA/2018-07-15/2018-07-21/2/C/0?from=SB");
		String idResultado = "matrix-container";
		String site = "Decolar";
		BestPrice(site, idResultado);
	}

	public static void BestPrice(String site, String resultado) {
		wait.until(ExpectedConditions.elementToBeClickable(By.className(resultado)));
		String melhoresTarifas = driver.findElement(By.className(resultado)).getText();
		PrintToTxt(site, melhoresTarifas);
	}

	public static void PrintToTxt(String site, String conteudo) {
		String idForTxtFile = new SimpleDateFormat("dd.MM.yyyy_HH.mm.ss").format(new Date());
		File file = new File(site + idForTxtFile);
		try {
			FileWriter fw = new FileWriter(file, true);
			fw.write(conteudo);
			fw.flush();
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getLocalizedMessage());
		}
	}

	@AfterMethod
	public void afterClass() {
		driver.quit();
	}
}
