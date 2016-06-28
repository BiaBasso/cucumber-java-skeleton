package testes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinitionsAdoption {

	WebDriver driver = null;

	/*
	 * @Before public void testSetUp(){ System.out.println(
	 * "Before method executed");
	 * System.setProperty("webdriver.chrome.driver",
	 * "/opt/google/chrome/chromedriver"); driver = new ChromeDriver(); }
	 * 
	 * @After public void testShutDown(){ System.out.println(
	 * "After method executed"); driver.quit(); }
	 */
	@Before("@web")
	public void testSetUpWeb() {
		System.out.println("Before method with web tag executed");
		System.setProperty("webdriver.chrome.driver", "/opt/google/chrome/chromedriver");
		driver = new ChromeDriver();
	}

	@After("@web")
	public void testShutDownWeb() {
		System.out.println("After method with web tag executed");
		driver.quit();
	}

	@Given("^I am on the zoo sites$")
	public void navigateToZoo() throws Throwable {
		driver.navigate().to("http://192.168.0.24/Projetos/B/Home.html");
	}

	@When("^I navigate to adoption$")
	public void navigateToAdoption() throws Throwable {
		driver.findElement(By.id("adoption_link")).click();
	}

	@And("^I check for an available animal$")
	public void checkForAnimal() throws Throwable {
		Thread.sleep(5000);
		driver.findElement(By.id("check_btn_02")).click();
	}

	@And("^I populate the form$")
	public void populateForm() throws Throwable {
		driver.findElement(By.name("name_field")).sendKeys("name value");
		driver.findElement(By.name("address_field")).sendKeys("address_value");
		driver.findElement(By.name("postcode_field")).sendKeys("postcode_value");
		driver.findElement(By.name("email_field")).sendKeys("email_value");
		driver.findElement(By.id("submit_adoption")).click();
	}

	@Then("^There should be a confirmation message$")
	public void checkConfirmMessage() throws Throwable {
		Assert.assertTrue(driver.getTitle().contains("Contact"));
	}
}
