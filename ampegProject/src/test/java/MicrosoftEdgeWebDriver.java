import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class MicrosoftEdgeWebDriver implements Browser {
  @Test
  public void LaunchEdgeWebDriver() {
	  System.setProperty("webdriver.edge.driver","C:\\Users\\Adrian\\Downloads\\msedgedriver.exe");
	  
	  WebDriver driver = new EdgeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.google.com/");	
	  
	  driver.findElement(By.name("q")).sendKeys("Selenium.dev", Keys.ENTER);
			  
  }
}
