package testes;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testes.pageObject.ContactConfirmPage;
import testes.pageObject.ContactPage;
import testes.pageObject.LandingPage;
import testes.util.NossoAssert;
import testes.util.NossoDomDriver;

public class StepDefinitionZoo {

	NossoDomDriver domDriver;
	
	LandingPage landingPage;
	ContactPage contactPage;
	ContactConfirmPage contactConfirmPage;

	@Given("^I stay on the zoo websites$")
	public void i_stay_on_the_zoo_websites() throws Throwable {
		
		String gridURL = null;
//		gridURL = "http://192.168.0.28:4441/wd/hub";
		
		if (gridURL == null) {
			
			domDriver = NossoDomDriver.buildChromeDriver();
			
		} else {

			domDriver = NossoDomDriver.buildRemoteFirefoxDriver(gridURL);
		}

		landingPage = new LandingPage(domDriver);
		landingPage.navigateToAdocaoZoo();
	}

	@When("^I click the \"([^\"]*)\"$")
	public void i_click_the(String link) throws Throwable {
		Thread.sleep(5000);
		contactPage = landingPage.navigateToContactPage(link + "_link");
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
		Thread.sleep(2000);
		NossoAssert.assertTrue(contactConfirmPage.getPageTitle().contains("Cadastro feito"));
	}

	@And("^I closed the browser$")
	public void i_closed_the_browser() throws Throwable {
		contactConfirmPage.closeDriver();
		domDriver = null;
	}

	@And("^I populate the entire form$")
	public void i_populate_the_entire_form() throws Throwable {
		Thread.sleep(2000);
		contactPage.setNameField("name").setCheckDonation().setRadioEmail().setAddressField("address")
				.setPostcodeField("postcode").setEmailField("email");
	}
}
