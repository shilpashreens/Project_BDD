package stepsDefinitions;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registration 
{
	
	@Given("user on registration page")
	public void user_on_registration_page() {
	   System.out.println("User is in REgistration page");
	}

	@When("user enters following data")
	public void user_enters_following_data(DataTable dataTable) 
	{
        List<List<String>> userData = dataTable.asLists(String.class);
        for (List<String> e : userData) 
        {
        	System.out.println(e);
			
		}
	   
	}

	@Then("Registration is done successfull")
	public void registration_is_done_successfull() {
	  System.out.println("User did registration successfully");
	}

	@When("user enter following user deatils with coloumn")
	public void user_enter_following_user_deatils_with_coloumn(DataTable dataTable)
	{
		List<Map<String, String>> userList = dataTable.asMaps(String.class,String.class);
		System.out.println(userList);
		System.out.println(userList.get(0).get("Firstname"));
		for (Map<String, String> map : userList)
		{
			System.out.println(map.get("Firstname"));
			System.out.println(map.get("Lastname"));
			System.out.println(map.get("Email"));
			System.out.println(map.get("pincode"));
			System.out.println(map.get("Location"));
			
		}
	   
	}

}
