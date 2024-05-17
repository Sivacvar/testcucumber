package StepsPackage;

import io.cucumber.java.en.*;

public class StepClass {
	
	@Given("I am on login page")
	public void i_am_on_login_page() {
	    System.out.println("Given section");
	}
	@When("I have entered username and password #set of actions")
	public void i_have_entered_username_and_password_set_of_actions() {
		System.out.println("When section");
	}
	@When("I have clicked login btn")
	public void i_have_clicked_login_btn() {
		System.out.println("And section");
	}
	@Then("Validate the successful msg #Validation, assetion")
	public void validate_the_successful_msg_validation_assetion() {
		System.out.println("Then section");
	}

}
