package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", // Path: features = "classpath:features"
		glue = "stepsDefinitions", 			// Path: Steps
		tags = "@smoke", 			// Tags dos cenarios cucumber
		plugin = { 							// Plugins Cucumber para possivel integracao com Jenkins
				"pretty", 
				"html:target/cucumber-reports", 
				"junit:target/cucumber-reports/cucumber.xml",
				"json:target/cucumber-reports/cucumber.json" }, 
		monochrome = true, 					// Cores no Terminal default: false
		snippets = SnippetType.CAMELCASE, 	// METHODOS do Steps em CAMELCASE
		strict = true, 						// Considerar steps indefinidos erros ou nao, default: false
		dryRun = false 						// Validar Steps sem executar o teste
)
		

public class RunnerCucumber {

}
