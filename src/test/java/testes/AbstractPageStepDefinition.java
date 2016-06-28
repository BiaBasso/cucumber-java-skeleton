package testes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbstractPageStepDefinition {

	protected WebDriver driver;
	
	protected WebDriver getDriver() {
		if(driver == null){
			System.setProperty("webdriver.chrome.driver", "/opt/google/chrome/chromedriver");
			driver = new ChromeDriver();
		}
		return driver;
	}
}
