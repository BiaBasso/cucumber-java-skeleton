package testes.pageObject;

import testes.util.NossoDomDriver;

public class AbstractPage {

	protected NossoDomDriver domDriver;

	public AbstractPage(NossoDomDriver domDriver) {
		this.domDriver = domDriver;
	}

	public LandingPage navigateToAdocaoZoo() {
		domDriver.navigateToURL("http://192.168.0.29/Projetos/adocaozoo/");

		return new LandingPage(domDriver);
	}

	public void closeDriver() {
		domDriver.quit();
	}
}
