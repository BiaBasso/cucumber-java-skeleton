package testes.util;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class NossoDomDriver {

	WebDriver driver;

	public NossoDomDriver(WebDriver driver) {
		this.driver = driver;
	}

	public void navigateToURL(String URL) {
		driver.navigate().to(URL);
	}

	public String findElementByIdAndReturnText(String id) {
		return driver.findElement(By.id(id)).getText();
	}

	public void findElementByIdAndClick(String id) {
		// driver.findElement(By.id(link.toLowerCase() + "_link")).click();
		driver.findElement(By.id(id)).click();
	}

	public void quit() {
		driver.quit();
	}

	public void findElementByCssSelectorAndClick(String cssSelector) {
		driver.findElement(By.cssSelector(cssSelector)).click();

	}

	public void findElementByNameAndFillWithValue(String name, String value) {
		driver.findElement(By.name(name)).sendKeys(value);

	}

	public static NossoDomDriver buildChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "/opt/google/chrome/chromedriver");
		return new NossoDomDriver(new ChromeDriver());
	}
	
	

	public static NossoDomDriver buildRemoteFirefoxDriver(String gridURL) throws MalformedURLException {
		
		DesiredCapabilities capability = DesiredCapabilities.firefox();
		capability.setBrowserName("firefox");
		capability.setPlatform(Platform.LINUX);
		
		return new NossoDomDriver(new RemoteWebDriver(new URL(gridURL), capability));
	}

}
