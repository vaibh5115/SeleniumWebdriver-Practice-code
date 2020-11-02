package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksStepDefinition 
{
	@Before
	public void Setup()
	{
		System.out.println("launch chrome browser");
		System.out.println("Enter URL");
	}
	
	@After
	public void SetupClosed()
	{
		System.out.println("browser closed successfully");
	}
	
	@Given("^user is on add cutomer page$")
	public void user_is_on_add_cutomer_page() throws Throwable 
	{
	    System.out.println("user is on cutomer page..");
	}

	@When("^user fills the customer details$")
	public void user_fills_the_customer_details() throws Throwable {
		System.out.println("user fills the customer details..");
	}

	@Then("^customer is added successfully$")
	public void customer_is_added_successfully() throws Throwable {
		System.out.println("user fills the customer details..");
	}

	@Given("^user is on Edit cutomer page$")
	public void user_is_on_Edit_cutomer_page() throws Throwable {
		System.out.println("user is on Edit cutomer page..");
	}

	@When("^user edit the customer contact detail$")
	public void user_edit_the_customer_contact_detail() throws Throwable {
		System.out.println("user edit the customer contact details..");
	}

	@Then("^customer contact details updated successfully$")
	public void customer_contact_details_updated_successfully() throws Throwable {
		System.out.println("customer contact details updated successfully..");
	}

	@Given("^user is on delete cutomer page$")
	public void user_is_on_delete_cutomer_page() throws Throwable {
		System.out.println("user is on delete cutomer page..");
	}

	@When("^user delete the customer details$")
	public void user_delete_the_customer_details() throws Throwable {
		System.out.println("user delete the customer details..");
	}

	@Then("^customer is deleted successfully$")
	public void customer_is_deleted_successfully() throws Throwable {
		System.out.println("customer is deleted successfully..");
	}
	
}
