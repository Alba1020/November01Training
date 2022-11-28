import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxWebDriver implements Browser {
  @Test
  public void LaunchFirefoxDriver() {
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Adrian\\Downloads\\geckodriver.exe");
	  
	  WebDriver driver = new FirefoxDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.google.com/");
	  
	  driver.findElement(By.name("q")).sendKeys("Microsoft Edge webdriver download", Keys.ENTER);
  }
}
