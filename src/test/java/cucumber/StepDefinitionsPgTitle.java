package cucumber;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionsPgTitle {
	
	WebDriver driver = null;
	
	@Given("^I am on the zoo website$")
	public void shouldNavigateToZoo() throws Throwable {
	}

	@When("^I navigate to \"([^\"]*)\"$")
	public void shouldClickOn(String arg1) throws Throwable {
	}

	@Then("^I check page title is \"([^\"]*)\"$")
	public void i_check_page_title_is(String arg1) throws Throwable {
	}

	@Then("^I close the browser$")
	public void i_close_the_browser() throws Throwable {
	}

	
//	@Given("^I am on the zoo website$")
//	public void i_am_on_the_zoo_website() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "/opt/google/chrome/chromedriver");
//		driver = new ChromeDriver();
//		driver.navigate().to("http://192.168.0.22/Projetos/B/Home.html");
//	}
//
//	@When("^I navigate to Home$")
//	public void i_navigate_to_Home() throws Throwable {
//	    driver.findElement(By.id("home_link")).click();
//	}
//
//	@Then("^I check page title is Home$")
//	public void i_check_page_title_is_Home() throws Throwable {
//	    Assert.assertTrue(driver.getTitle().contains("Home"));
//	}
//
//	@When("^I navigate to Adoption$")
//	public void i_navigate_to_Adoption() throws Throwable {
//	    driver.findElement(By.id("adoption_link")).click();
//	}
//
//	@Then("^I check page title is Adoption$")
//	public void i_check_page_title_is_Adoption() throws Throwable {
//	    Assert.assertTrue(driver.getTitle().contains("Adoption"));
//	}
//
//	@When("^I navigate to About$")
//	public void i_navigate_to_About() throws Throwable {
//	    driver.findElement(By.id("about_link")).click();
//	}
//
//	@Then("^I check page title is About$")
//	public void i_check_page_title_is_About() throws Throwable {
//	    Assert.assertTrue(driver.getTitle().contains("About"));
//	}
//
//	@When("^I navigate to Contact$")
//	public void i_navigate_to_Contact() throws Throwable {
//	   driver.findElement(By.id("contact_link")).click();
//	}
//
//	@Then("^I check page title is Contact$")
//	public void i_check_page_title_is_Contact() throws Throwable {
//	    Assert.assertTrue(driver.getTitle().contains("Contact"));
//	}
//	
//	@And("^I close the browser$")
//	public void i_close_the_browser() throws Throwable {
//	    driver.close();
//	}
}
