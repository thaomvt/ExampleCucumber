@search
Feature: Open an education

  @search
  Scenario: Close a person
    Given I am openning a person named '6b15a2f9-7c26-4328-9d8b-5eff600a8434'
    When I press close button on the person
    Then Opened person 'thao_test_1' is closed
    
   @search @ignore
	  Scenario: Search person
	    Given I am on homepage
	    When I enter keyword 'thao_test_1' on search textbox and press enter
	    Then result grid is displayed containing 'thao_test_1'
