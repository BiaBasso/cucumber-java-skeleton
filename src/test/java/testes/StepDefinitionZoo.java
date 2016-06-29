package testes;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import testes.pageObject.ContactConfirmPage;
import testes.pageObject.ContactPage;
import testes.pageObject.LandingPage;

public class StepDefinitionZoo extends AbstractPageStepDefinition {

	WebDriver driver = getDriver();
	LandingPage landingPage;
	ContactPage contactPage;
	ContactConfirmPage contactConfirmPage;
	

	@Given("^I stay on the zoo websites$")
	public void i_stay_on_the_zoo_websites() throws Throwable {
		landingPage = new LandingPage(driver);
		landingPage.navigateToAdocaoZoo();
	}

	@When("^I click the \"([^\"]*)\"$")
	public void i_click_the(String link) throws Throwable {
		 Thread.sleep(5000);
		 contactPage = landingPage.navigateToContactPage(link);
	}

	@And("^I enter \"([^\"]*)\" into the name field$")
	public void i_enter_into_the_name_field(String value) throws Throwable {
		 Thread.sleep(1000);
		 contactPage.setNameField(value);
	}

	@And("^I enter \"([^\"]*)\" into the address field$")
	public void i_enter_into_the_address_field(String value) throws Throwable {
		 Thread.sleep(1000);
		 contactPage.setAddressField(value);
	}

	@And("^I enter \"([^\"]*)\" into the postcode field$")
	public void i_enter_into_the_postcode_field(String value) throws Throwable {
		 Thread.sleep(1000);
		contactPage.setPostcodeField(value);
	}

	@And("^I enter \"([^\"]*)\" into the email field$")
	public void i_enter_into_the_email_field(String value) throws Throwable {
		 Thread.sleep(1000);
		 contactPage.setEmailField(value);
	}

	@And("^I submit the contact form$")
	public void i_submit_the_contact_form() throws Throwable {
		contactConfirmPage = contactPage.submitForm();
	}

	@Then("^I checked I am on the confirmation page$")
	public void i_checked_I_am_on_the_confirmation_page() throws Throwable {
		Assert.assertTrue(contactConfirmPage.getPageTitle().contains("We have your message"));
	}

	@And("^I closed the browser$")
	public void i_closed_the_browser() throws Throwable {
		contactConfirmPage.closeDriver();
	}
}