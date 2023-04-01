package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AppFeatures"},
		glue = {"stepsDefinitions", "myHooks"},
		plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				
				"json:target/cucumber-json/cucumber.json",
				"html:target/cucumber-reports.html"},
		monochrome = true
		)
public class LoginRunner 
{
	

}
