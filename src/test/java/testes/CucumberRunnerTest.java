package testes;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/html/"}, 
	features = "src/test/resources/testes",
	tags = {"@Application"})
public class CucumberRunnerTest {
}
