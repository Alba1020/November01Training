import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import foundation.DriverManagerFactory;
import foundation.TestBase;

public class ProjectTests extends TestBase {
//	private WebDriver driver;

	@Test
	public void RadioButtonSelectImpressive() throws InterruptedException {
		var browserType = "chrome";
		
		this.manager = DriverManagerFactory.getManager(browserType);
		this.manager.createDriver();
		this.driver = this.manager.getDriver();
		
		RadioButtonPage radio1 = new RadioButtonPage(driver);
		radio1.navigate().selectImpressive();
		
		
//		WebElement radio = driver.findElement(By.id("impressiveRadio"));
//		radio.click();
//		Thread.sleep(2000);
		
		
		assertTrue(this.driver != null, "the driver should be launched");
	}
	@Test
	public void RadioButtonSelectYes() throws InterruptedException {
		var browserType = "chrome";
		
		this.manager = DriverManagerFactory.getManager(browserType);
		this.manager.createDriver();
		this.driver = this.manager.getDriver();
		this.driver.get("https://demoqa.com/radio-button");
		this.driver.manage().window().maximize();
		
		
		RadioButtonPage radio1 = new RadioButtonPage(driver);
		radio1.navigate().selectYes();
		Thread.sleep(2000);
		
		
		assertTrue(this.driver != null, "the driver should be launched");
	}
	
	@Test
	public void RadioButtonSelectNo() throws InterruptedException {
		var browserType = "chrome";
		
		this.manager = DriverManagerFactory.getManager(browserType);
		this.manager.createDriver();
		this.driver = this.manager.getDriver();
		this.driver.get("https://demoqa.com/radio-button");
		this.driver.manage().window().maximize();
		
		
		RadioButtonPage radio1 = new RadioButtonPage(driver);
		radio1.navigate().selectNo();
		Thread.sleep(2000);
		
		
		assertTrue(this.driver != null, "the driver should be launched");
	}
	
	@Test
	public void SelectLink() throws InterruptedException {
		var browserType = "chrome";
		
		this.manager = DriverManagerFactory.getManager(browserType);
		this.manager.createDriver();
		this.driver = this.manager.getDriver();
	
		LinksPage link = new LinksPage(driver);

		link.navigate().selectCreateLink();
		Thread.sleep(4000);
		
		assertTrue(this.driver != null, "the driver should be launched");
	}
	
	@Test
	public void setSlider() throws InterruptedException {
		var browserType = "chrome";
		
		this.manager = DriverManagerFactory.getManager(browserType);
		this.manager.createDriver();
		this.driver = this.manager.getDriver();
	
		SliderPage slider = new SliderPage(driver);

		slider.navigate().selectSlider();;
		Thread.sleep(4000);
		
		
		assertTrue(this.driver != null, "the driver should be launched");
	}
	
//	@Test
//	public void RadioButtonSelect() {
//		
//		var driverPath = "C:\\temp\\chromedriver.exe";
//		var url = "https://demoqa.com/radio-button";
//		System.setProperty("webdriver.chrome.driver", driverPath);
//		
//		this.driver = new ChromeDriver();
//		driver.navigate().to(url);
//		var currentUrl = driver.getCurrentUrl();
//		
//		WebElement radio = driver.findElement(By.id("impressiveRadio"));
//		radio.click();
//		
//		assertEquals(currentUrl, url, "if selenium is setup correctly then navigating to the url should be successful.");  
//	}
//	
}
