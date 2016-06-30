package testes.pageObject;

import org.openqa.selenium.WebDriver;

public class AbstractPage {

	protected WebDriver driver;
	
	public AbstractPage (WebDriver driver){
		this.driver = driver;
	}
	
	public LandingPage navigateToAdocaoZoo(){
		driver.navigate().to("http://192.168.0.29/Projetos/adocaozoo/");
		return new LandingPage(driver);
	}
	
	public void closeDriver() {
		driver.quit();
	}
}
