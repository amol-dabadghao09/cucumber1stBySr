package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileSteps {
	
	@Given("User is at the Home page")
	public void user_is_at_the_home_page() {
	    
		System.out.println("Given Statement");
	}

	@When("User clicks on the add profile button")
	public void user_clicks_on_the_add_profile_button() {

		System.out.println("When statement for add profile");
	}

	@When("User provides the information")
	public void user_provides_the_information() {

		System.out.println("When statement for adding information");
	}

	@Then("Profile gets created")
	public void profile_gets_created() {

		System.out.println("Then statement for add profile");
	}

	@When("User clicks on the edit profile link")
	public void user_clicks_on_the_edit_profile_link() {

		System.out.println("When statement for edit profile");
	}

	@When("User update the information")
	public void user_update_the_information() {

		System.out.println("When statement for update profile");
	}

	@Then("profile gets updated")
	public void profile_gets_updated() {
		
		System.out.println("Then statement for update profile");
	}

	@When("User clicks on the delete profile link")
	public void user_clicks_on_the_delete_profile_link() {

		System.out.println("When statement for delete profile");
	}

	@When("User confirms delete")
	public void user_confirms_delete() {

		System.out.println("When statement for confirm Delete profile");
	}

	@Then("profile gets deleted")
	public void profile_gets_deleted() {

		System.out.println("Then Statement for delete profile");
	}
	
	
}
