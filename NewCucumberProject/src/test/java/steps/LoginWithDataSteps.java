package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithDataSteps {
	
	@Given("User is at login page")
	public void user_is_at_login_page() {

		System.out.println("Given statement login with data");
	}

	@When("users enters userName As {string}")
	public void users_enters_user_name_as(String value) {

		System.out.println("When statement with username" +value);
	}

	@When("users enters Password As {string}")
	public void users_enters_password_as(String value) {

		System.out.println("When statement with password" +value);
	}

	@When("user click on Login Button")
	public void user_click_on_login_button() {

		System.out.println("when statement to click on login button");
	}

	@Then("user should get logined in to app")
	public void user_should_get_logined_in_to_app() {

		System.out.println("Then statement login with data");
	}
	
	

}
