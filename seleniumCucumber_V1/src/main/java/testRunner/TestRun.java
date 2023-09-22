package testRunner;

import org.junit.runner.RunWith;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)

@CucumberOptions
		(
				features=".//feature/Login.feature",
				glue="stepDefinations",
				monochrome=true,
				plugin= {"pretty","html:test-output"}
								
				)

public class TestRun {

	
}
