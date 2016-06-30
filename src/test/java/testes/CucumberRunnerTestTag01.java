package testes;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = {"pretty", "html:target/html/"}, 
	features = "src/test/resources/testes/features",
	tags = {"@Tag01"})
public class CucumberRunnerTestTag01 extends AbstractTestNGCucumberTests {

}
