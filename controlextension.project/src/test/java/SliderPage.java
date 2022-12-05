
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	
public class SliderPage {

		WebDriver driver;
		
		By slider = By.className("range-slider range-slider--primary");

		
		public SliderPage(WebDriver driver) {
			this.driver = driver;
		}
		
		public SliderPage navigate() {
			this.driver.manage().window().maximize();
			this.driver.get("https://demoqa.com/slider");
			
			return this;
		}
		
		public void selectSlider() {
			driver.findElement(slider);
		}
}