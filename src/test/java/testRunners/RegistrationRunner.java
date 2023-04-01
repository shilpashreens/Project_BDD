package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"./src/test/resources/AppFeatures/Registration.feature"},
		glue = {"stepsDefinitions"},
		plugin = {"pretty","json:target/cucumber-json/cucumber.json",
		"html:target/cucumber-reports.html"},
		monochrome = true
		
		)

public class RegistrationRunner 
{
	

}
