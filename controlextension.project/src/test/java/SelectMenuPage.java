
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	
public class SelectMenuPage {

		WebDriver driver;
		
		By selectMenu = By.id("oldSelectMenu");

		
		public SelectMenuPage(WebDriver driver) {
			this.driver = driver;
		}
		
		public SelectMenuPage navigate() {
			this.driver.manage().window().maximize();
			this.driver.get("https://demoqa.com/select-menu");
			
			return this;
		}
		
		public void selectSlider() {
			driver.findElement(selectMenu);
		}
}