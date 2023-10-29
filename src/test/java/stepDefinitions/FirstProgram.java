package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstProgram {

	@Given("user is on the Netbanking landing page")
	public void user_is_on_the_netbanking_landing_page() {
	    System.out.println("user landed on netbanking page");
	}
	@When("User login to application with {string} and password {string}")
	public void user_login_to_application_with_and_password(String username, String password) {
	  
	   System.out.println(username +" and password is "+password);
	}
	
	@When("user signup into application")
	public void user_signup_into_application(List<String> data) {
	  
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
		
	}
	
	@Then("Home page is displayed")
	public void home_page_is_displayed() {
	    
		System.out.println("Home page is displayed");
	}
	@Then("Cards are displayed")
	public void cards_are_displayed() {
		
		System.out.println("Cards are displayed");
	}
	
}
