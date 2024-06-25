package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("User is at login Page")
	public void user_is_at_login_screen() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("Given statement");
	}

	@When("Users enters username")
	public void users_enters_username() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("When statement for username");
	}

	@When("Users enters password")
	public void users_enters_password() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("When statement for password");
	}

	@When("Users clicks on login button")
	public void users_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("When statement for login Button");
	
	}

	@Then("User should get redirect to Home Page")
	public void user_should_get_redirect_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("Then statement for Home Page");
	
	}
	
	@When("User get the Title of page")
	public void user_get_the_title_of_page() {

		System.out.println("When statement for title of Page");
	}

	@Then("Page title should be verified")
	public void page_title_should_be_verified() {

		System.out.println("Then statement for title page verification");
	}
	
	

}
