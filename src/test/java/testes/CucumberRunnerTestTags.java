package testes;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = {"pretty", "html:target/html/"}, 
	features = "src/test/resources/testes/features",
	tags = {"@Tag01, @Tag02"})
public class CucumberRunnerTestTags extends AbstractTestNGCucumberTests {

}
