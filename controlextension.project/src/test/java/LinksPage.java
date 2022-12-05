
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	
public class LinksPage {

		WebDriver driver;
		
		By link = By.id("created");

		
		public LinksPage(WebDriver driver) {
			this.driver = driver;
		}
		
		public LinksPage navigate() {
			this.driver.manage().window().maximize();
			this.driver.get("https://demoqa.com/links");
			
			return this;
		}
		
		public void selectCreateLink() {
			driver.findElement(link).click();
		}


}
