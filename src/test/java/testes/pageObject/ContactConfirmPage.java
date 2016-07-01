package testes.pageObject;

import testes.util.NossoDomDriver;

public class ContactConfirmPage extends ContactPage {

	public ContactConfirmPage(NossoDomDriver domDriver) {
		super(domDriver);
	}

	public String getPageTitle() {
		return domDriver.findElementByIdAndReturnText("titulo");
	}
}
