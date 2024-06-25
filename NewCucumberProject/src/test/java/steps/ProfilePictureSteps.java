package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfilePictureSteps {
	
	@Given("user is at the Home page")
	public void user_is_at_the_home_page() {

		System.out.println("Given statement");
	}

	@When("User clicks on the Avtar")
	public void user_clicks_on_the_avtar() {

		System.out.println("When statement for add image");
	}

	@When("User selects the image to upload")
	public void user_selects_the_image_to_upload() {

		System.out.println("When statement to select img for adding");
	}

	@Then("Profile Picture gets uploaded")
	public void profile_picture_gets_uploaded() {

		System.out.println("Then statement for add");
	}

	@When("User clicks on the edit Avtar")
	public void user_clicks_on_the_edit_avtar() {

		System.out.println("When statement for edit ");
	}

	@When("User update the Picture")
	public void user_update_the_picture() {

		System.out.println("When statement for select file for edit");
	}

	@Then("Picture profile gets updated")
	public void picture_profile_gets_updated() {

		System.out.println("Then statement for edit");
	}

	@When("User clicks on the delete profile Picture link")
	public void user_clicks_on_the_delete_profile_picture_link() {

		System.out.println("When statement for delete");
	}

	@When("User confirms delete Picture")
	public void user_confirms_delete_picture() {

		System.out.println("When statement for confim delete");
	}

	@Then("profile Picture gets deleted")
	public void profile_picture_gets_deleted() {

		System.out.println("Then statement for delete");
	}

}
