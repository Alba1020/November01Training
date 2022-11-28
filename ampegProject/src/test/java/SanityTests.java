import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SanityTests {
	private WebDriver driver;

	@AfterMethod
	public void Cleanup() {
		if(this.driver == null) {
			return;
		}
		this.driver.quit();
	}

	@Test
	public void canLaunchChromeDriver() {
		var driverPath = "C:\\Users\\Adrian\\Downloads\\Chrome\\chromedriver.exe";
		var url = "https://www.selenium.dev/";
		System.setProperty("webdriver.chrome.driver", driverPath);

		this.driver = new ChromeDriver();
		driver.navigate().to(url);
		var currentUrl = driver.getCurrentUrl();

		assertEquals(currentUrl, url, "if selenium is setup correctly then navigating to the url should be successful.");  
	}
}
