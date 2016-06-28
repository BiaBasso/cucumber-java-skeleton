package testes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
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
	public void submitContactForm(DataTable table) throws Throwable {
		
		//System.out.println(table);
		
		List<List<String>> data = table.raw();
		
		System.out.println(data.get(1).get(1));
		
	    driver.findElement(By.name("name_field")).sendKeys(data.get(1).get(1));
	    driver.findElement(By.name("address_field")).sendKeys(data.get(2).get(1));
	    driver.findElement(By.name("postcode_field")).sendKeys(data.get(3).get(1));
	    driver.findElement(By.name("email_field")).sendKeys(data.get(4).get(1));
	    driver.findElement(By.id("submit_message")).click();
	}

	@Then("^I check that the form has been submitted$")
	public void checkConfirmationPage() throws Throwable {
	    Assert.assertTrue(driver.getTitle().equals("Contact"));
	    driver.quit();
	}
}
