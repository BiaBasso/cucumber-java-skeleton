package testes;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = {"pretty", "html:target/html/"}, 
	features = "src/test/resources/testes/features",
	tags = {"@Tag02"})
public class CucumberRunnerTestTag02 extends AbstractTestNGCucumberTests {

}
