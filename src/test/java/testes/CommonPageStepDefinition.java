package testes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CommonPageStepDefinition extends AbstractPageStepDefinition {
	
	WebDriver driver = getDriver();

	@Given("^I am on the zoo websites$")
	public void i_am_on_the_zoo_websites() throws Throwable {
		driver.navigate().to("http://192.168.0.24/Projetos/B/");
	}

	@When("^I click onn \"([^\"]*)\"$")
	public void i_click_onn(String link) throws Throwable {
		Thread.sleep(5000);
		driver.findElement(By.id(link.toLowerCase() + "_link")).click();
	}

	@Then("^I quit the browser$")
	public void quitBrowser() throws Throwable {
		driver.quit();
	}
}
