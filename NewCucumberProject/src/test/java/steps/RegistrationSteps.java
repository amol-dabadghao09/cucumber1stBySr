package steps;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSteps {
	
	@Given("User should be at Registration page")
	public void user_should_be_at_registration_page() {

		System.out.println("Given statement");
	}

	@When("User enters the following data")
	public void user_enters_the_following_data(DataTable dataTable) {

		List<List<String>> data = dataTable.asLists(String.class);
		
		List<String> secondIndexString = data.get(1);
		//String lastName = secondIndexString.get(1);
		//System.out.println(lastName);
		
		System.out.println(secondIndexString);
				
		for(int i=0; i<secondIndexString.size(); i++)
		{
			System.out.println(secondIndexString.get(i));
		}
		
		
	}

	@Then("User gets registration confirmation")
	public void user_gets_registration_confirmation() {

		System.out.println("Then statement ");
	}

}
