package testes;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = {"pretty", "html:target/html/"}, 
	features = "src/test/resources/testes/features")
public class CucumberRunnerAllFeaturesTest extends AbstractTestNGCucumberTests {

}
