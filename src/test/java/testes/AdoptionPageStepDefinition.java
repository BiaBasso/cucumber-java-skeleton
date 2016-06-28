package testes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;

public class AdoptionPageStepDefinition {

	WebDriver driver;

	@Then("^I set the start date to \"([^\"]*)\"$")
	public void i_set_the_start_date_to(String dropItem) throws Throwable {
		Thread.sleep(5000);
		Select dropDown = new Select(driver.findElement(By.id("start_select")));
		dropDown.selectByVisibleText(dropItem);
	}
}
