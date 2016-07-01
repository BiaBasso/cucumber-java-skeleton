package testes.pageObject;

import testes.util.NossoDomDriver;

public class LandingPage extends AbstractPage{

	public LandingPage (NossoDomDriver domDriver) {
		super(domDriver);
	}
	
	public ContactPage navigateToContactPage(String id) {
		domDriver.findElementByIdAndClick(id);
	    return new ContactPage(domDriver);
	}
}
