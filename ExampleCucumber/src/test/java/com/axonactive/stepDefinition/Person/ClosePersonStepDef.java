package com.axonactive.stepDefinition.Person;

import org.openqa.selenium.WebDriver;

import com.axonactive.stepsHelper.Person.PersonSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class ClosePersonStepDef {
	@Managed(driver = "firefox")
    WebDriver driver;
	
	@Steps
	PersonSteps personSteps;
	
	@Given("^I am openning a person named '([^\"]*)'$")
    public void i_am_openning_a_person_named(String uid){
		personSteps.open_person_with_uid(uid);
    }

	@When("^I press close button on the person$")
    public void i_press_close_button_on_the_person(){
		personSteps.press_close_button();
    }

    @Then("^Opened person '([^\"]*)' is closed$")
    public void opened_person_is_closed(String personName){
    	personSteps.has_object_header_title_name(personName);
    }
}
