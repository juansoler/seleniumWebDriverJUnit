package org.ual.hmis;

// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class UalhmisTest {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;
	@Before
	public void setUp() {
		// driver = new HtmlUnitDriver();
		// Uncomment drivers path to run in Eclipse (next two lines)
		// System.setProperty("webdriver.gecko.driver",  "drivers/geckodriver.exe");
		// System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		// FirefoxOptions firefoxOptions = new FirefoxOptions();
		// firefoxOptions.setHeadless(false);
		// driver = new FirefoxDriver(firefoxOptions);
				
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setHeadless(true);
		driver = new ChromeDriver(chromeOptions);
		
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}
	@After
	public void tearDown() {
		driver.quit();
	}
	  
	  @Test
	  public void ualhmis() {
	    // Test name: ual-hmis
	    // Step # | name | target | value
	    // 1 | open | / | 
	    driver.get("https://www.google.com/");
	    // 2 | setWindowSize | 878x829 | 
	    driver.manage().window().setSize(new Dimension(1280, 829));
	    // 3 | click | name=q | 
	    driver.findElement(By.name("q")).click();
	    // 4 | type | name=q | Universidad de Almeria
	    driver.findElement(By.name("q")).sendKeys("Universidad de Almeria");
	    // 5 | sendKeys | name=q | ${KEY_ENTER}
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	    // 6 | click | xpath=//h3[contains(.,'UAL - Universidad de Almería')] |
	    try {
	        Thread.sleep(1000);
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }
	    driver.findElement(By.xpath("//h3[contains(.,\'UAL - Universidad\')]")).click();
	    // 7 | click | linkText=Estudios | 
	    driver.findElement(By.linkText("Estudios")).click();
	    // 8 | click | linkText=Grados | 
	    try {
	        Thread.sleep(1000);
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }
	    driver.findElement(By.linkText("Grados")).click();
	    // 9 | runScript | window.scrollTo(0,390.3999938964844) | 
	    js.executeScript("window.scrollTo(0,390.3999938964844)");
	    // 10 | click | linkText=Grado en Ingeniería Informática (Plan 2015) | 
	    driver.findElement(By.linkText("Grado en Ingeniería Informática (Plan 2015)")).click();
	    // 11 | click | linkText=Plan de Estudios | 
	    try {
	        Thread.sleep(2000);
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }

	    driver.findElement(By.linkText("Plan de Estudios")).click();
	    // 12 | runScript | window.scrollTo(0,44) | 
	    js.executeScript("window.scrollTo(0,44)");
	    // 13 | click | linkText=Asignaturas ordenadas por cursos | 
	    try {
	        Thread.sleep(2000);
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }
	    
	    driver.findElement(By.linkText("Ordenadas por cursos")).click();
	    // 14 | assertElementPresent | xpath=//strong[contains(.,'Herramientas y Métodos de Ingeniería del Software')] | 
	    try {
	        Thread.sleep(2000);
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }

	    {
	      List<WebElement> elements = driver.findElements(By.xpath("//strong[contains(.,\'Herramientas y Métodos de Ingeniería del Software\')]"));
	      assert(elements.size() > 0);
	    }
	  }

}
