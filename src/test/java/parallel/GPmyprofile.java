package parallel;

import static org.testng.Assert.assertTrue;

import com.pages.GpLoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.*;

public class GPmyprofile 
{
	
	 GpLoginPage gpLogin=new GpLoginPage(DriverFactory.getDriver());
	
	@Given("Login to Gp using mobile number {string}")
	public void login_to_gp_using_mobile_number(String int1) throws InterruptedException 
	{
		DriverFactory.getDriver().get("https://growthpartneruat.neogrowth.in/");
		gpLogin.mobileNUmberField().sendKeys(int1);
		gpLogin.getOTP_continue().click();
		Thread.sleep(2000);
	
	}

	@When("user enter OTP {string}")
	public void user_enter_otp(String int1) throws Throwable 
	{
		gpLogin.OTPfield().sendKeys(int1);
		
		
	}

	@When("user clicks on continue button")
	public void user_clicks_on_continue_button() throws Throwable
	{
		gpLogin.getOTP_continue().click();
		Thread.sleep(20000);
	}

	@Then("user lands on Myprofile page")
	public void user_lands_on_myprofile_page()
	{
		assertTrue(gpLogin.panfield().isDisplayed(), "User landed on My profile page");
	}

}
