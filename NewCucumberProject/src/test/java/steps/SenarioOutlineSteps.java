package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SenarioOutlineSteps {
	
	@Given("User is at Signup page")
	public void user_is_at_signup_page() {

		System.out.println("Given Statement");
	}

	@When("User enters {string} on form")
	public void user_enters_on_form(String name) {
	    
		System.out.println("When Statement for name ->" +name);
	}

	@When("User enters {string} inside form")
	public void user_enters_inside_form(String age) {
	    
		System.out.println("When statement for age ->" +age);
	}

	@When("User confirms {string} on the form")
	public void user_confirms_on_the_form(String gender) {
		
		System.out.println("When statement for Gender ->" +gender);
	}
	
	
	
}
