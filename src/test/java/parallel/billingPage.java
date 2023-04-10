package parallel;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class billingPage 
{
	double billingAmount;
	double taxAmount;
	double finalAmount;
	
	@Given("user is on billing page")
	public void user_is_on_billing_page() {
	  
	}

	@When("user enters billing amount {string}")
	public void user_enters_billing_amount(String billingAmount) 
	{
	   this.billingAmount=Double.parseDouble(billingAmount);
	}
	
	
/*tax amount*/
	@When("user enters taxamount {string}")
	public void user_enters_taxamount(String taxAmount) 
	{
		this.taxAmount=Double.parseDouble(taxAmount);
	    
	}

	
	@When("user clicks on calculateAmount")
	public void user_clicks_on_calculate_amount() {
	    
	}
	
	/*
	 Final amount
	 */
	
	@Then("it gives final amount {string}")
	public void it_gives_final_amount(String finalAmount)
	{
		this.finalAmount=this.billingAmount+this.taxAmount;
	    Assert.assertTrue(this.finalAmount == Double.parseDouble(finalAmount));
	}

	
}
