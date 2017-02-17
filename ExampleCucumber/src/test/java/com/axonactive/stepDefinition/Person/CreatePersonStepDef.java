package com.axonactive.stepDefinition.Person;

import com.axonactive.stepsHelper.Person.PersonSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CreatePersonStepDef {
	
	@Steps
	PersonSteps personSteps;
	
	@Given("^I am on homepage$")
	public void i_am_on_homepage(){
		personSteps.go_to_the_home_page();
	}
	
	@Given("^I open the new person page$")
	public void i_open_the_new_person_page(){
	    personSteps.open_menu_new_natural();
	}

	@When("^enter the required field organisation unit")
	public void enter_the_required_field_organisation_unit() {
		personSteps.select_organisation_unit();
	}

	@When("^enter the name field '(.*)'")
	public void enter_the_name_field(String value) {
		personSteps.enter_name(value);
	}

	@When("^I Click Save$")
	public void i_Click_Save(){
		personSteps.click_save_person();
	}

	@Then("^New person page is displayed$")
	public void new_person_page_is_displayed(){
		personSteps.natural_person_page_display();
	}

	@Then("^Person data is inserted into the database$")
	public void person_data_is_inserted_into_the_database(){
	}

}
