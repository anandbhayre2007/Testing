package testDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() throws Throwable {
	    System.out.println("Given Anand");
	}

	@When("^I complete action$")
	public void i_complete_action() throws Throwable {
	   System.out.println("When Anand");
	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() throws Throwable {
	    System.out.println("Then Anand");
	}
}
