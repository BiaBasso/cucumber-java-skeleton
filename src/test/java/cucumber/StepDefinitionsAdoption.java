package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinitionsAdoption {

	WebDriver driver = null;

	@Given("^I am on the zoo sites$")
	public void navigateToZoo() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/opt/google/chrome/chromedriver");
		driver = new ChromeDriver();
		driver.navigate().to("http://192.168.0.24/Projetos/B/Home.html");
	}

	@When("^I navigate to adoption$")
	public void navigateToAdoption() throws Throwable {
		driver.findElement(By.id("adoption_link")).click();
	}

	@And("^I check for an available animal$")
	public void checkForAnimal() throws Throwable {
		driver.findElement(By.id("check_btn_02")).click();
	}

	@And("^I populate the form$")
	public void populateForm() throws Throwable {
		driver.findElement(By.name("name_field")).sendKeys("name value");
		driver.findElement(By.name("address_field")).sendKeys("address_value");
		driver.findElement(By.name("postcode_field")).sendKeys("postcode_value");
		driver.findElement(By.name("email_field")).sendKeys("email_value");
		driver.findElement(By.name("submit_adoption")).click();
	}

	@Then("^There should be a confirmation message$")
	public void checkConfirmMessage() throws Throwable {
		Assert.assertTrue(driver.findElement(By.tagName("p")).getText().contains("YOUR ADOPTION HAS BEEN SET UP"));
		driver.quit();
	}
}
