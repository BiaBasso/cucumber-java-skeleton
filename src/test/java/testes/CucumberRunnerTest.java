package testes;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = {"pretty", "html:target/html/"}, 
	features = "src/test/resources/testes/features",
	tags = {"@Application, @Server"})
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {

}
