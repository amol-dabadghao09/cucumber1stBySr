package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrdersSteps {
	
	@Given("User should be logined In to application")
	public void user_should_be_logined_in_to_application() {
	    
		System.out.println("Given statement for login");
	}

	@When("User clicks on orders link")
	public void user_clicks_on_orders_link() {
	    
		System.out.println("When statement to click on order link");
	}

	@Then("User should redirected to orders page")
	public void user_should_redirected_to_orders_page() {


		System.out.println("Then statement for redirection to order page");
	}

	@When("user click on the past orders button")
	public void user_click_on_the_past_orders_button() {

		System.out.println("When statement for Past orders");
	}

	@Then("user should able to see the past order information")
	public void user_should_able_to_see_the_past_order_information() {
		   
		System.out.println("Then statement for past order information");
	}

	@When("user click on the current orders button")
	public void user_click_on_the_current_orders_button() {

		System.out.println("When statement for current order");
	}

	@Then("user should able to see current placed order information")
	public void user_should_able_to_see_current_placed_order_information() {
	    
		System.out.println("Then Statement for current order information");
	}
	
	

}
