import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonPage {
	WebDriver driver;
	
	By yesRadioButton = By.id("yesRadio");
	By impressiveRadio = By.id("impressiveRadio");
	By noRadioButton = By.id("noRadio");
	
	public RadioButtonPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public RadioButtonPage navigate() {
		this.driver.manage().window().maximize();
		this.driver.get("https://demoqa.com/radio-button");
		
		return this;
	}
	
	public void selectYes() {
		driver.findElement(yesRadioButton).click();
	}
	
	public void selectImpressive() {
		driver.findElement(impressiveRadio).click();
	}
	
	public void selectNo() {
		driver.findElement(noRadioButton).click();
	}
	
}
