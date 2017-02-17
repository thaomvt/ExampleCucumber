package com.axonactive.pages;

import org.junit.Assert;

import com.axonactive.pages.Person.NewNaturalPersonPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;

public class MainPage extends PageObject{

	@FindBy(xpath=".//div[@view_id='newNaturalPerson']")
    private WebElementFacade newNaturalPerson;

    @FindBy(xpath=".//div[@view_id='newJuristicPerson']")
    private WebElementFacade newJuristicPerson;
    
    @FindBy(xpath=".//div[@view_id='newGroupPerson']")
    private WebElementFacade newGroupPerson;
    
    @FindBy(xpath=".//*[@id='main-nav']/div/div/a")
    private WebElementFacade mainMenu;
    
    @FindBy(xpath=".//*[@view_id='searchText']//input")
    private WebElementFacade searchTextBox;
    
    @FindBy(xpath=".//*[@view_id='personSearchResult']//*[@role='rowgroup']/div[3]/child::div")
    private WebElementFacade resultGrid;
    
    @WhenPageOpens
    public void waitUntilMenuNewNaturalAppears() {
        element(mainMenu).waitUntilVisible();
        /*mainMenu.click();
        element(newNaturalPerson).waitUntilVisible();*/
    }
   
    public void click_on_new_natural(){
    	newNaturalPerson.click();
    	NewNaturalPersonPage newNaturalPersonPage = this.switchToPage(NewNaturalPersonPage.class);
    	newNaturalPersonPage.open();
    }
    
    public void click_on_new_juristic(){
    	newJuristicPerson.click();
    }
    
    public void click_on_new_group(){
    	newGroupPerson.click();
    }

	public void enter_keyword_and_press_enter(String keyword) {
		element(searchTextBox).typeAndEnter(keyword);
	}

	public void grid_contains_keyword(String keyword){
		Assert.assertTrue(element(resultGrid).getText().contains(keyword));
	}
	
	public void open_person_from_search_grid(String person){
	}
}
