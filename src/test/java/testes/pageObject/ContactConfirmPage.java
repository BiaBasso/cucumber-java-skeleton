package testes.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactConfirmPage extends ContactPage{

	public ContactConfirmPage(WebDriver driver){
		super(driver);
	}
	
	public String getPageTitle() {
		return driver.findElement(By.id("titulo")).getText();
	}
}
