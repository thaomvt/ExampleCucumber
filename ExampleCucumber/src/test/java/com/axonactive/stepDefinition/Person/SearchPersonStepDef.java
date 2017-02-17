package com.axonactive.stepDefinition.Person;

import javax.validation.constraints.AssertTrue;

import com.axonactive.stepsHelper.Person.PersonSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import net.thucydides.core.annotations.Steps;

public class SearchPersonStepDef {
	
	@Steps
	PersonSteps personSteps;

	@When("^I enter keyword '([^\"]*)' on search textbox and press enter$")
    public void i_enter_keyword_on_search_textbox_and_press_enter(String keyword){
		personSteps.enter_keyword_and_press_enter(keyword);
    }

	@Then("^result grid is displayed containing '([^\"]*)'$")
    public void result_grid_is_displayed_containing(String keyword) {
    	personSteps.grid_contains_keyword(keyword);
    }
}
