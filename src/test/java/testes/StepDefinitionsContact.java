package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinitionsContact {
	
	WebDriver driver = null;

	@Given("^I am on my zoo website$")
	public void shouldNavigateToZooSite() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/opt/google/chrome/chromedriver");
		driver = new ChromeDriver();
		driver.navigate().to("http://192.168.0.22/Projetos/B/Home.html");
	}

	@When("^I click on the contact link$")
	public void shouldClickOnContactLink() throws Throwable {
	    driver.findElement(By.id("contact_link")).click();
	}

	@And("^populate the contact form$")
	public void shouldPopulateContactForm() throws Throwable {
	    driver.findElement(By.name("name_field")).sendKeys("Jack Joe");
	    driver.findElement(By.name("address_field")).sendKeys("Happy Land");
	    driver.findElement(By.name("postcode_field")).sendKeys("A1 S22");
	    driver.findElement(By.name("email_field")).sendKeys("iwillsubscribe@tothis.channel");
	    driver.findElement(By.id("submit_message")).click();
	}

	@Then("^I should be on the contact confirmation page$")
	public void checkOnContactConfirmationPage() throws Throwable {
		Assert.assertTrue("Not on contact confirmation page", driver.getTitle().equals("Contact"));
	}
}