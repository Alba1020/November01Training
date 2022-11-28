import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeWebDriver implements Browser {
  @Test
  public void LaunchEdgeWebDriver() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Adrian\\Downloads\\Chrome\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.google.com/");	
	  
	  driver.findElement(By.name("q")).sendKeys("How to parse text Java", Keys.ENTER);
			  
  }
}
