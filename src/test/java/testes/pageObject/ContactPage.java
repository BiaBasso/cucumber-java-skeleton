package testes.pageObject;

import testes.util.NossoDomDriver;

public class ContactPage extends AbstractPage {

	public ContactPage(NossoDomDriver domDriver) {
		super(domDriver);
	}

	public ContactPage setNameField(String value) {
		domDriver.findElementByNameAndFillWithValue("name_field", value);
		return new ContactPage(domDriver);
	}

	public ContactPage setCheckDonation() {
		domDriver.findElementByCssSelectorAndClick("label[for='checkbox-2'] .mdl-checkbox__ripple-container");
		return new ContactPage(domDriver);
	}

	public ContactPage setRadioEmail() {
		domDriver.findElementByCssSelectorAndClick("label[for='option-2'] .mdl-radio__ripple-container");
		return new ContactPage(domDriver);
	}

	public ContactPage setAddressField(String value) {
		domDriver.findElementByNameAndFillWithValue("address_field", value);
		return new ContactPage(domDriver);
	}

	public ContactPage setPostcodeField(String value) {
		domDriver.findElementByNameAndFillWithValue("postcode_field", value);
		return new ContactPage(domDriver);
	}

	public ContactPage setEmailField(String value) {
		domDriver.findElementByNameAndFillWithValue("email_field", value);
		return new ContactPage(domDriver);
	}

	public ContactConfirmPage submitForm() {
		domDriver.findElementByIdAndClick("submit_message");
		return new ContactConfirmPage(domDriver);
	}
}
