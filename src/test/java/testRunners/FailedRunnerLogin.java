package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"@rerunFolder/failrerun.txt"},
		glue = {"stepsDefinitions", "myHooks"},
		plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				
				"json:target/cucumber-json/cucumber.json",
				"html:target/cucumber-reports.html",
				"rerun:rerunFolder/failrerun.txt"
				
				},
		monochrome = true
		)
public class FailedRunnerLogin {

}
