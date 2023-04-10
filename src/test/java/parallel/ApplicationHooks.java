package parallel;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks 
{
	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	private Properties prop;
	
	
	@Before(order = 0)
	
	public void getproperty() 
	{
		configReader=new ConfigReader();
		prop=configReader.init_prop();
	}
	
	@Before(order = 1)
	public void launchbrowser()
	{
		String browserName=prop.getProperty("browser");
		driverFactory=new DriverFactory();
		driver=driverFactory.init_driver(browserName);
		//driver.manage().window().maximize();
	}
	
	@After(order = 0)

	public void quitBrowser() 
	{
		driver.quit();
		
	}

	@After(order = 1)
	public void tearDown(Scenario scenario)
	{
		if (scenario.isFailed())
		{
			String screenshotname=scenario.getName().replaceAll(" ", "_");
			byte[] sourcepath=((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcepath, "image/png", screenshotname);
		}
	        
	}
}
