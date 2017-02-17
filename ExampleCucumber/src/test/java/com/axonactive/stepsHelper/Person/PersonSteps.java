package com.axonactive.stepsHelper.Person;


import org.junit.Assert;
import static org.hamcrest.Matchers.*;

import com.axonactive.pages.MainPage;
import com.axonactive.pages.Person.NaturalPersonPage;
import com.axonactive.pages.Person.NewNaturalPersonPage;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class PersonSteps extends ScenarioSteps{
	
	private static final long serialVersionUID = 1L;
	private MainPage mainPage;
	private NewNaturalPersonPage newNaturalPersonPage;
	private NaturalPersonPage naturalPersonPage;
	
	
	@Step
	public void go_to_the_home_page(){
		mainPage.open();
	}
	
	@Step
	public void open_menu_new_natural(){
		mainPage.click_on_new_natural();
	}
	
	@Step
	public void select_organisation_unit(){
		newNaturalPersonPage.select_organisation_unit();
	}
	
	@Step
	public void enter_name(String value){
		newNaturalPersonPage.enter_name_field(value);
	}
	
	@Step
	public void click_save_person(){
		newNaturalPersonPage.press_save();
	}
	
	@Step
	public void natural_person_page_display(){
		Assert.assertTrue(naturalPersonPage.is_natural_person_page());
	}
	
	@Step
	public void enter_keyword_and_press_enter(String keyword) {
		mainPage.enter_keyword_and_press_enter(keyword);
	}
	
	@Step
	public void grid_contains_keyword(String keyword) {
		mainPage.grid_contains_keyword(keyword);
	}
	
	@Step
	public void open_person_with_uid(String uid ) {
		naturalPersonPage.open("edit.naturalperson", PageObject.withParameters(uid));
	}
	@Step
	public void press_close_button() {
		naturalPersonPage.press_close_button();
	}
	@Step
	public void has_object_header_title_name(String personName) {
		boolean temp = naturalPersonPage.is_opened_item_closed(personName);
		Assert.assertThat(temp, is(false));
	}
}
