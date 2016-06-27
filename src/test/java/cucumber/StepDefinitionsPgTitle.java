package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinitionsPgTitle {

	WebDriver driver = null;

	@Given("^I am on the zoo website$")
	public void shouldNavigateToZoo() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/opt/google/chrome/chromedriver");
		driver = new ChromeDriver();
		driver.navigate().to("http://192.168.0.24/Projetos/B/Home.html");
	}
	
	@And("^I close the browser$")
	public void closeBrowser() throws Throwable {
		driver.close();
	}

	@When("^I click on ([^\"]*)$")
	public void ClickOnLink(String link) throws Throwable {
		driver.findElement(By.id(link)).click();
	}

	@Then("^I Check I am on ([^\"]*)$")
	public void checkPageTitle(String title) throws Throwable {
		Assert.assertTrue(driver.getTitle().contains(title));
	}


}
