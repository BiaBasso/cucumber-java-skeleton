package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinitionsSubmit {

	WebDriver driver = null;
	
	@Given("^I am on the zoo site$")
	public void navigateToZoo() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/opt/google/chrome/chromedriver");
		driver = new ChromeDriver();
		driver.navigate().to("http://192.168.0.24/Projetos/B/Home.html");
	}

	@When("^I navigate to contact$")
	public void navigateToContact() throws Throwable {
	    driver.findElement(By.id("contact_link")).click();
	}

	@And("^I submit the form with valid data$")
	public void i_submit_the_form_with_valid_data() throws Throwable {
	    driver.findElement(By.name("name_field")).sendKeys("name value");
	    driver.findElement(By.name("address_field")).sendKeys("address value");
	    driver.findElement(By.name("postcode_field")).sendKeys("postcode value");
	    driver.findElement(By.name("email_field")).sendKeys("email value");
	    driver.findElement(By.id("submit_message")).click();
	}

	@Then("^I check that the form has been submitted$")
	public void checkConfirmationPage() throws Throwable {
	    Assert.assertTrue(driver.getTitle().equals("Contact Confirmation"));
	}
}
