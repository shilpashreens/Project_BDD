package parallel;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"@rerunFolder/failrerun.txt"},
		glue = {"paralle" },
		plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:rerunFolder/failrerun.txt",
				"json:target/cucumber-json/cucumber.json",
				"html:target/cucumber-reports.html",
				
					},
		monochrome = true
		)

public class FailureRerun extends AbstractTestNGCucumberTests
{

	
@Override
@DataProvider(parallel=true)
public Object[][] scenarios() {
	// TODO Auto-generated method stub
	return super.scenarios();
}


}
