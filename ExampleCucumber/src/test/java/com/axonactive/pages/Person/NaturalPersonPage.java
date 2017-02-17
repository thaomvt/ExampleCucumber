package com.axonactive.pages.Person;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;
import net.thucydides.core.annotations.WhenPageOpens;

@NamedUrls({
		    @NamedUrl(name = "edit.naturalperson", url = "http://localhost:49123/#/person/natural/edit/{1}")
		  })
public class NaturalPersonPage extends PageObject{

	@FindBy(xpath=".//div[@id='naturalPersonal']")
	private WebElementFacade naturalPersonalArea;
	
	@FindBy(xpath=".//*[@id='formArea_naturalPersonal']//*[@view_id='OrganisationUnit']//child::div[1]")
	private WebElementFacade organisationUnit;
	
	@FindBy(xpath=".//*[@id='formArea_naturalPersonal']//*[@view_id='Name']/div/input")
	private WebElementFacade nameField;
	
	@FindBy(xpath=".//*[@id='object-detail']//main-bar//title-bar/div/div[2]/div/span[2]")
	private WebElementFacade saveButton;
	
	@FindBy(xpath=".//*[@id='object-detail']/div/div/div[2]/main-bar/div/div/title-bar/div/div[2]/div/span[3]")
	private WebElementFacade closeButton;
	
	@FindBy(xpath=".//*[@webix-ui='itemlist']//*[@view_id='openItemList']//*[contains(@class, 'itemlist_item_table')]")
	private WebElementFacade openedItemList;
	
	@WhenPageOpens
    public void waitUntilPersonalAreaAppears() {
        //element(naturalPersonalArea).waitUntilVisible();
        element(nameField).waitUntilVisible();
    }
	
	
	
	public boolean is_natural_person_page(){
		return this.getDriver().getCurrentUrl().contains("http://localhost:49123/#/person/natural/edit");
	}
	
	public void open_natural_person_with_uid(String uid){
	}
	
	public void press_close_button(){
		element(closeButton).click();
	}
	
	public boolean is_opened_item_closed(String title){
		return element(openedItemList).isDisplayed();
	}
}
