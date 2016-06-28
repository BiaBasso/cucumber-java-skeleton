package testes;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Steps {

	@Given("^I have opened a \"([^\"]*)\" window$")
	public void openAWindow(String window) throws Throwable {
	    System.out.println("Opened a window for " + window);
	}
	
	@When("^I click some link$")
	public void clickLink() throws Throwable {
	    System.out.println("Click on link");
	}

	@Then("^A new window opens$")
	public void checkWindowOpen() throws Throwable {
	    System.out.println("Window should be open");
	}
}
