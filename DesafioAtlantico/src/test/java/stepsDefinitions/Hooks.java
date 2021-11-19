package stepsDefinitions;


import baseClass.BaseSteps;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks {

	@Before
	public void BeforeAllTests() throws Throwable {
		BaseSteps.OpenBrowser();
		
	}
	
	@After
	public void AfterAllTests(Scenario _scenario) throws Throwable {
		BaseSteps.scenario = _scenario;
		if (BaseSteps.scenario.isFailed()) {
            BaseSteps.screenShotNow();
        }
//		Para executar o @smoke comentar o metodo abaixo.
		BaseSteps.CloseBrowser();
	}
}
