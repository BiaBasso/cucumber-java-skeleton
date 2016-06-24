package cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitionsPgTitle {
	
	WebDriver driver = null;

	@Given("^I am on the zoo website$")
	public void i_am_on_the_zoo_website() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/opt/google/chrome/chromedriver");
		driver = new ChromeDriver();
		driver.navigate().to("http://192.168.0.22/Projetos/B/Home.html");
	}

	@When("^I navigate to Adoption$")
	public void i_navigate_to_Adoption() throws Throwable {
	    driver.
	}

	@Then("^I check page title is Adoption$")
	public void i_check_page_title_is_Adoption() throws Throwable {
	    
	}

	@Then("^I close the browser$")
	public void i_close_the_browser() throws Throwable {
	    
	}

	@When("^I navigate to About$")
	public void i_navigate_to_About() throws Throwable {
	    
	}

	@Then("^I check page title is About$")
	public void i_check_page_title_is_About() throws Throwable {
	    
	}

	@When("^I navigate to Contact$")
	public void i_navigate_to_Contact() throws Throwable {
	    
	}

	@Then("^I check page title is Contact$")
	public void i_check_page_title_is_Contact() throws Throwable {
	    
	}
}
