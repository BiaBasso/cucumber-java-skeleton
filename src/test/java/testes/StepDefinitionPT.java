package testes;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import junit.framework.Assert;
import testes.pageObject.ContactConfirmPage;
import testes.pageObject.ContactPage;
import testes.pageObject.LandingPage;

public class StepDefinitionPT extends AbstractPageStepDefinition {

	WebDriver driver = getDriver();
	LandingPage landingPage;
	ContactPage contactPage;
	ContactConfirmPage contactConfirmPage;

	@Dado("^que eu estou no site zoo$")
	public void que_eu_estou_no_site_zoo() throws Throwable {
		landingPage = new LandingPage(driver);
		landingPage.navigateToAdocaoZoo();
	}

	@Quando("^eu clicar em \"([^\"]*)\"$")
	public void eu_clicar_em(String link) throws Throwable {
		Thread.sleep(5000);
		contactPage = landingPage.navigateToContactPage(link);
	}

	@Quando("^eu vou preencher o formulario inteiro$")
	public void eu_vou_preencher_o_formulario_inteiro() throws Throwable {
		Thread.sleep(2000);
		contactPage.setNameField("name").setAddressField("address").setPostcodeField("postcode").setEmailField("email");
	}

	@Quando("^eu envio o formulario de contato$")
	public void eu_envio_o_formulario_de_contato() throws Throwable {
		contactConfirmPage = contactPage.submitForm();
	}

	@Então("^eu devo estar na pagina de confirmacao$")
	public void eu_devo_estar_na_pagina_de_confirmacao() throws Throwable {
		Assert.assertTrue(contactConfirmPage.getPageTitle().contains("Cadastro feito"));
	}

	@Então("^eu fecho o navegador$")
	public void eu_fecho_o_navegador() throws Throwable {
		contactConfirmPage.closeDriver();
	}
}
