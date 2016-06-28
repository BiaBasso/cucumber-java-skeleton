package testes;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	@Given("^I navigate to a site$")
	public void navigateToSite() throws Throwable {
	    System.out.println("Given step was executed");
	}
	
	@When("^I click a button$")
	public void clickButton() throws Throwable {
	    System.out.println("When step was executed");
	}

	@Then("^I check I am on the correct page$")
	public void checkCorrectPage() throws Throwable {
	    System.out.println("Then step was executed");
	}
}
