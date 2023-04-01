package stepsDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;
import com.qa.util.HandlingException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps 
{
	private static String title;

	private LoginPage loginpage=new LoginPage(DriverFactory.getDriver());
	HandlingException hp=new HandlingException();
	
	@Given("user is in loginpage")
	public void user_is_in_loginpage() throws Throwable {
		Thread.sleep(2000);
	   DriverFactory.getDriver().get("https://instauat.neogrowth.in/");
	}

	@When("user gets title of page")
	public void user_gets_title_of_page() throws Throwable {
		Thread.sleep(2000);
	   title= DriverFactory.getDriver().getTitle();
	   Thread.sleep(2000);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitle) throws Throwable {
		Thread.sleep(2000);
	   Assert.assertTrue(title.contains(expectedTitle));
	}

	@When("user enters  mobile number {string}")
	public void user_enters_mobile_number(String int1) throws Throwable {
		Thread.sleep(2000);
		//loginpage.entermobilenumber(int1);
	loginpage.mobile_number().sendKeys(int1);
	  Thread.sleep(2000);
	}

	@When("click on check box")
	public void click_on_check_box() throws Throwable {
		Thread.sleep(2000);
	   loginpage.checkBox_agreement().click();
	   Thread.sleep(2000);
	}

	@When("click on Apply now button")
	public void click_on_apply_now_button() throws Throwable {
		Thread.sleep(2000);
	   loginpage.apply_now().click();
	   Thread.sleep(2000);
	}

	@Then("check Verify button is dispalyed")
	public void check_verify_button_is_dispalyed() throws Throwable {
		Thread.sleep(2000);
	  Assert.assertTrue(loginpage.verifyButton().isDisplayed());
	}


}
