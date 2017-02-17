package com.axonactive.pages.Person;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;

@DefaultUrl("http://localhost:49123/#/person/natural/create")
public class NewNaturalPersonPage extends PageObject{

	@FindBy(xpath=".//div[@id='naturalPersonal']")
	private WebElementFacade naturalPersonalArea;
	
	@FindBy(xpath=".//*[@id='formArea_naturalPersonal']//*[@view_id='OrganisationUnit']//child::div[1]")
	private WebElementFacade organisationUnit;
	
	@FindBy(xpath=".//div[contains(@class, 'webix_multilist')]//child::div[1]")
	private WebElementFacade selectedOrganisationUnit;
	
	@FindBy(xpath=".//*[contains(@class, 'customMulticomboDialog')]//*[contains(@class, 'webix_el_button')]//child::button")
	private WebElementFacade selectBtn;
	
	@FindBy(xpath=".//*[@id='formArea_naturalPersonal']//*[@view_id='Name']/div/input")
	private WebElementFacade nameField;
	
	@FindBy(xpath=".//*[@id='object-detail']//main-bar//title-bar/div/div[2]/div/span[2]")
	private WebElementFacade saveButton;
	
	@WhenPageOpens
    public void waitUntilPersonalAreaAppears() {
        element(naturalPersonalArea).waitUntilVisible();
    }
	
	public void enter_name_field(String value){
		element(nameField).typeAndEnter(value);
	}
	
	public void select_organisation_unit(){
		organisationUnit.click();
		element(selectedOrganisationUnit).click();
		element(selectBtn).click();
	}
	
	public void press_save(){
		element(saveButton).click();
		NaturalPersonPage naturalPersonPage = this.switchToPage(NaturalPersonPage.class);
		naturalPersonPage.open();
	}
}
